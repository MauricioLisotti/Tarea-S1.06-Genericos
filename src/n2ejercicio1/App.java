package n2ejercicio1;
/*
 * Ejercicio 1. Crea una interfaz llamada MiInterfaz con dos métodos metode1() 
 * y metode2(). Crea una clase llamada Implementadora que implemente esta 
 * interfaz y añada un tercer método llamado metode3(). En otra clase llamada 
 * Generica, crea el método genérico llamado metodeGeneric() con un tipo de 
 * argumento que esté limitado por la interfaz MiInterfaz. Demuestre que los 
 * métodos de la interfaz son invocables dentro de este método genérico. 
 * 
 * En el main(), pasa una instancia de la clase Implementadora en el método genérico metodeGeneric().
 */

public class App {
	public static void main(String[]args) {
		
		Implementadora implementadora = new Implementadora();
		Generica generica = new Generica();
		
		generica.metodoGenerico(implementadora);
		
		implementadora.metodo3();
	}
	
}
