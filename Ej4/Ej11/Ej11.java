package Ej11;

import java.util.*;
public class Ej11 {
public static Scanner sc=new Scanner(System.in);
public static double potencia(double x, int n) {	
	double resul=Math.pow(x,n);
	return resul;
	
}

public static void main(String[] args) {
	System.out.println("Dime base x");
	double x=sc.nextDouble();
	System.out.println("Dime exponente y");
	int y=sc.nextInt();
	
	System.out.println(potencia(x,y));
}
}
