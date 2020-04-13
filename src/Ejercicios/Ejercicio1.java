package Ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * Esta clase pretende encriptar y desencriptar ficheros, para ello vamos a copiar un fichero y lo encriptaremos
 * y luego en el metodo desencriptar cogeremos ese fichero encriptado y lo desencriptaremos 
 * @author Jose
 *
 */

public class Ejercicio1 {
	
	
	/**
	 * 
	 * @param encriptarFichero. Este parametro te permite cifrar un fichero
	 * @param desencriptarFichero. Este parametro te permite descifrar un fichero .
	 * @return devuelve datos, que es una variable que se usa en los metodos ficherocifrado y ficherodescifrado
	 */
	public static int [] desencriptarFichero(String ficherocifrado, String ficherodescifrado)
	{
		File f = new File(ficherocifrado);
		File f2 = new File(ficherodescifrado);
		int cuantos = (int)f.length();
		int desplazamiento = -3;
		int datoEncriptado;
		int [] datos= new int[cuantos];
		try {
			FileInputStream fentrada = new FileInputStream(ficherocifrado);
			FileOutputStream fsalida = new FileOutputStream(ficherodescifrado);
			int dato=0;
			int cont = 0;
		
			try {
				do {
				dato = fentrada.read();
				if(dato!=-1)
				{
					datoEncriptado = dato + desplazamiento;
					datos[cont] = datoEncriptado;
					fsalida.write(datoEncriptado);
					datos[cont]= dato;
				}
				cont ++;
				}while(dato != -1);
				 fsalida.close();
				fentrada.close();
			} catch (IOException e) {
			System.out.println("no se pudo leer dato");
			}
			}
		catch (FileNotFoundException e){
			System.out.println("fichero no encontrado");
			
		}
		return datos;

	}
	
	/**
	 * 
	 * @param ficherocifrado este parametro recoge un ficherocifrado del tipo String
	 * @param ficherodescifrado este parametro recoge un ficherodescifrado del tipo String
	 * @return
	 */
	
	
	public static int [] encriptarFichero(String ficherocifrado, String ficherodescifrado)
	{
		File f = new File(ficherocifrado);
		File f2 = new File(ficherodescifrado);
		int cuantos = (int)f.length();
		int desplazamiento = 3;
		int datoEncriptado;
		int [] datos= new int[cuantos];
		try {
			FileInputStream fentrada = new FileInputStream(ficherocifrado);
			FileOutputStream fsalida = new FileOutputStream(ficherodescifrado);
			int dato=0;
			int cont = 0;
		
			try {
				do {
				dato = fentrada.read();
				if(dato!=-1)
				{
					datoEncriptado = dato + desplazamiento;
					datos[cont] = datoEncriptado;
					fsalida.write(datoEncriptado);
					datos[cont]= dato;
				}
				cont ++;
				}while(dato != -1);
				 fsalida.close();
				fentrada.close();
			} catch (IOException e) {
			System.out.println("no se pudo leer dato");
			}
			}
		catch (FileNotFoundException e){
			System.out.println("fichero no encontrado");
			
		}
		return datos;

	}
	
	
	/**
	 * 
	 * @param ficherocifrado este parametro recoge un ficherocifrado del tipo String
	 * @param ficherodescifrado este parametro recoge un ficherodescifrado del tipo String
	 * @return
	 */
}

