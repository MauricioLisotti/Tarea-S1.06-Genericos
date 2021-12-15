package n1ejercicio1;

public class NoGenericMethods {


	public NoGenericMethods(int z) {
		datos=new int[z];
	
	}
	
	public int get(int i ) {
		return datos[i];
	}
	
	public void add(int i, int j) {
		datos[i]=j;
	}
	
	private int[] datos;
	
	
	

}
