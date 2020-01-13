package Ej2;

import java.util.Scanner;

public class Ej2 {
	public static Scanner sc=new Scanner(System.in);
	public static final int N=51;
	
	public static void main(String[]args) {
		int[]vec=new int[N];
		rellenar(vec);
		System.out.println("Dime numero minimo a buscar de 0 a 50");
		int numn=sc.nextInt();
		System.out.println("Dime numero maximo a buscar de 0 a 50");
		int numm=sc.nextInt();
		if (numm>=N) System.out.println("No puede ser ese numero el maximo");
		else numeros(vec,numn,numm);
	}
	
	public static void rellenar(int[]vec) {
		for (int i=0;i<N;i++) {
			vec[i]=i;	
		}
	}
	public static void numeros (int[] vec,int numn, int numm) {
		for (int i=numn;i<=numm;i++) {
			System.out.println(vec[i]);
		}
	}
}
