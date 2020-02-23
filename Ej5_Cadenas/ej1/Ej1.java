package ej1;

import java.util.*;
public class Ej1 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime frase");
		System.out.println();
		String cadena=sc.nextLine();
		String lcC=cadena.toLowerCase();
		int vocales=0;
		
		for(int i=0; i<cadena.length();i++) {
			
			if(lcC.charAt(i)=='a'||lcC.charAt(i)=='e'||
					lcC.charAt(i)=='i'||lcC.charAt(i)=='o'||
							lcC.charAt(i)=='u') vocales++;
		}
		
	System.out.println(cadena+" tiene "+vocales+" vocales.");
	
		sc.close();
	}
}
