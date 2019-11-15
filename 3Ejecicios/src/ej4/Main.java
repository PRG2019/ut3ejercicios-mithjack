package ej4;
import java.util.*;
public class Main {
public static void main(String[]args) {
	int numero;
	Scanner sc=new Scanner(System.in);
	System.out.println("1. Usar valor por defecto\n2. Introducir valor");
	int men2=sc.nextInt();
	switch(men2) {
	case 1:
		Numero a=new Numero();
		boolean sw1=false;
		while(!sw1) {
			System.out.println();
		System.out.println("Que quieres hacer?");
		System.out.println("1. Sumar 1\n2. Restar 1\n3. Sacar valor\n4. Sacar doble actual.\n5. Sacar triple actual\n6. Iniciar valor\nOtro Salir");
		int men=sc.nextInt();
		switch(men) {
		case 1:
			a.addNumero();
			break;
		case 2:
			a.susNumero();
			break;
		case 3:
			System.out.println("Actualmente es "+a.getNumero());
			break;
		case 4:
			a.sacaDoble();
			break;
		case 5:
			a.sacaTriple();
			break;
		case 6:
			System.out.println("A que valor inicializar");
			int n=sc.nextInt();
			a.setNumero(n);
			break;
		default:
			sw1=true;
			break;
		}
		}
		break;
	case 2:
		System.out.println("Dame un Valor inicial");
		numero=sc.nextInt();
		Numero b=new Numero(numero);
		boolean sw2=false;
		while(!sw2) {
			System.out.println();
		System.out.println("Que quieres hacer?");
		System.out.println("1. Sumar 1\n2. Restar 1\n3. Sacar valor\n4. Sacar doble actual.\n5. Sacar triple actual\n6. Iniciar valor\nOtro Salir");
		int men=sc.nextInt();
		switch(men) {
		case 1:
			b.addNumero();
			break;
		case 2:
			b.susNumero();
			break;
		case 3:
			System.out.println("Actualmente es "+b.getNumero());
			break;
		case 4:
			b.sacaDoble();
			break;
		case 5:
			b.sacaTriple();
			break;
		case 6:
			System.out.println("A que valor inicializar");
			int n=sc.nextInt();
			b.setNumero(n);
			break;
		default:
			sw1=true;
			break;
		}
		}
		break;
	}
	sc.close();
}
}
