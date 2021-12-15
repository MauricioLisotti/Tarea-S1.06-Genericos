package n2ejercicio2;

public class ClaseGenerica {
	
	public <T extends ImplementadoraDoble> void metodo1(T o) { 
		System.out.println("metodo1");
		o.metodoA();
		o.metodoB();
	}
	
	public <T extends ImplementadoraDoble> void metodo2(T o) { 
		System.out.println("metodo2");
		o.metodoC();
		o.metodoD();
	}
}


