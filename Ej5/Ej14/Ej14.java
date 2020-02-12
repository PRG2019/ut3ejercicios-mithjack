package Ej14;

import java.util.*;
public class Ej14 {
	public static Scanner sc=new Scanner(System.in);
	
	public static int rellenar(int[]vec, int tot, int pos) {
		int aux=0;
		boolean men=false;
		for(int i=0;i<vec.length;i++) {
			aux=sc.nextInt();
			vec[i]=aux;
			if(!men) {
				if(aux<0) {
					pos=i;
					men=true;
				}
			}
		}
		return pos;
	}
	
	public static void main(String[]args) {
		int tot=50, posneg=-1;
		int vec[]=new int[tot];
		
		posneg=rellenar(vec, tot, posneg);
		if(posneg==-1) {
			System.out.println("No hay numeros negativos en el vector");
		}
		else { 
			System.out.println("El negativo esta en la posición del vector "+posneg);
		}
	}
}
