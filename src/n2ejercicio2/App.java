package n2ejercicio2;
/*
 * Ejercicio 2. Crea dos interfaces Interficie1 e Interficie2, y una clase 
 * ImplementadoraDoble que implemente ambas interficies. Crea la clase 
 * llamada ClaseGenerica con dos m�todos gen�ricos, metode1() que tenga 
 * un par�metro limitado por la primera interfaz y metode2() que tenga otro 
 * par�metro que est� limitado por la segunda interfaz. Crea una instancia 
 * de la clase ImplementadoraDoble (que implementa ambas interfaces) y 
 * demuestre que se puede utilizar con ambos m�todos gen�ricos de 'ClaseGenerica'.
 */

public class App {
	public static void main(String[]args) {
		
		ImplementadoraDoble impDoble = new ImplementadoraDoble();
		
		ClaseGenerica claseGenerica = new ClaseGenerica();
		
		impDoble.metodoA();
		impDoble.metodoB();
		impDoble.metodoC();
		impDoble.metodoD();
		
		claseGenerica.metodo1(impDoble);

		claseGenerica.metodo2(impDoble);
		
		
	}
	
}
