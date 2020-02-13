package Ej19;

import java.util.*;

public class Ej19 {
	public static Scanner sc=new Scanner (System.in);
	public static Random r=new Random();

	public static void rellenar(int[][]mat) {
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				mat[j][i]=r.nextInt(9);
			}
		}
	}
	
	public static void mostrarG(int[][]mat, int[]vec) {
		boolean gan=false;
		for(int i=0;i<mat[0].length;i++){
			int cont=0;
            for(int j=0;j<mat.length;j++){
            	if(mat[j][i]==vec[j]) cont++;
            	System.out.print(mat[j][i]+" ");	
            }
    		if(cont==3&&!gan) {
    			System.out.println("Tiene "+cont+" numeros acertados");
    			gan=true;
    		}
    		else if(cont==3&&!gan) {
    			System.out.println("Tiene "+cont+" numeros acertados, pero ya hay un ganador");
    		}
    		else {
    			System.out.println("Tiene "+cont+" numeros acertados");
    		}
    		
		}
	}
	public static void mostrar(int[]mat) {
            for(int j=0;j<mat.length;j++){
            	System.out.print(mat[j]+" ");	
            }
            System.out.println();
	}
	
	public static void main(String[]args) {
		int loto[]= {r.nextInt(9),r.nextInt(9),r.nextInt(9)};
		int jugadores[][]=new int [3][10];
		System.out.print("El numero premiado es: ");
		mostrar(loto);
		
		rellenar(jugadores);
		System.out.println();
		mostrarG(jugadores, loto);
		
		
	}
}
	
