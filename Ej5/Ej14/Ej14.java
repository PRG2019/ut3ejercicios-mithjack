
package Ej14;
/*
 * @mithjack
 */
import java.util.*;
public class Ej14 {
	public static Scanner sc=new Scanner(System.in);
	
	public static int rellenar(int[]vec, int tot, int pos) {
		boolean men=false;
		for(int i=0;i<vec.length;i++) {
			vec[i]=sc.nextInt();
			if(!men) {
				if(vec[i]<0) {
					pos=i;
					men=true;
				}
			}
		}
		return pos;
	}
	
	public static void main(String[]args) {
		int tot=5, posneg=-1;
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
