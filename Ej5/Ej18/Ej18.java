package Ej18;

import java.util.Scanner;
public class Ej18 {
	private static Scanner sc=new Scanner(System.in);

	public static void rellenar(int[][]mat) {
		for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
            	System.out.println("Introduce el valor "+j+" "+i);
            	mat[j][i]=sc.nextInt();	
            }
		}
	}
	public static void mostrar(int[][]mat) {
		for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
            	System.out.print(mat[j][i]+" ");	
            }
            System.out.println();
		}
	}

	public static int diagonal(int[][]mat) {
		int diagonal=0, num=0;
		for(int i=0;i<mat[0].length;i++){
			for(int j=0;j<mat.length;j++){
				if(i==num&&j==num) diagonal+=mat[j][i];
			}
		num++;
		}
		//System.out.println(diagonal);
		return diagonal;
	}
	//1 2 3 4 5 6 7 8 9
	public static int invertida(int[][]mat) {
		int diagonal=0, num=0, col=mat[0].length-1;
		for(int i=col;i<mat.length;i--){
			for(int j=0;j<mat.length;j++){
				if(i==col&&j==num) diagonal+=mat[j][i];
			}
		num++;
		col--;
		}
		//System.out.println(diagonal);
		return diagonal;
	}


	public static void main(String[]args) {
		int num=3;
		int mat[][]=new int[num][num];
		rellenar(mat);
		System.out.println();
		mostrar(mat);
		System.out.println();
		System.out.println("La diagonal es "+diagonal(mat));
		System.out.println("La inversa es "+invertida(mat));
	}
}
