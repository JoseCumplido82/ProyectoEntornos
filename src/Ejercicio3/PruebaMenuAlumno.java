package Ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 * Esta es la clase de prueba donde vamos a probar la clase alumno
 * @author Jose
 *
 */

public class PruebaMenuAlumno {

	
	/**
	 * Dentro del metodo main vamos a tener un menu con las opciones
	 * añadir alumno o listar alumno que son metodos que hemos creado anteriormente
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner texto = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; 
	 
	        while (!salir) {
	 
	            System.out.println("1. Opcion 1: Añadir alumno");
	            System.out.println("2. Opcion 2: Listar alumno");
	            System.out.println("3. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = texto.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                        System.out.println("Has seleccionado la opcion 1, añadiremos un alumno");
	                        Alumno a1= new Alumno("45785114W","alumno","Calle falsa",2);
	                        
	                        /**
	                         * aqui usamos el metodo añadir alumno que lo hemos creado en la clase alumno
	                         */
	                        Alumno.AñadirAlumno("C:\\Users\\Jose\\Desktop\\alumno.txt", a1);
	                        break;
	                    case 2:
	                        System.out.println("Has seleccionado la opcion 2, Vamos a listar los alumnos");
	                        Alumno a2 =Alumno.ListarAlumno("C:\\Users\\Jose\\Desktop\\alumno.txt");
	                        /**
	                         *  aqui usamos el metodo listar alumno que lo hemos creado en la clase alumno
	                         */
	                        System.out.println(a2.toString());
	                        break;
	                    case 3:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 3");
	                }
	            } catch (Exception e) {
	                System.out.println("Debes insertar un número");
	                texto.next();
	            }
	        }
	 
	    }


}