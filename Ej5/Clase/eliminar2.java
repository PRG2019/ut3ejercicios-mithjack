package clase;

import java.util.*;
public class eliminar2 {
public static Scanner sc=new Scanner(System.in);

	
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

//aqui inserto
public static int escNotas(float[] notas) {
	 int n=0;
	 System.out.println("Dime nota:");
	 float valor=sc.nextFloat();
	 while(valor>=1) {
		notas[n]=valor;
		n++;
		System.out.println("Dime nota:");
		valor=sc.nextInt();
	}
	 return n;
}

public static void main(String[]args) {
	//float[]v= {2.5F, 3.5F, 4.5F, 7.9F, 8.5F};
	//float[]v= {2, 4, 6, 8, 10};
	float[]v=new float[100];
	int total=escNotas(v);
	mostrar(v, total);
	//System.out.println(Arrays.toString(v));

	System.out.println("Dime valor a buscar");
	float val=sc.nextFloat();
	mostrar(v, total);
	int n = elimina(v, total, val);
	//System.out.println(elimina(v, 5, val));

	mostrar(v, n);
}

}

//borrar ocurrencias repetidas en el vector