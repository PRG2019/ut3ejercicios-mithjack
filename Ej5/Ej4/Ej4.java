package Ej4;
/**
 * @author mithjack
 */
import java.util.*;
public class Ej4 {
	private static Scanner sc=new Scanner(System.in);

	public static int[] crear() {
		int vec[]=new int[50];
		Random r=new Random();
		for(int i=0;i<vec.length;i++) {
			vec[i]=r.nextInt(99) ;
		}
		return vec;
	}
	
	public static void mostrar(int[]vec) {	
		 for(int j=0;j<vec.length;j++)  
			 System.out.print(vec[j]+",");
		 System.out.println();
		 
	}
	public static void inverso(int[]vec) {	
		 for(int j=vec.length-1;j>=0;j--)  
			 System.out.print(vec[j]+",");
		 System.out.println();
		 
	}
	
	public static void main(String[]args) {
		int vec[]=crear();
		System.out.print("Tu vector es ");
		mostrar(vec);
		System.out.print("El inverso es ");
		inverso(vec);
		
	}
	
}
