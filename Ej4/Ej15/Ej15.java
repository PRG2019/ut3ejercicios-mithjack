package Ej15;

import java.util.*;
//n!=n*n-1!
public class Ej15 {

	//Recursivo
	/**
	public static long fact(long l) {
		long rdo;
		if (l==0) rdo=1;
		else rdo=l*fact(l-1);
		return rdo;
	}**/
	
	public static long fact(long l) {
		long rdo=1;
		for(int i=1;i<=l;i++) {
			rdo*=i;
		}
		return rdo;
	}
	public static long serie(int n) {
		long rdo;
		if(n==1) rdo=0;
		else rdo=n+fact(serie(n-1));
		return rdo;
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int numero;
		numero=sc.nextInt();
		System.out.println(serie(numero));
		
		sc.close();
	}
}
