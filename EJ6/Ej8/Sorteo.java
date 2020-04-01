package Ej8;

public abstract class Sorteo {
	
	protected int posibilidades;
	public abstract int lanzar();

	//main de testeo
	public static void main(String[]args) {
		Dado dado=new Dado();
		Moneda moneda=new Moneda();
		System.out.println(dado.lanzar());
		moneda.lanzar();
	}
}
