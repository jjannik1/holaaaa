/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebadecosas;

/**
 *
 * @author usuario
 */
public class PruebaDeCosas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Para meter los argumentos tenemos que dar en las propiedades del proyecto
        
        if (args.length!=3){
            System.out.println("Error");

            
        }
        
        else {
            System.out.println("Primer argumento "+args[0]);
            System.out.println("Segundo argumento "+args[1]);
            System.out.println("Tercer argumento "+args[2]);
        }
    }
    
}
