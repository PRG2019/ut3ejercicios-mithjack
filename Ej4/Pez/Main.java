package Pez;
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String nombre;
	Pez p1= new Pez();
	boolean sw1=false;
	while(!sw1) {
		System.out.println("Que quieres hacer");
		System.out.println("1. Nombrar pez 1");
		System.out.println("2. Clonar pez 1");
		System.out.println("Otro Salir");
		int men=sc.nextInt();
		switch(men) {
		case 1:
			System.out.println("Dime el Nombre");
			nombre=sc.next();
			p1.setNombre(nombre);
			break;
		case 2:
			Pez p2=(Pez)p1.clone();
			boolean sw2=false;
			while(!sw2) {
				System.out.println("Que quieres hacer");
				System.out.println("1. Nombrar pez 1");
				System.out.println("2. Comparar peces");
				System.out.println("3. Renombrar pez 2");
				System.out.println("Otro Salir");
				int men2=sc.nextInt();
					switch(men2) {
					case 1:
						System.out.println("Dime el Nombre");
						nombre=sc.next();
						p1.setNombre(nombre);
						break;
					case 2:
						System.out.println(p2.equals(p1));
						break;
					case 3:
						System.out.println("Dime el Nombre");
						nombre=sc.next();
						p2.setNombre(nombre);
						break;
					default:
						sw2=true;
						break;
					}
				}
			break;
		default:
			sw1=true;
			break;
		}
	}
	sc.close();
}
}
