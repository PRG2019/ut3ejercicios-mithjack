package ej12;
import java.util.*;
public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int papas; 
	double choco;
	System.out.println("Cuantas papas tienes:");
	papas=sc.nextInt();
	System.out.println("Cuanto choco tienes:");
	choco=sc.nextDouble();
	Almacen a=new Almacen(papas,choco);
	System.out.println("Puedes alimentar a: "+a.getClientes());
	
	boolean bc1=false;
	while(!bc1) {
	int sw1;
	System.out.println("1.Añadir Papas");
	System.out.println("2.Añadir Choco");
	System.out.println("3.Ver Papas");
	System.out.println("4.Ver Choco");
	System.out.println("5.Ver comensales");
	sw1=sc.nextInt();
	switch(sw1) {
	case 1:
		System.out.println("Cuantas papas añades:");
		papas=sc.nextInt();
		a.addPapas(papas);
		break;
	case 2:
		System.out.println("Cuanto choco añades:");
		choco=sc.nextDouble();
		a.addChocos(choco);
		break;
	case 3:
		a.showPapas();
		break;
	case 4:
		a.showChocos();
		break;
	case 5:
		System.out.println("Puedes alimentar a: "+a.getClientes());
		break;
	default:
		bc1=true;
		break;
	}

	}
sc.close();
}
}