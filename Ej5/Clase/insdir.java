package clase;

import java.util.Scanner;
public class insdir {
	public static Scanner sc=new Scanner(System.in);
	
	public static void mostrar(float[] notas) {
		 for(int j=0;j<5;j++)  
			 System.out.print(notas[j] + ", ");
		 System.out.println();
		 }
	
	public static void inDire(float[] notas, int n) {
		for(int i=1;i==n-1;i++) {
			float x=notas[i];
			int j=i;
			while(j>0 && x<notas[j-1]) {
				notas[j]=notas[j-1];
				j=j-1;
			}
			notas[j]=x;
		}
	}
	
	public static void main(String[]args) {
		float[]v= {4, 2, 9, 1, 3};
		mostrar(v);
		
		inDire(v,5);
		
		mostrar(v);
		
		
		
		
	}
	
	
	

}
