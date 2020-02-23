package Ej5;

import java.util.Scanner;
public class Ej5 {
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime cadena, solo se cogeran las letras tras un numero");
		System.out.println();
		String cadena=sc.nextLine();
		String cadena2=new String();

		
		for(int i=0; i<cadena.length();i++) {
			
			//Version en caso de no recordar el Character.isDigit
			/**if(cadena.charAt(i)=='1'||cadena.charAt(i)=='2'||
				cadena.charAt(i)=='3'||cadena.charAt(i)=='4'||
				cadena.charAt(i)=='5'||cadena.charAt(i)=='6'||
				cadena.charAt(i)=='7'||cadena.charAt(i)=='8'||
				cadena.charAt(i)=='9') 
				**/
			
			if(Character.isDigit(cadena.charAt(i))){ 
					int num=Character.getNumericValue(cadena.charAt(i));
					for(int z=num;z>0;z--) {
						cadena2+=cadena.charAt(i+1);
					}
			}		
		}		
		System.out.println(cadena2);
		sc.close();
	}
}