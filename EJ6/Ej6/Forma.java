package Ej6;

public abstract class Forma {

	public abstract String toString();
	
	public void identidad() {
		System.out.println(this.hashCode());
	}
	
	public static void main(String[] args) {
		Circulo c = new Circulo();
		Cuadrado c2 = new Cuadrado();
		Triangulo t = new Triangulo();
		Rombo r = new Rombo();
		
		c.identidad();
		System.out.println(c.toString()+"\n");
		c2.identidad();
		System.out.println(t.toString()+"\n");
		t.identidad();
		System.out.println(c2.toString()+"\n");
		r.identidad();
		System.out.println(r.toString());
	}
}
