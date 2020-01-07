//@mithjack
package Ej14;
/*Implemente un subprograma que halle cual es la primera potencia 
 * en base 2 mayor que un número que pasamos como parámetro, 
 * devolviendo el valor de dicha potencia y el exponente al que está elevado.*/
import java.util.*;
public class Ej14 {

	//metodo 1
	static int potenciaDeDos(int n, int[]x) {
	int rdo=0;
	if (Math.pow(2,x[0])>n) rdo=1;
	else {
		x[0]++;
		rdo=2*potenciaDeDos(n,x);
	}
	return rdo;
	}
	
	//metodo 2
	static int potenciaDeDos2(int n) {
		int rdo=0;
		if (n<=0) rdo=1;
		else {
			rdo=2*potenciaDeDos2(n/2);
		}
		return rdo;
		}
	
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		int n=10;
		int[]x={0};
		int potencia;
		System.out.println("Dime el parametro");
		n=sc.nextInt();
		
		potencia=potenciaDeDos(n,x);
		System.out.println("La potencia que buscas es "+x[0]);
		potencia=potenciaDeDos2(n);
		System.out.print("El exponente es: ");
		System.out.println(potencia=potenciaDeDos2(n));
		
		System.out.println("2^"+x[0]+"="+potencia+">"+n);
		sc.close();
	}
}
