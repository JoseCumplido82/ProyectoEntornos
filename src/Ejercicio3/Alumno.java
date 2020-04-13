package Ejercicio3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * En esta clase vamos a crear una aplicacion que guarde en un fichero serializable un objeto de la clase alumno 
 * @author Jose
 *
 */

public class Alumno implements Serializable{

	/**
	 * Aqui tenemos los atributos, constructores y getter y setter, metodo to string y metodo mostrar alumno de la clase Alumno
	 */
	
	
		//atributos
		private static final long serialVersionUID = 7481942089000040222L;
		private String dni;
		private String nombre;
		private String direccion;
		private int edad;
		
		//constructores
		public Alumno(String dni, String nombre, String direccion, int edad) {
			super();
			this.dni = dni;
			this.nombre = nombre;
			this.direccion = direccion;
			this.edad = edad;
		}

		
		public Alumno() {
			this.dni = "";
			this.nombre = "";
			this.direccion = "";
			this.edad = 0;	
		}


		//getter y setter 
		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		/**
		 * Nos muestra todos los datos (atributos dni, nombre, direccion, edad )del alumno que le pasemos
		 */
		//mostrar alumno
		public void mostrarAlumno() {
			System.out.println("---------------ALUMNO--------------------");
			System.out.println("DNI del alumno: " + this.dni);
			System.out.println("Nombre del alumno: " + this.nombre);
			System.out.println("Direccion del alumno: " + this.direccion);
			System.out.println("Edad del alumno: " + this.edad);
		}
		
		//to string
		
		@Override
		public String toString() {
			return "Alumno [dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", edad=" + edad + "]";
		}

		/**
		 * En este metodo se Muestra la información del Alumno contenida en el fichero
		 * @param fichero que es el string que le pasaremos
		 * prueba en alumno del ejercicio 3 para ver en master
		 * @return
		 */
		
		public static Alumno ListarAlumno(String fichero) {
			Alumno p = null;
			try {
				FileInputStream fentrada= new FileInputStream (fichero);
				try {
					ObjectInputStream datosfentrada = new ObjectInputStream(fentrada);
					try {
						p = (Alumno)datosfentrada.readObject();
						datosfentrada.close();
						fentrada.close();
					} catch (ClassNotFoundException e) {
						System.out.println("no puedo encontrar la clase producto");
					}
				} catch (IOException e) {
					System.out.println("no es capaz de recuperar el objeto");
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("fichero no encontrado");
			} 
			return p;
		}

	/**
	 * Esta opción pedirá los datos del alumno y guardará el registro
	 *correspondiente en el fichero 
	 * @param fichero
	 * @param a
	 */

		public static void AñadirAlumno(String fichero, Alumno a)
		{
			try {
				FileOutputStream fsalida= new FileOutputStream(fichero);
				try {
					ObjectOutputStream datosfsalida= new ObjectOutputStream(fsalida);
					datosfsalida.writeObject(a);
					datosfsalida.close();
					fsalida.close();
				} catch (IOException e) {
					System.out.println("no puedo escribir el objeto al fichero");
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("no puedo crear el fichero");
			}
		}
	
}
