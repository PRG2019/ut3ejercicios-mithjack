package EJ1;

import java.util.Scanner;

public class Ej1 {
	public static Scanner sc=new Scanner(System.in);
	public static final int N=51;
	
	public static void main(String[]args) {
		int[]vec=new int[N];
		rellenar(vec);
		System.out.println("Dime numero a buscar de 0 a 50");
		int num=sc.nextInt();
		numeros(vec,num);
	}
	
	public static void rellenar(int[]vec) {
		for (int i=0;i<N;i++) {
			vec[i]=i;	
		}
	}
	public static void numeros (int[] vec,int num) {
		for (int i=num;i<N;i++) {
			System.out.println(vec[i]);
		}
	}
}
