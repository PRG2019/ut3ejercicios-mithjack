/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;

/**
 *
 * @author mithjack
 */
import java.util.*;
public class Main {
public static void main(String[]args) {
Scanner sc=new Scanner(System.in);
Temperatura a=new Temperatura();
double aux = 0;
int op=0;
boolean sw1=false;

while(!sw1) {
System.out.println("Que quieres hacer?");
System.out.println("1. Cel a Far");
System.out.println("2. Far a Cel");
System.out.println("Para salir pulsar otra opción");
System.out.print("Opcion: ");
op=sc.nextInt();
switch (op) {
case 1:
	System.out.println();
	System.out.println("Cuantos grados tienes?");
	aux=sc.nextDouble();
	/*Temperatura a=new Temperatura(aux);
	a.celfar(aux);
	*/
	a.setCel(aux);
	a.celfar();

	break;

case 2:
	System.out.println();
	System.out.println("Cuantos grados tienes?");
	aux=sc.nextDouble();
	/*Temperatura b=new Temperatura(aux);
	b.farcel(aux);*/
	a.setFar(aux);
	a.farcel();
	break;
	
default:
	sw1=true;
	break;
}
}

sc.close();
}
}

