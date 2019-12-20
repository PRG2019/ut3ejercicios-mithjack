/*13. Para obtener el n�mero de tarot de una persona, hay que sumar los n�meros de su fecha de nacimiento y 
 * reducirlos a un solo d�gito. Realice un programa que lea una fecha de teclado y escriba el n�mero del tarot a partir 
 * de la fecha le�da. La fecha estar� formada por tres n�meros  enteros, el d�a, el mes y el a�o(4 d�gitos). 
 * Ejemplo: Sup�ngase que una persona nace el d�a 1 de julio de 1966. La suma 1+7+1996=1974. El resultado obtenido no est� formado por 
 * un solo d�gito, por lo que habr� que sumar las cuatro cifras que componen el n�mero: 1+9+7+4=21. Al igual que antes, el resultado 
 * no est� formado por un d�gito por lo que repetir el proceso, 2+1=3, El resultado obtenido es el n�mero del tarot 3. */
package Ej13;
import java.util.*;
public class Ej13 {
	
	public static int suma(int x) {
		int total;
		if (x<10) total=x;
		else total=x%10+suma(x/10);
		
		return total;
	}
	
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int fecha, mes, a�o;
	fecha=sc.nextInt();
	mes=sc.nextInt();
	a�o=sc.nextInt();
	int sfinal=0;
	int total=fecha+mes+a�o;
	
	System.out.println(total);
	while (total>0) {
		sfinal+=total%10;
		total/=10;
	}
	System.out.println(sfinal);
	System.out.println("recursivamente");
	System.out.println(suma(total));
	}
}
