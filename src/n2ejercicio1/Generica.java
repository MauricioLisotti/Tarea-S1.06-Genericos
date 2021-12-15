package n2ejercicio1;

public class Generica {
	
	public <T extends Implementadora> void metodoGenerico(T o) { // <T extends MiInterfaz> = es el tipo de argumento limitado por la interface
		o.metodo1();
		o.metodo2();
		
	}
	
	
}
