package clase;

import java.util.Scanner;
public class intdirbur {
	public static Scanner sc=new Scanner(System.in);
	
	public static void mostrar(int[] notas) {
		 for(int j=0;j<5;j++)  
			 System.out.print(notas[j] + ", ");
		 System.out.println();
		 }
	
	public static void inDireBur(int[] notas, int n) {
		int i, j, x = 0;
		//boolean ord=false;
		for(i=0;i<n-1;i++) {
			//ord=true;
			for(j=n-1;j>i;j--) 
				if(notas[j-1]>notas[j]) {
					x=notas[j-1];
					notas[j-1]=notas[j];
					notas[j]=x;
					//ord=false;
				}
			
		}
	}
	
	public static void main(String[]args) {
		int[]v= {4, 2, 9, 1, 3};		
		inDireBur(v,5);
		mostrar(v);
		
		
		
		
	}
	
	
	

}
