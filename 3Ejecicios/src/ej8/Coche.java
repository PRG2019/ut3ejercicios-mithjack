package ej8;

public class Coche {
	public String marca;
	public String mod;
	
	Coche(){
		marca="Interno";
		mod="Prueba";
	}
	
	Coche(String m, String mo){
		marca=m;
		mod=mo;
	}
	
	public String mostrar() {
		return marca+" "+mod;
	}
	
	public static void main(String[]args) {
		Coche c1=new Coche();
		Coche c2=new Coche("Audi","R8");
		System.out.println("Coche 1: "+c1.mostrar());
		System.out.println("Coche 2: "+c2.mostrar());
	}
}
