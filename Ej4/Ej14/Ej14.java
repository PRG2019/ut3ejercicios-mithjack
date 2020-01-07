//@mithjack
package Ej14;
/*Implemente un subprograma que halle cual es la primera potencia 
 * en base 2 mayor que un n�mero que pasamos como par�metro, 
 * devolviendo el valor de dicha potencia y el exponente al que est� elevado.*/
import java.util.*;
public class Ej14 {

	static int potenciaDeDos(int n, int[]x) {
	int rdo=0;
	if (Math.pow(2,x[0])>n) rdo=1;
	else {
		x[0]++;
		rdo=2*potenciaDeDos(n,x);
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
		System.out.println("2^"+x[0]+"="+potencia+">"+n);

		sc.close();
	}
}
