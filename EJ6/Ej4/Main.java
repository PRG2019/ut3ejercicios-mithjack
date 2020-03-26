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
