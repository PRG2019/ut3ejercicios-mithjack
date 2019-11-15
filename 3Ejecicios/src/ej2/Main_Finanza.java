package ej2;
import java.util.*;
public class Main_Finanza {
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
//double divisa;
int men, men2;
//boolean sw1;
System.out.println("1. Tipo fijo\n2. Tipo variable\nSalir");
men=sc.nextInt();
switch(men) {
case 1:
	System.out.println("1.Eur a Dol\n2.Dol a Eur\nSalir");
	men2=sc.nextInt();
	switch(men2) {
	case 1:
		Finanzas a=new Finanzas();
		System.out.println("Introduce cantidad");
		double can=sc.nextDouble();
		a.setDivisa(can);
		a.mostrarDol();
		break;
	case 2:
		Finanzas b=new Finanzas();
		System.out.println("Introduce cantidad");
		double can2=sc.nextDouble();
		b.setDivisa(can2);
		b.mostrarEur();
		break;
	default:
		break;
		}
	break;
case 2:
	System.out.println("1.Eur a Dol\n2.Dol a Eur\nSalir");
	men2=sc.nextInt();
	switch(men2) {
	case 1:
		System.out.println("A cuanto esta el cambio?");
		double con=sc.nextDouble();
		Finanzas a=new Finanzas(con);
		System.out.println("Introduce cantidad");
		double can=sc.nextDouble();
		a.setDivisa(can);
		a.mostrarDol();
		break;
	case 2:
		System.out.println("A cuanto esta el cambio?");
		double con2=sc.nextDouble();
		Finanzas b=new Finanzas(con2);
		System.out.println("Introduce cantidad");
		double can2=sc.nextDouble();
		b.setDivisa(can2);
		b.mostrarEur();
		break;
	default:
		break;
		}
	break;
default:
	break;
}
sc.close();
}
}
