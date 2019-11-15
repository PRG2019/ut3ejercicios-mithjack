package ej6;
import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double peso=0;
	String unidad="a";
	
	System.out.println("Introduceme un peso");
	peso=sc.nextDouble();
	//System.out.println("Dime su unidad:\nLb, Li, Oz, P, K, G, Q");
	unidad="K";
	Peso a=new Peso(peso,unidad);
	boolean sw2=false;
	while(!sw2) {
	System.out.println("");
	System.out.println("Actualmente "+a.mPeso()+a.mUnidad());
	System.out.println("Que quieres hacer?");
	System.out.println("1. Pasar a Libras");
	System.out.println("2. Pasar a Lingotes");
	System.out.println("3. Pasar a otra unidad\nLb, Li, Oz, P, K, G, Q");
	int men=sc.nextInt();
	switch(men) {
	case 1:
		a.getLibras();
		System.out.println(a.mPeso());
		break;
	case 2:
		a.getLingotes();
		System.out.println(a.mPeso());
		break;
	case 3:
		System.out.println("A que unidad Quieres pasarlo\nLb, Li, Oz, P, K, G, Q");
		unidad=sc.next();
		a.getPeso(unidad);
		System.out.println(a.mPeso()+a.mUnidad());
		break;
	default:
		System.out.println("Opcion invalida");
		break;
	}
	}
	sc.close();
}
}
