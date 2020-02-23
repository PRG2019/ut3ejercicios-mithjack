package Ej3;

import java.util.Scanner;

public class Ej3 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime frase");
		System.out.println();
		String cadena=sc.nextLine();
		String cin=new String();
		
		for(int i=cadena.length()-1; i>-1;i--) {
			cin+=cadena.charAt(i);	
		}
		
	System.out.println(cadena+" invertida es: "+cin);
		sc.close();
	}
}