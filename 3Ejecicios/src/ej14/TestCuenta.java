package ej14;
import java.util.*;
public class TestCuenta {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	double aux=0;
	String titu;
	int op;
	boolean inte=false, log=false, v1=false, v2=false;
	Scuenta a=new Scuenta();
	Scuenta b=new Scuenta();
	
	
	while(!log) {
	inte=false;
	System.out.println();
	System.out.println("Inicio usuario. \nQue usuario eres?");
	System.out.println("Para salir pulse 0");
	System.out.println("Para ver ejemplo pulse 99");
	op=sc.nextInt();
	
	switch(op) {
		case 0:
			log=true;
			break;
		case 1:
			//Scuenta a=new Scuenta();
			if(!v1) {
			a.setncuenta(op);
			System.out.println("Dime tu nombre");
			titu=sc.next();
			a.setNom(titu);
			v1=true;
			}
			while(!inte) {
				System.out.println();
				System.out.println("Que quieres hacer?");
				System.out.println("1. Ingresar dinero");
				System.out.println("2. Retirar dinero");
				System.out.println("3. Mostrar datos");
				System.out.println("4. Salir");
				op=sc.nextInt();
				switch(op) {
			case 1:
			System.out.println("Cuanto ingresas?");
			aux=sc.nextDouble();
			a.ingreso(aux);
			break;
		case 2:
			System.out.println("Cuanto retiras?");
			aux=sc.nextDouble();
			a.reintegro(aux);
			break;
		case 3:
			a.mostrar();
			//System.out.println(a.toString());
			break;
		case 4:
			inte=true;
			break;
		default:
			System.out.println("Opci�n incorrecta");
			break;
			}
	
		}
	break;
		case 2:
			//Scuenta b=new Scuenta();
			if(!v2) {
			b.setncuenta(op);
			System.out.println("Dime tu nombre");
			titu=sc.next();
			b.setNom(titu);
			v2=true;
			}
			while(!inte) {
				System.out.println();
				System.out.println("Que quieres hacer?");
				System.out.println("1. Ingresar dinero");
				System.out.println("2. Retirar dinero");
				System.out.println("3. Mostrar datos");
				System.out.println("4. Salir");
				op=sc.nextInt();
				switch(op) {
			case 1:
			System.out.println("Cuanto ingresas?");
			aux=sc.nextDouble();
			b.ingreso(aux);
			break;
		case 2:
			System.out.println("Cuanto retiras?");
			aux=sc.nextDouble();
			b.reintegro(aux);
			break;
		case 3:
			b.mostrar();
			//System.out.println(a.toString());
			break;
		case 4:
			inte=true;
			break;
		default:
			System.out.println("Opci�n incorrecta");
			break;
			}
	
		}
	break;
	case 99:
		Scuenta test=new Scuenta();
		test.mostrar();
		break;
	default:
		System.out.println("No existe ese usuario");
		break;
	}

	}
	sc.close();
}
}
