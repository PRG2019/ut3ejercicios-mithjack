package Ej11;

import java.util.*;
public class Test {
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		try {
		
		System.out.print("Numero 1: ");
		int n1=sc.nextInt();
		System.out.print("Numero 2: ");
		int n2=sc.nextInt();
		if(n2==0) throw new Exception();
		
		Integer nu1=Integer.valueOf(n1);
		Integer nu2=Integer.valueOf(n2);
		
		System.out.println("La suma es: "+(nu1+nu2));
		System.out.println("La multiplicación es: "+(nu1*nu2));
		System.out.println("La division es: "+(nu1.doubleValue()/nu2.doubleValue()));
		System.out.println("El modulo es: "+(nu1%nu2));
		
	} catch (Exception e) {
		System.out.println("El 2o numero no puede ser 0");
	}	
	}
}
