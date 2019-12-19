package Utilidades.mates;
import java.util.*;
public class main {
	public static void main(String[]Args) {
	int a=0,b=0;
	Scanner sc=new Scanner(System.in);
	
	boolean sw1=false;
	while(!sw1) {
		System.out.println("Que quieres hacer");
		System.out.println("1. Sumar");
		System.out.println("2. Potenciar");
		System.out.println("Otro salir");
		int men;
		men=sc.nextInt();
		switch(men) {
		case 1:
			System.out.println("Dime el numero 1");
			a=sc.nextInt();
			System.out.println("Dime el numero 2");
			b=sc.nextInt();
			sumar s= new sumar(a, b);
			System.out.println("La suma es: "+s.darSuma());
			break;
		case 2:
			System.out.println("Dime el numero 1");
			a=sc.nextInt();
			System.out.println("Dime el numero 2");
			b=sc.nextInt();
			potenciar p= new potenciar(a, b);
			System.out.println("La suma es: "+p.darPotencia());
			break;
		default:
			sw1=true;
			break;
		}
	}
	sc.close();
}
}
