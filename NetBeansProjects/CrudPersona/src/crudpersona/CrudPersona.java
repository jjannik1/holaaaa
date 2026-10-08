/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crudpersona;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



/**
 * Antajos rapidos
 *- do + tab hace la estruct do while
 *- sout + +tab hace System.out.println("");
 *- public para metodos publicos con private para
 * datos privados que solo se pueden modificar mediante
 * sus metodos que dejan
 * -fore + tab hace foreach creo
 * 
 */


/**
 *
 * @author usuario
 */
public class CrudPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
        LeerData(listaAlumnos);
        int opcion=-1;
        
        do {
            System.out.println("-----Menu----");
            System.out.println("1. Listar Alumnos");
            System.out.println("2. Nuevo Alumno");
            System.out.println("3. Modificar Alumno");
            System.out.println("4. Eliminiar Alumno");
            System.out.println("5. Media Alumnos");
            System.out.println("0. Salir");
            System.out.println("Introduce opcion: ");
            opcion=teclado.nextInt();
            
            switch (opcion) {
                case 1:
                        Listar(listaAlumnos);
                    break;
                    
                case 2:
                    Alta(listaAlumnos,teclado);
                    GrabarData(listaAlumnos);
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 0:
                    break;
                
                default:
                    System.out.println("Opcion no valido.");
            }
            
            
        } while (opcion!=0);
    }

    private static void LeerData(ArrayList<Alumno> listaAlumnos) {
        File fichero = new File("ficheroDatosPrimi.dat");
                        FileInputStream fisFichero;
        try {
            fisFichero = new FileInputStream(fichero);
            DataInputStream disFichero = new DataInputStream(fisFichero);
            
            String nombre;
            int edad;
            double nota;
            boolean repe;
            
            while(disFichero.available()>0){
                nombre = disFichero.readUTF();
                edad=disFichero.readInt();
                nota=disFichero.readDouble();
                repe=disFichero.readBoolean();
                Alumno nuevo = new Alumno(nombre,edad,nota,repe);
                listaAlumnos.add(nuevo);
                
            }
            disFichero.close();
            fisFichero.close();
            
        } catch (FileNotFoundException ex) {
            System.getLogger(CrudPersona.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Fichero inexistente.");
        } catch (IOException ex) {
            System.getLogger(CrudPersona.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Error en la E/S");
        }
        
        
        
        }

    private static void Listar(ArrayList<Alumno> listaAlumnos) {
        if (!listaAlumnos.isEmpty()){
            for (Alumno alumno : listaAlumnos) {
                System.out.println(alumno.toString());
            }
        }else{
            System.out.println("No hay alumnos");
        }
    }

    private static void Alta(ArrayList<Alumno> listaAlumnos, Scanner teclado) {
        String nombre;
        int edad;
        double nota;
        boolean repe;
        teclado.nextLine();
        System.out.println("Dime Nombre del alumno:");
        nombre=teclado.nextLine();
        
        System.out.println("Dime Edad del alumno:");
        edad=teclado.nextInt();
        
        System.out.println("Dime la Nota Acceso del alumno:");
        nota=teclado.nextDouble();
        
        System.out.println("Dime si es repetidor :");
        repe=teclado.nextBoolean(); 
        
        Alumno nuevo=new Alumno(nombre,edad,nota,repe);
        listaAlumnos.add(nuevo);
        System.out.println("Alumno añadido con exito.");
    }

    private static void GrabarData(ArrayList<Alumno> listaAlumnos) {
        File fichero = new File("ficheroDatosPrimi.dat");
        try {
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            for (Alumno alumno : listaAlumnos) {
                dos.writeUTF(alumno.getNombre());
                dos.writeInt(alumno.getEdad());
                dos.writeDouble(alumno.getNotaAD());
                dos.writeBoolean(alumno.isRepetidor());
                
                
            }
            dos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.getLogger(CrudPersona.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.getLogger(CrudPersona.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }
    
}
