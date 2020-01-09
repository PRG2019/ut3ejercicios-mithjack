package Ej15;
import java.util.*;
public class Ej15 {

	public static double interes(int din, int an, double in) {
		double tot, suma=in*din;
		
		if(an==0) tot=din;
		else tot=suma+interes(din,an-1,in);
		return tot;
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
