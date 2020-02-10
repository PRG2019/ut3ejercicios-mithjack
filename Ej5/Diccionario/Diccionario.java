/*
 * @mithjack
 *	mejora: añadir el añadido de palabras a una función en vez de el main.
 *	se podria hacer el switch en una función para acortar el main
 */

package Diccionario;

import java.util.*;
public class Diccionario {
	public static Scanner sc=new Scanner(System.in);
	
	public static int buscar(Palabras[] palabras, int conpa, String palabra, int idioma) {
		int id=-1;
		if(idioma==2)
		for(int i=0; i<conpa;i++) {
			if(palabras[i].getPIngles().equals(palabra)) {
				id=i;
			}
		} else if(idioma==3)
			for(int i=0; i<conpa;i++) {
				if(palabras[i].getPEsp().equals(palabra)) {
					id=i;
				}
			} else 
				for(int i=0; i<conpa;i++) {
					if(palabras[i].getPFr().equals(palabra)) {
						id=i;
					}
				}
		return id;
	}
	
	public static void traducir(Palabras[] palabras, int id) {
		System.out.println(palabras[id]);
	}
	
	public static void main(String[]args) {
	Palabras[] palabras = new Palabras[100];
	int conpa=0, posic;
	
	boolean sw1=false, nopal=false;	//El primero es el interruptor del switch, el segundo nos garantiza que hayamos metido una palabra antes de hhacer la busqueda
	while(!sw1) {
		System.out.println("\nQue quieres hacer:");
		System.out.println("1. Insertar palabras");
		System.out.println("2. Traducir del Ingles");
		System.out.println("3. Traducir del Español");
		System.out.println("4. Traducir del Frances");
		System.out.println("5. Salir ");
		int men1=sc.nextInt();
		
		switch(men1) {
		
		case 1:
			System.out.println("Dime la palabra inglesa o * para volver al menu");
			String p1=sc.next();
			if(p1.equals("*")) break;

			System.out.println("Dime la palabra española o * para volver al menu");
			String p2=sc.next();
			if(p2.equals("*")) break;
			
			System.out.println("Dime la palabra francesa o * para volver al menu");
			String p3=sc.next();
			if(p3.equals("*")) break;
			
			Palabras añadir= new Palabras(p1,p2,p3);
			palabras[conpa]=añadir;
			conpa++;
			System.out.println();
			nopal=true;
			break;

			
		case 2:
			if(!nopal) System.out.println("Primero debes añadir una palabra\n");
			else {
				System.out.println("Que quieres traducir?");
				String pre=sc.next();
				if((posic=buscar(palabras,conpa,pre,men1))<0) {
					System.out.println("Palabra no introducida\n");
				}
				else {
					traducir(palabras, posic);
				}
			}
			break;
			
		case 3:
			if(!nopal) System.out.println("Primero debes añadir una palabra\n");
			else {
				System.out.println("Que quieres traducir?");
				String pre=sc.next();
				if((posic=buscar(palabras,conpa,pre,men1))<0) {
					System.out.println("Palabra no introducida\n");
				}
				else {
					traducir(palabras, posic);
				}
			}
			break;
			
		case 4:
			if(!nopal) System.out.println("Primero debes añadir una palabra\n");
			else {
				System.out.println("Que quieres traducir?");
				String pre=sc.next();
				if((posic=buscar(palabras,conpa,pre,men1))<0) {
					System.out.println("Palabra no introducida\n");
				}
				else {
					traducir(palabras, posic);
				}
			}
			break;
			
		case 5:
			sw1=true;
			break;
		}
	}
	}
}
