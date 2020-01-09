package Ej16;

import java.util.*;

public class Ej16 {
	//n!=n*n-1!
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
		for(long i=1;i<=l;i++) {
			rdo*=i;
		}
		return rdo;
	}
	public static long serie(long n) {
		long rdo;
		if(n==1) rdo=0;
		else rdo=n+fact(serie(n-1));
		return rdo;
	}
	
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		long numero;
		numero=sc.nextLong();
		System.out.println(serie(numero));
		
		sc.close();
	}
}
