package n3ejercicio1;
/*
 * Ejercicio 1. Crea un método genérico que tome como argumento un 
 * contenedor Escuela<List<?>>. Determina qué métodos puede o no 
 * invocar para el contenedor Escuela y para la lista List. Repite 
 * el ejercicio para un argumento de tipo List<Escuela<?>>. 
 */
import java.util.List;


public class App {
	
	public static class Escuela<T> {
		
		T objeto1;
		
		
		public void caja(Escuela<List<?>> t) {
			t.equals(objeto1);
			//puede invocar metodos de Escuela o de Objetos en gral
		}
		
		
		public void caja2(List<Escuela<?>> t) {
			t.add(0,null);
			//puede invocer los metodos de List
		}
		
	}
}
