package Ej5;

import java.util.Scanner;
public class Ej5 {
	private static Scanner sc=new Scanner(System.in);
	
	public static int rellenar(int[]vec, int med) {
		for(int i=0;i<vec.length;i++) {
			System.out.println("Dime numero "+i);
			vec[i]=sc.nextInt();
			med+=vec[i];
		}
		return med;
	}
	public static void supMedia(int[]vec, int media) {
		System.out.println("La media es "+media);
		System.out.println("Los numeros que la superan son: ");
		for(int i=0;i<vec.length;i++) {
			if(vec[i]>media) System.out.print(vec[i]+" ");
		}
	}
	public static void main(String[]args) {
		int num=20;
		int vec[]=new int[num];
		int media=0;
		
		media=rellenar(vec, media)/num;
		supMedia(vec, media);
		
		
	}

}
