package Ej9;

import java.util.*;
public class Conversor {
	static Scanner sc=new Scanner(System.in);
	
	public static String getNumero(int n) {
		String num= new String(); 
		System.out.println("\nA que quieres convertirlo");
		System.out.println("1. Binario");
		System.out.println("2. Hexagesimal");
		System.out.println("3. Octal");
		int sw=sc.nextInt();
		
		switch(sw) {
		case 1:
			num=Integer.toBinaryString(n);
			break;
		case 2:
			num=Integer.toHexString(n);
			break;
		case 3:
			num=Integer.toOctalString(n);
			break;
		}
		return "\nEl numero es: "+num;
	}
	
	public static void main(String[] args) {
		System.out.println("Dime numero");
		int num=sc.nextInt();
		System.out.println(getNumero(num));
	}

}
