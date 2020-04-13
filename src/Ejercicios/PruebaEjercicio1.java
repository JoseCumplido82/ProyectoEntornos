package Ejercicios;


/**
 * 
 * @author Jose , aqui tenemos una clase que se va a usar como prueba del ejercicio 1, 
 * donde vamos a coger un fichero y lo vamos a encriptar, y luego vamos a coger el fichero encriptado y lo vamos a desencriptar
 * 
 *
 */

public class PruebaEjercicio1 {

/**
 * 
 * @param aqui tendriamos la case PruebaEjercicio1 que es donde vamos a probar los metodos creados en la clase Ejercicio1
 * 
 */
	
	
	public static void main(String[] args) {
        
		
		/**
		 * Aqui encriptamos el fichero que hemos copiado
		 */
		Ejercicio1.encriptarFichero("C:\\Users\\Jose\\Desktop\\prueba2tema8.txt", "C:\\Users\\Jose\\Desktop\\prueba3tema71.txt");
		
		
		/**
		 * aqui desencriptamos el fichero
		 */
		Ejercicio1.desencriptarFichero("C:\\Users\\Jose\\Desktop\\prueba2tema7resuelto.txt", "C:\\Users\\Jose\\Desktop\\ejercicioresuelto.txt");
 
    }
 
}
