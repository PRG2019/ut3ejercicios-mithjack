package ej4;

public class Numero {
private int Num;

Numero(){
	Num=0;	
}
Numero(int n){
	Num=n;
}



//met
public int getNumero() {
	return Num;
}
public void setNumero(int n) {
	Num=n;
}
public void addNumero() {
	Num+=1;
	System.out.println("Ahora es "+Num);
}
public void susNumero() {
	Num-=1;
	System.out.println("Ahora es "+Num);
}
public void sacaDoble() {
	int doble=(int) Math.pow(Num, 2);
	System.out.println("El doble es "+doble);
}
public void sacaTriple() {
	int triple=(int) Math.pow(Num, 3);
	System.out.println("El triple es "+triple);
}



}
