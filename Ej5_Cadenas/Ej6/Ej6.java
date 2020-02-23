package Ej6;

import java.util.Scanner;

public class Ej6 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime frase");
		System.out.println();
		String cadena=sc.nextLine();
		String lcC=cadena.toLowerCase();
		int cons=1;
		
		for(int i=0; i<cadena.length();i++) {
			if(lcC.charAt(i)==32)cons++;	
		}
		
	System.out.println(cadena+" tiene "+cons+" palabras.");
	
		sc.close();
	}
}