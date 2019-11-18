package ej7;


import java.util.*;
public class Main {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
double uni = 0;
int op=0;
boolean sw1=false;

while(!sw1) {
System.out.println("Que quieres hacer?");
System.out.println("1. Millas a Metros");
System.out.println("2. Millas a Km");
System.out.println("Para salir pulsar otra opción");
System.out.print("Opcion: ");
op=sc.nextInt();
switch (op) {
case 1:
	System.out.println();
	System.out.println("Cuantos millas tienes?");
	uni=sc.nextDouble();
	Conversor a=new Conversor(uni);
	a.millasAMetros();
	System.out.println("Son: "+a.mostrar()+"Metros");
	break;

case 2:
	System.out.println();
	System.out.println("Cuantos millas tienes?");
	uni=sc.nextDouble();
	Conversor b=new Conversor(uni);
	b.millasAKilometros();
	System.out.println("Son: "+b.mostrar()+"Km");
	break;
	
default:
	sw1=true;
	break;
}
}

sc.close();
}
}


