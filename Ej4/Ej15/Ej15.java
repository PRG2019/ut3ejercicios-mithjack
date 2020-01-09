package Ej15;
import java.util.*;
public class Ej15 {

	public static double interes(int din, int año, double inte) {
		double total;
		
		if (año<1) total=din;
		else if(año==1) total=din+inte*din;
		else {
			total=interes(din,año-1,inte);
			total=total+total*inte;
		}
		
		return total;
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime dinero, años e interes separado por espacio");
		int dinero=sc.nextInt();
		int año=sc.nextInt();
		double interes=sc.nextDouble();
		System.out.println("El total es: "+interes(dinero,año,interes));
		
		sc.close();
	}
}
