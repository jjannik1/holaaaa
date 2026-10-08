/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficherostextocoches;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author i5 nuevo
 */
public class FicherosTextoCoches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Coche> listaCoches = new ArrayList<>();
       // LeerFichero(listaCoches);
       LeerObjetos(listaCoches);
        int opcion=-1;
        
        do {
            System.out.println("------MENU-----");
            System.out.println("1...Listar Coches");
            System.out.println("2...Nuevo Coche");
            System.out.println("3...Borrar Coche");
            System.out.println("4...Modificar Coche (NO LO HAGO)");
            System.out.println("0...Salir");
            System.out.println("Dime opcion:");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1:
                    listar(listaCoches);
                break;
                 case 2:
                     alta(listaCoches,teclado);
                    // grabar(listaCoches); //flujo de texto
                     grabarObjetos(listaCoches);
                break; 
                 case 3:
                     borrar(listaCoches,teclado);
                    // grabar(listaCoches);    //flujo de texto
                       grabarObjetos(listaCoches);
                break;
                 case 4:
                break;
                 case 0:
                     System.out.println("Adios!!!");
                break;
                 default :
                     System.out.println("Opcion incorrecta!!!");
                break;
            }
        } while (opcion!=0);
    }

    private static void listar(ArrayList<Coche> listaCoches) {
        if  (listaCoches.isEmpty()){
            System.out.println("No hay coches");
        }else{
            for (int i = 0; i < listaCoches.size(); i++) {
                System.out.println(i+": "+listaCoches.get(i).toString());
            }
        }
       }

    private static void alta(ArrayList<Coche> listaCoches, Scanner teclado) {
        String marca,modelo;
        int kms;
        teclado.nextLine();
        System.out.println("Dime marca:");
        marca=teclado.nextLine();
        System.out.println("Dime modelo:");
        modelo=teclado.nextLine();
        System.out.println("Dime kms:");
        kms=teclado.nextInt();
        Coche nuevo= new Coche(marca,modelo,kms);
        listaCoches.add(nuevo);
        System.out.println("Coche dado de alta correctamente!!!");
        
          }

    private static void borrar(ArrayList<Coche> listaCoches, Scanner teclado) {
           listar(listaCoches);
           int pos;
           System.out.println("Dime pos a borrar:");
           pos=teclado.nextInt();
           listaCoches.remove(pos);
           System.out.println("Coche borrado con exito");
           
        }

    private static void LeerFichero(ArrayList<Coche> listaCoches) {
        File fichero= new File("ficheroCoches.txt");
        String marca,modelo;
        int kms;
        
        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br= new BufferedReader(fr);    //flujo para leer linea a linea
            String linea="";
            do {
                linea= br.readLine();   //llamo al flujo de leer linea a linea y leo una linea
                if (linea!=null){
                    String[] partes = linea.split(":");
                    marca=partes[0];
                    modelo=partes[1];
                    kms=Integer.parseInt(partes[2]);  // hago la conversion de String a int
                    Coche cocheLeido=new Coche(marca,modelo,kms);
                    listaCoches.add(cocheLeido);
                }
            } while (linea!=null);
            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero No encontrado!!!");
        } catch (IOException ex) {
            System.out.println("Error en la entrada/salida");
        }
        }

    private static void grabar(ArrayList<Coche> listaCoches) {
        File fichero= new File("ficheroCoches.txt");
        String linea,marca,modelo;
        int kms;
        try {
            FileWriter fw= new FileWriter(fichero);
            BufferedWriter bw= new BufferedWriter(fw);
            for (int i = 0; i < listaCoches.size(); i++) {
                linea="";
                marca=listaCoches.get(i).getMarca();
                modelo=listaCoches.get(i).getModelo();
                kms=listaCoches.get(i).getKms();
                linea=linea+marca+":"+modelo+":"+kms;
                bw.write(linea);
                bw.newLine();
            }//for
            bw.close();
            fw.close();
        } catch (IOException ex) {
            System.out.println("Error en la E/s");
        }
         }

    private static void LeerObjetos(ArrayList<Coche> listaCoches) {
        File fichero = new File("coches.dat");
        try {
            FileInputStream fis = new FileInputStream(fichero); //flujo binario
            ObjectInputStream ois= new ObjectInputStream(fis); // flujo para leer objetos
            while(fis.available()>0){   // mietras queden bytes....
                Coche coche = (Coche) ois.readObject();
                listaCoches.add(coche);
            }
            ois.close();
            fis.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado");
        } catch (IOException ex) {
            System.out.println("Error en la e/s");
        } catch (ClassNotFoundException ex) {
            System.out.println("Clase no reconocida");
        }
        
        
         }

    private static void grabarObjetos(ArrayList<Coche> listaCoches) {
         File fichero = new File("coches.dat");
        try {
            FileOutputStream fos = new FileOutputStream(fichero); //flujo de escritura de bytes
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            for (Coche coche : listaCoches) {
                oos.writeObject(coche);
            }
            oos.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Fichero no encontrado!!!!");
        } catch (IOException ex) {
            System.out.println("Error en la e/s");
        }
         
        }
    
}
