/****
 * @author Alejandro Javier 5 3  0 1
 */
package EJ13;

import java.util.Scanner;

public class Ej13 {
	public static Scanner sc=new Scanner(System.in);

	public static void mostrar(int[]v) {
		int[]casa= {0,1,2,3,4,5,6,7,8,9};
		ordenVoto(v,casa);
		 for(int j=0;j<v.length;j++)  
			 System.out.println("Puerta "+casa[j]+" "+v[j] + " votos");
		 System.out.println();
			ordenVotoDes(v,casa);
			 for(int j=0;j<v.length;j++)  
				 System.out.println("Puerta "+casa[j]+" "+v[j] + " votos");
			 System.out.println();
		 
	}

	/**public static void ordenVoto(int[] v, int[]v2) {
		int i, z, j, k, x, y;		
		for(i=0;i<v.length-1;i++) {
			k=i;
			x=v[i];
			y=v2[i];
			for(j=i+1;j<v.length;j++) {
				if(v[j]<x) {
					x=v[j];
					y=v2[j];
					k=j;
					
					v[k]=v[i];
					v2[k]=v[i];
					v[i]=x;
					v2[i]=y;
				}
			}

			
		}
	}*/
	
	public static void ordenVoto(int[] v, int[]v2) {
		int i, j, x = 0;
		boolean ord=false;
		for(i=0;i<v.length-1;i++) {
			ord=true;
			for(j=v.length-1;j>i;j--) 
				if(v[j-1]>v[j]) {
					x=v[j-1];
					v[j-1]=v[j];
					v[j]=x;
					x=v2[j-1];
					v2[j-1]=v2[j];
					v2[j]=x;
					ord=false;
				}
		}
	}
	
	public static void ordenVotoDes(int[] v, int[]v2) {
		int i, j, x = 0;
		boolean ord=false;
		for(i=0;i<v.length-1;i++) {
			ord=true;
			for(j=v.length-1;j>i;j--) 
				if(v[j-1]<v[j]) {
					x=v[j-1];
					v[j-1]=v[j];
					v[j]=x;
					x=v2[j-1];
					v2[j-1]=v2[j];
					v2[j]=x;
					ord=false;
				}
		}
	}
	
	
	public static int votacion(boolean[]r, int[]v) { 
		int emitido=0, n, vo=0, contador=0;
		boolean fin=false;
		while(!fin) {
			if(contador==10) fin=true;
			System.out.println("n� Puerta");
			n=sc.nextInt();
			if(n>9) System.out.println("No existe esa puerta");
			else {
			System.out.println("voto");
			vo=sc.nextInt();
			if(r[n]==true) System.out.println("Ya has votado");
			else {
				if(vo>=0&&vo<10) {
					v[vo]+=1;
					r[n]=true;
					emitido++;
				}
				else fin=true;
				}
			}
		}
	return emitido;
}
	
public static void main(String[]args) {
	boolean[]votos= {false,false,false,false,false,false,false,false,false,false};
	int[]resul=new int[10];
	int votosR=votacion(votos,resul);
	System.out.println("Se han emitido "+votosR+" votos de 10 vecinos");
	mostrar(resul);
	//intercambioDirecto(resul);
}

}

class puerta{
	private int puerta;
	private int voto;
	public puerta(int puerta,int voto) {
		
		puerta=this.puerta;
		voto=this.voto;

	}
}
