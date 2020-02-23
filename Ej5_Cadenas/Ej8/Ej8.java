package Ej8;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime frase");
		String cadena=sc.nextLine(),cadena2=new String();
		
		for(int i=0; i<cadena.length();i++) {
			if(i%2==0)cadena2+=cadena.charAt(i);	
		}
		
		System.out.println(cadena+" sus posiciones pares son: "+cadena2);
		sc.close();
	}
}

