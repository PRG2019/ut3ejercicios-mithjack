package Ej1;

import java.util.*;
public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) {
	System.out.println("Cuanto cobran los empleados?");
	int cobra= sc.nextInt();
	Empleado r1=new Empleado(cobra);
	Encargado r2=new Encargado(cobra);
	
	System.out.println("Los empleados ganan: "+r1.getSueldo()+"€");
	System.out.println("Los encargados ganan: "+r2.getSueldo()+"€");
	}
}
