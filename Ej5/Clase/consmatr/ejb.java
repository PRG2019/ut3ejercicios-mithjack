/*
 * @mithjack
 */
package consmatr;
import java.util.*;
public class ejb {
	public static Scanner sc=new Scanner (System.in);

	public static void rellenar(int[][]mat) {
		for(int i=0;i<=3;i++) 
			for(int j=0;j<=4;j++) {
				mat[j][i]=sc.nextInt();
		}	
	}
	public static void mostrar(int[][]mat) {
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=4;j++) {
				System.out.print(mat[j][i]+" ");
		}
			System.out.println();	
		}
	}
	
	public static void vertices(int[][]mat) {
		System.out.println();
		System.out.print(mat[0][0]+" ");
		System.out.println(mat[mat.length-1][0]);
		System.out.print(mat[0][mat[0].length-1]+" ");
		System.out.println(mat[mat.length-1][mat[0].length-1]);
	}
	
	public static void invertir(int[][]mat, int m, int n) {
		System.out.println();

		System.out.print(mat[0][0]+" ");
		System.out.println(mat[m-1][0]);
		System.out.print(mat[0][n-1]+" ");
		System.out.println(mat[m-1][n-1]);
	}
	
	public static void tercer(int[][]mat, int m, int n) {
		System.out.println();

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0&&j==0||i==0&&j==n-1||i==m-1&&j==0||i==m-1&&j==n-1) System.out.print(mat[i][j]+" ");
				else System.out.print("*"+" ");
			}
			System.out.println();
			}
		}
		
	
	public static void main(String[]args) {
		int mat[][]=new int[5][4];
		rellenar(mat);
		System.out.println();
		mostrar(mat);
		
		vertices(mat);
		invertir(mat,5,4);
		tercer(mat,5,4);
		
		
		sc.close();
	}
	
}
