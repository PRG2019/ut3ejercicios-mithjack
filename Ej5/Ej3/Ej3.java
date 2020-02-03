/****
 * @author mithjack
 */
package Ej3;

import java.util.Scanner;
public class Ej3 {
	private static Scanner sc=new Scanner(System.in);
	private static int cont=7;
	
	public static void iniciar(int[]vec) {
			for(int i=0;i<8;i++) {
			System.out.println("Introduce valor inicial");
			vec[i]=sc.nextInt();
			}
				int i, j, x = 0;
				for(i=1;i<8;i++) {
					for(j=7;j>i;j--) 
						if(vec[j-1]>vec[j]) {
							x=vec[j-1];
							vec[j-1]=vec[j];
							vec[j]=x;
						}
				}
	}
	
	public static void añadir(int[]vec,int num) {
		vec[cont+1]=num;
		cont++;
		ordenar(vec);
	}
			

	
	public static void ordenar(int[]vec) {
		int i, j, x = 0;
		for(i=0;i<cont;i++) {
			for(j=cont;j>i;j--) 
				if(vec[j-1]>vec[j]) {
					x=vec[j-1];
					vec[j-1]=vec[j];
					vec[j]=x;
				}
		}
	}
	
	public static void mostrar(int[]vec) {	
		 for(int j=0;j<vec.length;j++)  
			 System.out.print(vec[j]+",");
		 System.out.println();
		 
	}
	public static void main(String[]args) {
	
	int[]vec=new int[15];
	
	iniciar(vec);
	System.out.println("Introduce un numero entero");
	int num=sc.nextInt();
	añadir(vec,num);
	
	mostrar(vec);
	}
	
}

