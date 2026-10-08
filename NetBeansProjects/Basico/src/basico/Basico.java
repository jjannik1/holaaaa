/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basico;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Basico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Con el scanner para coger la informacion y sacarlo en un println?
        //Se puede meter esa informacion en una variable con la ayuda del scanner.nextLine() 
        //como ejemplo para el string, nextInt() (creo que es asi) para guardar el int de ese input
        
        
        
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el nombre del fichero: ");
        
        String nombre = scanner.nextLine();
    
        //System.out.println(nombre);
        
        System.out.print("Introduce la linea de que quieres que tenga el fichero: ");
        
        String content = scanner.nextLine();
        
        //System.out.println(content);
        
        
        
        
    
    }
}
