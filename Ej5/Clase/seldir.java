package clase;

import java.util.Scanner;
public class seldir {
	public static Scanner sc=new Scanner(System.in);
	
	public static void mostrar(int[] notas) {
		 for(int j=0;j<5;j++)  
			 System.out.print(notas[j] + ", ");
		 System.out.println();
		 }
	
	public static void inDire(int[] notas, int n) {
		int i, j, k, x;		
		for(i=0;i<n-1;i++) {
			k=i;
			x=notas[i];
			for(j=i+1;j<n;j++) {
				if(notas[j]<x) {
					x=notas[j];
					k=j;
				}
			}
			notas[k]=notas[i];
			notas[i]=x;
		}
	}
	
	public static void main(String[]args) {
		int[]v= {4, 2, 9, 1, 3};		
		inDire(v,5);
		mostrar(v);
		
		
		
		
	}
	
	
	

}
