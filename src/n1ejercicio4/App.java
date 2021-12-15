package n1ejercicio4;

/*
 * Ejercicio 4. Modifica el apartado anterior de forma que los 
 * argumentos que recibe f() sea una lista de argumentos de variable indefinida.
 */

public class App {
	public static void main(String[]args) {
		
		GenericMethod metodoGenerico = new GenericMethod();
		
		metodoGenerico.f("perro",7, 20.36, true);
		metodoGenerico.f(false, "gato", 85);
		metodoGenerico.f("perro",7, 20.36, true);


		
	
	}
}
