package n1ejercicio2;
/*
 * Ejercicio 2. Crea una clase llamada GenericMethods  con un 
 * m�todo gen�rico llamado f() que acepte tres argumentos de 
 * tipo gen�rico. Realiza en el main() diferentes llamadas de 
 * este m�todo con diferentes tipos de par�metros. Comprueba que 
 * se pueden colocar cualquier tipo de variable.
 */
public class App {
	
	public static void main(String[]args) {
		
		GenericMethod metodoGenerico = new GenericMethod();
		
		metodoGenerico.f("Pedro", 25, 36.34);

		metodoGenerico.f(13, 11.69 ,"Carlos");

		metodoGenerico.f(89.56 ,"Juan", 888);
	}
	
}
