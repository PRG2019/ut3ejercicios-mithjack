package Ej4;
/*
 * @mithjack
 */
import java.util.Scanner;
public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Dame x");
		double x=sc.nextDouble();
		System.out.println(metodox(x));
	}
	/*
	 * Para que funcione en vez de devolver el dato*1.1, creamos el Wrapper antes y devolvemos el intValue
	 */
	public static int metodox(double x){
		Double dato = new Double(x*1.1);
		return dato.intValue();
		}
}

/*
*Otra forma seria creando Double dato = new Double(sc.nextDouble()); en el main y llamando con dato la funcion:
*/
public static int metodox(Double x){
		x=x*1.1;
		return x.intValue();
		}
}
