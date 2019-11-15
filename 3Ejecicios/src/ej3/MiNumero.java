package ej3;

public class MiNumero {
public int Doble;
public int Triple;
public int Cuadruple;
private int Numero;

MiNumero(int n){
	Numero=n;
}

//M
public double getNumero() {
	return Numero;
}
public void setNumero(int d) {
	Numero=d;
}

public void sacaDoble() {
	int doble=(int) Math.pow(Numero, 2);
	System.out.println("El doble es "+doble);
}
public void sacaTriple() {
	int triple=(int) Math.pow(Numero, 3);
	System.out.println("El triple es "+triple);
}
public void sacaCuadr() {
	int cuadr=(int) Math.pow(Numero, 4);
	System.out.println("El cuadruple es "+cuadr);
}
	

}
