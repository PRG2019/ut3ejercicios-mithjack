package Ej9;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime una fecha dd/mm/aaaa");
		String cadena=sc.nextLine(),dd=new String(), mm=new String(), aaaa=new String();
		int sw=0;
		for(int i=0; i<cadena.length();i++) {
			if(cadena.charAt(i)=='/') {
				i++;
				sw++;
			}
			if(sw==0) {
				dd+=cadena.charAt(i);
			}else if(sw==1) {
				mm+=cadena.charAt(i);
			}else {
				aaaa+=cadena.charAt(i);
			}
		}
		switch(Integer.parseInt(mm)) {
		case 1:
			mm="Enero";
			break;
		case 2:
			mm="Febrero";
			break;
		case 3:
			mm="Marzo";
			break;
		case 4:
			mm="Abril";
			break;
		case 5:
			mm="Mayo";
			break;
		case 6:
			mm="Junio";
			break;
		case 7:
			mm="Julio";
			break;
		case 8:
			mm="Agosto";
			break;
		case 9:
			mm="Septiembre";
			break;
		case 10:
			mm="Octubre";
			break;
		case 11:
			mm="Noviembre";
			break;
		case 12:
			mm="Diciembre";
			break;
				}
		System.out.println(dd+" "+mm+" "+aaaa);
		sc.close();
	}
}

