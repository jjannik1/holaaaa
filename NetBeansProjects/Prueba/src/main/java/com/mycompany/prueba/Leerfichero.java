import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.io.File;



public class Leerfichero {
    public static final String RUTA_FICHERO = "./src/leerficherojannik/info.txt";
    
    	public static void main(String[] args) {
            try {   System.out.println("Ruta absoluta: " + rutaAbsoluta);
                FileReader fr = new FileReader(RUTA_FICHERO);
             
                
                String rutaAbsoluta = new File(".").getAbsolutePath();
                System.out.println("Ruta absoluta: " + rutaAbsoluta);
                FileReader fr = new FileReader(RUTA_FICHERO);
                BufferedReader br = new BufferedReader(fr);
                
                String linea;
                
                while ((linea = br.readLine()) !=null) {
                    System.out.println(linea);
                }
                
                br.close();
                fr.close();
                                
		} catch (FileNotFoundException fnfe) {
			System.err.println("No se encuentra el fichero.");
		} catch (IOException ioe) {
        		System.err.println("Error de E/S.");
                }

        }
}