package Ej11;

import java.util.*;
public class Ej11_2 {
	public static Scanner sc=new Scanner (System.in);
				
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
		int num2=num;
		//Comprobar si es par o impar
		boolean sw1=false;
		while(!sw1) {
			num2=num2-2;
			if(num2==0||num2==1) sw1=true;
		}
		
		//Si el numero2 (el sacado de comprobar par o impar, no es 0 y num es mayor que 0, seguira sino dara error
		if(num2!=0&&num>0) {
			int mat[][]=new int[num][num];
			
			//vamos a rellenar la matriz
			int ini=(num/2);
			System.out.println(ini);
			int i=ini;
			int j=0;
			boolean mult=false;
			boolean comp=false;
					for(int k=1;k<Math.pow(num, 2);k++) {
						comp=false;
						int aux=k;	//creamos un aux de k para comprobar si es multiplo abajo y sacar el boolean
						if(k==1) {	//Añadimos el 1o en num/2
							System.out.println("Coor i "+i+" j "+j+" valor k "+k);
							mat[i][j]=k;
						}
						else {
									//vamos a comprobar si es un multiplo o no
							for(int z=aux;z>1;z--) {
								aux=aux-num;
								if(aux==0) {
									comp=true;
									z=0;
								}
							}
							
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
			
			
			System.out.println();
			
			//Este es para mostrar la matriz, he puesto i2 y j2 porque estan declarados arriba y no puedo usarlos
			for(int i2=0;i2<mat[0].length;i2++){
	            for(int j2=0;j2<mat.length;j2++){
	            	System.out.print(mat[j2][i2]+" ");	
	            }
	            System.out.println();
			}
			
		}else {
			System.out.println("Numero no valido");
		}
	}
}
