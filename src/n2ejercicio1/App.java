package n2ejercicio1;
/*
 * Ejercicio 1. Crea una interfaz llamada MiInterfaz con dos m�todos metode1() 
 * y metode2(). Crea una clase llamada Implementadora que implemente esta 
 * interfaz y a�ada un tercer m�todo llamado metode3(). En otra clase llamada 
 * Generica, crea el m�todo gen�rico llamado metodeGeneric() con un tipo de 
 * argumento que est� limitado por la interfaz MiInterfaz. Demuestre que los 
 * m�todos de la interfaz son invocables dentro de este m�todo gen�rico. 
 * 
 * En el main(), pasa una instancia de la clase Implementadora en el m�todo gen�rico metodeGeneric().
 */

public class App {
	public static void main(String[]args) {
		
		Implementadora implementadora = new Implementadora();
		Generica generica = new Generica();
		
		generica.metodoGenerico(implementadora);
		
		implementadora.metodo3();
	}
	
}
