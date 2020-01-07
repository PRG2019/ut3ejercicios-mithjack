/*13. Para obtener el número de tarot de una persona, hay que sumar los números de su fecha de nacimiento y 
 * reducirlos a un solo dígito. Realice un programa que lea una fecha de teclado y escriba el número del tarot a partir 
 * de la fecha leída. La fecha estará formada por tres números  enteros, el día, el mes y el año(4 dígitos). 
 * Ejemplo: Supóngase que una persona nace el día 1 de julio de 1966. La suma 1+7+1996=1974. El resultado obtenido no está formado por 
 * un solo dígito, por lo que habrá que sumar las cuatro cifras que componen el número: 1+9+7+4=21. Al igual que antes, el resultado 
 * no está formado por un dígito por lo que repetir el proceso, 2+1=3, El resultado obtenido es el número del tarot 3. */
package Ej13;
import java.util.*;
public class Ej13 {
	//private static int total;
	public static int suma(int x) {
		int stotal=0;
		if (x<10) stotal+=x;
		else stotal=x%10+suma(x/10);
		
		return stotal;
	}
	
	
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int fecha, mes, año;
	fecha=sc.nextInt();
	mes=sc.nextInt();
	año=sc.nextInt();
	int sfinal=0;
	int total=fecha+mes+año;
	
	System.out.println("recursivamente");
	System.out.println(suma(total));

	System.out.println(total);
	while (total>0) {
		sfinal+=total%10;
		total/=10;
	}
	System.out.println(sfinal);
	}
}
