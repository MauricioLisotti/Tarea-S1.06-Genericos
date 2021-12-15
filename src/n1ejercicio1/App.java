package n1ejercicio1;
/*
 * Ejercicio 1. Crea una clase llamada NoGenericMethods  que almacene 
 * tres objetos del mismo tipo, junto con los métodos para almacenar 
 * y extraer estos objetos y un constructor para inicializar los tres. 
 * Comprueba que los argumentos pueden ponerse en cualquier posición 
 * en la llamada al constructor.
 */
public class App {
	public static void main(String[]args) {
		
		NoGenericMethods noGen1 = new NoGenericMethods(4);
		NoGenericMethods noGen2 = new NoGenericMethods(4);
		NoGenericMethods noGen3 = new NoGenericMethods(4);
		
		noGen1.add(3, 13);		
		noGen1.add(1, 11);
		noGen1.add(2, 12);
		noGen1.add(0, 14);
		
		noGen2.add(1, 21);		
		noGen2.add(3, 23);
		noGen2.add(2, 22);
		noGen2.add(0, 24);
		
		noGen3.add(2, 32);		
		noGen3.add(0, 34);
		noGen3.add(3, 33);
		noGen3.add(1, 31);
		
		int numeroGet1=(Integer)noGen1.get(2);
		System.out.println("numero de la 2da posicion de noGen1: "+numeroGet1);
		
		int numeroGet2=(Integer)noGen2.get(0);
		System.out.println("numero de la posicion 0 de noGen2: "+numeroGet2);
		
		int numeroGet3=(Integer)noGen3.get(1);
		System.out.println("numero de la 1ra posicion de noGen3: "+numeroGet3);
	}

}
