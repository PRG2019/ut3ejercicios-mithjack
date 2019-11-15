package ej3;
import java.util.*;
public class Main {
public static void main (String[]args) {
	int numero;
	Scanner sc=new Scanner(System.in);
	System.out.println("Dame un numero");
	numero=sc.nextInt();
	MiNumero a=new MiNumero(numero);
	a.sacaDoble();
	a.sacaTriple();
	a.sacaCuadr();
	
	
	sc.close();
}
}
