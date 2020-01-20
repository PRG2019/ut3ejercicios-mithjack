package clase;

import java.util.*;
public class eliminar {
public static int elimina(float[]v, int n, float x) { //vector, cantidad elementos vector, numero que quieres buscar
	int pos=-1;
	int elem=0;
	for(int i=0; i<n && pos ==-1;i++) 
		if (v[i]==x) {
			pos=i;
		}
		
	if (pos== -1) {	//no encontrado
			elem=n;
		}
		else{
			for(int i=pos; i<n-1;i++) {
			v[i]=v[i+1];	
			}
			elem=n-1;
		}
	
	return elem;
}

public static void mostrar(float[] notas, int n) {
	 
	 for(int j=0;j<n;j++) 
		 
		 System.out.print(notas[j] + ", ");
	 
	 System.out.println();
	 }


public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	//float[]v= {2.5F, 3.5F, 4.5F, 7.9F, 8.5F};
	float[]v= {2, 4, 6, 8, 10};
	
	System.out.println(Arrays.toString(v));
	//System.out.println("Dime cantidad elementos");
	//int pos=sc.nextInt();
	System.out.println("Dime valor a buscar");
	float val=sc.nextFloat();
	mostrar(v, 5);
	int n = elimina(v, 5, val);
	//System.out.println(elimina(v, 5, val));
	//System.out.println(Arrays.toString(v));
	mostrar(v, n);
	sc.close();
}

}

//borrar ocurrencias repetidas en el vector