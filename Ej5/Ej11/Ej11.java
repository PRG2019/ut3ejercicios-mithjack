package Ej11;

import java.util.*;
public class Ej11 {
	public static Scanner sc=new Scanner (System.in);
	
	public static int dividir(int n) {
		boolean sw1=false;
		while(!sw1) {
			n=n-2;
			if(n==0||n==1) sw1=true;
		}
		return n;
	}
	
	public static boolean multiplo(int k, int num) {//En caso de que quieras introducir esto, tendrias que quitar el return solamente
		boolean sw1=false;
		for(int i=k;i>1;i--) {
			k=k-num;
			if(k==0) {
				sw1=true;
				i=0;
			}
		}
		return sw1;
	}
	
	public static void rellenar(int [][] mat, int num) {
		int ini=(num/2);
		System.out.println(ini);
		int i=ini;
		int j=0;
		boolean mult=false;
		boolean comp=false;
				for(int k=1;k<Math.pow(num, 2);k++) {
					if(k==1) {//Añadimos el 1o en num/2
						System.out.println("Coor i "+i+" j "+j+" valor k "+k);
						mat[i][j]=k;
					}
					else {
						comp=multiplo(k, num);
						
						if(mult&&!comp) {//Este salta tras pasar por un multiplo de num
							System.out.println("Ha pasado multiplo, i "+i+" j "+j+" valor k "+k);//comprobar la posición i, j de la matriz y el valor que le va a añadir
							j+=1;
							if(i<0) i=mat.length-1;
							if(j<0)j=mat[0].length;
							mult=false;
							mat[i][j]=k;
						}
						
					else if(!comp) {//Este salta si no es multiplo de num y no ha habido un multiplo antes
						i+=1;
						j-=1;
						System.out.println("No es multiplo i, "+i+" j "+j+" valor k "+k);//comprobar la posición i, j de la matriz y el valor que le va a añadir
						if(i>=mat.length) i=0;
						if(j<0) j=mat[0].length-1;
						mat[i][j]=k;
					}
					else {//Este salta si es multiplo
						i+=1;
						j-=1;
						System.out.println("Es multiplo, i"+i+" j"+j+" valor k "+k); //comprobar la posición i, j de la matriz y el valor que le va a añadir
						if(i>=mat.length) i=0;
						if(j<0) j=mat[0].length-1;
						mult=true;
						mat[i][j]=k;
					}
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
	
	public static void main(String[]args) {
		System.out.println("Dime N");
		int num=sc.nextInt();
	
		if(dividir(num)!=0&&num>0) {
			int mat[][]=new int[num][num];
			rellenar(mat, num);
			System.out.println();
			mostrar(mat);
		}else {
			System.out.println("Numero no valido");
		}
	}
}
