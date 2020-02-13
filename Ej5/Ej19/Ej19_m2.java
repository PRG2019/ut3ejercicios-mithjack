package Ej19;

import java.util.*;

public class Ej19_m2 {
	public static Scanner sc=new Scanner (System.in);
	public static Random r=new Random();

	public static void rellenar(int[][]mat) {
		for(int i=0;i<mat[0].length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(j<mat.length-1) {
					mat[j][i]=r.nextInt(9);
				}
				else {
					mat[j][i]=r.nextInt(49);
					}
			}
		}
	}
	
	public static void mostrarG(int[][]mat, int[]vec) {
		boolean gan=false;
		for(int i=0;i<mat[0].length;i++){
			int cont=0;
			boolean reint=false, nc=false;
			
            for(int j=0;j<mat.length;j++){
            	if(mat[j][i]==vec[j]) cont++;
            	if(mat[mat.length-1][i]==vec[vec.length-1]) nc=true;
            	if(mat[mat.length-2][i]==vec[vec.length-2]) reint=true;
            	System.out.print(mat[j][i]+" ");	
            }
            
    		if(cont==3&&!gan) {
    			System.out.println("Tiene "+cont+" numeros acertados");
    			if(nc) System.out.print(" y además tiene numero complementario!");
    			System.out.print(" Felicidades al ganador");
    			gan=true;
    		}
    		
    		else if(cont==3&&!gan) {
    			System.out.println("Tiene "+cont+" numeros acertados, pero ya hay un ganador");
    			if(nc) System.out.print(" y además tiene numero complementario!.");

    		}
    		
    		else {
    			System.out.print("Tiene "+cont+" numeros acertados");
    			if(reint) System.out.print(", tiene reintegro");
    			if(nc) System.out.print(" y además tiene numero complementario!.");
    			System.out.println();
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
		int loto[]= {r.nextInt(9),r.nextInt(9),r.nextInt(9),r.nextInt(49)};
		int jugadores[][]=new int [4][10];
		System.out.print("El numero premiado es: ");
		mostrar(loto);
		
		rellenar(jugadores);
		System.out.println();
		mostrarG(jugadores, loto);
		
		
	}
}
	
