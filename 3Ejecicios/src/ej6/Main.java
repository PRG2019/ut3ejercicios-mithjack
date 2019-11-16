package ej6;
import java.util.Scanner;
public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double peso=0;
	String unidad="a";
	
	System.out.println("Introduceme un peso");
	peso=sc.nextDouble();
	unidad="K";
	Peso a1=new Peso(peso,unidad);
	boolean sw2=false;
	while(!sw2) {
	System.out.println("");
	System.out.println("Actualmente "+a1.mPeso()+a1.mUnidad());
	System.out.println("Que quieres hacer?");
	System.out.println("1. Pasar a Libras");
	System.out.println("2. Pasar a Lingotes");
	System.out.println("3. Pasar a otra unidad");
	int men=sc.nextInt();
	switch(men) {
	case 1:
		a1.getLibras();
		System.out.println(a1.mPeso());
		break;
	case 2:
		a1.getLingotes();
		System.out.println(a1.mPeso());
		break;
	case 3:
		System.out.println("A que unidad Quieres pasarlo\nLb, Li, Oz, P, K, G, Q");
		unidad=sc.next();
		//a.getPeso(unidad);
		//System.out.println(a.mPeso()+a.mUnidad());
		System.out.println("Son: "+ a1.getPeso(unidad)+" "+unidad);
		break;
	default:
		System.out.println("Opcion invalida");
		break;
	}
	}
	sc.close();
}
}
