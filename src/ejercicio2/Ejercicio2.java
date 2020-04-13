package ejercicio2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * En esta clase llamada Ejercicio2 vamos a Crear un programa que contenga el siguiente menú
 * 
 * 1  copiar fichero ,2  borrar fichero , 3 Mostrar tamaño de fichero
 * 
 * @author Jose
 *
 */


public class Ejercicio2 {

	/**
	 * 
	 * @param aqui tenemos el metodo main donde vamos a tener el menu que nos pedian en el enunciado
	 * y donde vamos a aplicar los metodos creados
	 */
	
	
	public static void main(String[] args) {
		
		
		/**
		 * Aqui tenemos las variables que vamos a utilizar, junto con su ruta con su ubicacion
		 * y despues tenemos el menu
		 */
		
		
		Scanner sn = new Scanner(System.in);
		String ficheroOriginal ="C:\\Users\\Jose\\Desktop\\prueba2tema8.txt";
		String ficheroDestino ="C:\\Users\\Jose\\Desktop\\prueba18tema71.txt";
		File ficheroBorrado = new File ("C:\\Users\\Jose\\Desktop\\prueba18tema71.txt");
		String ficheroTamaño = "";
        boolean salir = false;
        int opcion;
 
        while (!salir) {
 
            System.out.println("1. Opcion 1: Copiar fichero");
            System.out.println("2. Opcion 2: Borrar fichero");
            System.out.println("3. Opcion 3: mostrar tamaño del fichero");
            System.out.println("4. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado Copiar fichero");
                        
                        copiar(ficheroOriginal,  ficheroDestino);
                        
                        
                        break;
                    case 2:
                        System.out.println("Has seleccionado borrar fichero");
                        
                        borrar(ficheroBorrado);
                        
                        break;
                    case 3:
                        System.out.println("Has seleccionado Mostrar el tamaño del fichero");
                        
                        MostrarTamaño(ficheroTamaño);
                        
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Introduce un numero valido");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }

	}
	
	/**
	 * 
	 * Aqui tenemos el metodo copiar que será la opcion 1
	 * 
	 * copiará el fichero binario original a la carpeta y nombre especificado
	 * @param ficheroOrigen es el fichero original que vamos a usar
	 * @param ficheroDestino es el fichero nuevo que vamos a lograr tras copiar el original
	 */

	//metodo copiar fichero
	public static void copiar(String ficheroOrigen, String ficheroDestino)
	{
	
		try {
			FileInputStream fentrada;
			fentrada = new FileInputStream (ficheroOrigen);
			BufferedInputStream bufferentrada= new BufferedInputStream(fentrada);
			FileOutputStream fsalida= new FileOutputStream (ficheroDestino);
			BufferedOutputStream buffersalida= new BufferedOutputStream(fsalida);
			byte  mibuffer [] = new byte[256];
			int n= 0;
			try {
			do {
				 n= bufferentrada.read(mibuffer);
				if(n<0) {
					buffersalida.write(mibuffer, 0, n);
				}
			}while(n < 0);
			bufferentrada.close();
			buffersalida.close();
			fentrada.close();
			fsalida.close();
			}
			catch(IOException e)
			{
				System.out.println("no se puede leer o escribir el dato");
			}
		} catch (FileNotFoundException e) {
			System.out.println("no encuentro el fichero");
		}
		
	}
	
	/**
	 * Aqui tenemos el metodo borrar que sera la opcion 2 del menu
	 * borrará el fichero especificado
	 * @param fichero donde le pasaremos el nombre del fichero que deseamos borrar
	 */
	
	
	//metodo borrar fichero
	public static void borrar(File fichero)
	{
		if(!fichero.exists()) {
			System.out.println("el fichero no se encuentra");
		}
		else {
			fichero.delete();
			System.out.println("el fichero fue eliminado");
		}
	}
	
	/**
	 * Aqui tenemos el metodo mostrar tamaño que sera la opcion 3 del menu
	 * pedirá el nombre del fichero y nos dirá su tamaño en bytes.
	 * @param fichero donde le pasaremos el nombre del fichero que deseamos que nos muestre su tamaño
	 * @return devuelve el tamaño del fichero indicado
	 */
	
	
	//metodo mostrar tamaño del fichero
	public static int[] MostrarTamaño(String fichero)
	{
		File f= new File(fichero);
		int cuantos =(int)f.length();
		int []datos = new int[cuantos];
		return datos;
	}
	
	}