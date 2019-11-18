package ej11;
import java.util.*;
public class Main {
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	int papas, choco;
	System.out.println("Cuantas papas tienes:");
	papas=sc.nextInt();
	System.out.println("Cuanto choco tienes:");
	choco=sc.nextInt();
	Almacen a=new Almacen(papas,choco);
	System.out.println("Puedes alimentar a: "+a.getClientes());




}
}
