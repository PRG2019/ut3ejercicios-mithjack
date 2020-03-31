package Ej10;

import java.text.SimpleDateFormat;
import java.util.*;

public class ConversorFechas {
 public static Scanner sc=new Scanner(System.in);
 
	static String normalToAmericano(String S) throws Exception {
		//Declaramos el formato de entrada
		SimpleDateFormat parseador = new SimpleDateFormat("dd/MM/yy");
		//Declaramos como queremos que salga
		SimpleDateFormat formateador = new SimpleDateFormat("MM/dd/yy");
		
		Date date = parseador.parse(S);
		S=formateador.format(date);
		
	 return S; 
 }
	static String americanoToNormal(String S) throws Exception{
				SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yy");
				SimpleDateFormat parseador = new SimpleDateFormat("MM/dd/yy");
				
				Date date = parseador.parse(S);
				S=formateador.format(date);
		return S;
	}
	
	public static void main(String[]args) throws Exception {
		System.out.println("Dime una fecha dd/mm/yyyy o mm/dd/yyyy");
		String Fecha=sc.next();
		System.out.println("Que quieres hacer:");
		System.out.println("1. Pasar a Americano");
		System.out.println("2. Pasar a Normal");
		int sw=sc.nextInt();
		switch(sw) {
		case 1:
			System.out.println(normalToAmericano(Fecha));
			break;
		case 2:
			System.out.println(americanoToNormal(Fecha));
			break;
		}
	}
}
