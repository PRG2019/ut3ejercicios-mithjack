package Ej10;
/*
 * @mithjack
 */
import java.util.Scanner;
public class Ej10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime una frase");
		String cadena=sc.nextLine(),cadena2=new String(),cm=cadena.toUpperCase();
		boolean sw=true;
		for(int i=0; i<cadena.length();i++) {
			if(sw) {
				cadena2+=cm.charAt(i);
				sw=false;
			}else {
				if(cadena.charAt(i)==' ') {
				sw=true;
				}
				cadena2+=cadena.charAt(i);

			}
		}
		System.out.println(cadena+" se corrigio en "+cadena2);
		sc.close();
	}
}

