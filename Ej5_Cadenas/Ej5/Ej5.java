package Ej5;

import java.util.Scanner;

public class Ej5 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime frase");
		System.out.println();
		String cadena=sc.nextLine();
		String cadenain=cadena;
		
		System.out.println("Que subcadena buscas?");
		String subcad=sc.nextLine();
		int con=0;
		
		while(cadenain.indexOf(subcad)>-1) {
			cadenain=cadenain.substring(cadenain.indexOf(subcad)+subcad.length(),cadenain.length());
			con++;
		}
		
	System.out.println(subcad+" aparece "+con+" veces en "+cadena);
		sc.close();
	}
}