package Ej19;

import java.util.*;

public class Ej19_2 {
	public static Scanner sc=new Scanner (System.in);
	public static Random r=new Random();

	
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
		
		//Mostramos el numero premiado
		System.out.print("El numero premiado es: ");
		for(int j=0;j<loto.length;j++){				//recorremos el vector
        	System.out.print(loto[j]+" ");			//mostramos la posicion j del vector
        }
        System.out.println();
        
        
		//rellenamos los jugadores con random 9
		for(int i=0;i<jugadores[0].length;i++) {	//recorremos la columna
			for(int j=0;j<jugadores.length;j++) {	//recorremos la fila
				jugadores[j][i]=r.nextInt(9);		//rellenamos las posiciones con un numero aleatorio de 0 a 9
			}
		}
		
		System.out.println();
		
		boolean gan=false;							//Si alguien gana 3 se activará
		for(int i=0;i<jugadores[0].length;i++){		//recorremos las columnas
			int cont=0;								//iniciamos el contador a 0
            for(int j=0;j<jugadores.length;j++){		//recorremos filas
            	if(jugadores[j][i]==loto[j]) cont++;	//si el numero ji es igual al j de loto sumamos 1 al contador
            	System.out.print(jugadores[j][i]+" ");	
            }
    		if(cont==3&&!gan) { //si no hay ganador y hay 3 aciertos activamos ganador y mostramos aciertos
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
}
	
