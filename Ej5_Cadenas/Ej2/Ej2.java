package Ej2;

import java.util.Scanner;

public class Ej2 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime frase");
		System.out.println();
		String cadena=sc.nextLine();
		String lcC=cadena.toLowerCase();
		int cons=0;
		
		for(int i=0; i<cadena.length();i++) {
			
			if(lcC.charAt(i)!='a'&&lcC.charAt(i)!='e'&&
				lcC.charAt(i)!='i'&&lcC.charAt(i)!='o'&&
				lcC.charAt(i)!='u') {
					cons++;
					if(lcC.charAt(i)==32)cons--;
			}
		}
		
	System.out.println(cadena+" tiene "+cons+" consonantes.");
	
		sc.close();
	}
}