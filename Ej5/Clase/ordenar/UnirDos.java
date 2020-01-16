package ordenar;
import java.util.Scanner;
public class UnirDos {

	public static void notas(int[] a) {
		for(int k=0;k<a.length;k++) {
            for(int f=0;f<a.length-1-k;f++) {
                if (a[f]>a[f+1]) {
                	int auxnota;
                    auxnota=a[f];
                    a[f]=a[f+1];
                    a[f+1]=auxnota;
                }      
            }
		}
	}
	
	public static void leerNota(int[] a) {
		System.out.println("Notas de mayor a menor con su posición:");
        for(int f=0;f<a.length;f++) {
            System.out.println(a[f] + " posicion " +f);
        }
	}
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[]notas= {1,3,5,7};
		int[]notas2= {2,4,6,8};
		int[]notaf= new int[8];
		System.out.println("Datos copados en el vector");
		System.arraycopy(notas, 0, notaf, 0, notas.length);
		System.arraycopy(notas2, 0, notaf, 4, notas2.length);
		
		notas(notaf);
		leerNota(notaf);
		
		sc.close();	
	}
}
