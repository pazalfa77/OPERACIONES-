package tata.tarea;

public class Operaciones {
	public int rest;
	
	public int suma(int a, int b){
	 rest=a+b;
	if (a==0 || b==0) {
		rest=0;
		return rest;
	}
	return rest;
	} 
	
	public int resta(int a, int b) {
		rest=a-b;
		if(a < b) {
			rest=0;
		}
		return rest;
	}
	
	public int multiplicar(int a, int b) {
		rest=a*b;
		if(b==0) {
			rest=1;
		}
		return rest;
	}
	
	public int dividir(int a, int b) {
		if(b==0){
			rest=0;
		}
		rest=a/b;
		return rest;
	}
}
