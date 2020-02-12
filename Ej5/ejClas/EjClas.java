package ejClas;

import java.util.*;
public class EjClas {
	public static Scanner sc=new Scanner (System.in);
	
	public static void mostrar(int[]vec, int ins) {
		System.out.println("El vector es: ");
		for(int i=0;i<ins;i++) {
			System.out.print(vec[i]+" ");
		}
		System.out.println();
	}
	
	public static void insertar(int[]vec, int ins) {
		System.out.println("Dime numero");
		if(ins==0) {
			vec[0]=sc.nextInt();
		}
		else {
			int aux;
			int num=sc.nextInt();
			int pos=buscar(vec,ins,num);
			for(int i=pos;i<ins+1;i++) {
				aux=vec[i];
				vec[i]=num;
				num=aux;
			}
		}
	}
	
	public static int buscar(int[] vec, int ins, int numero) {
		boolean encontrado=false;
		int pos=0;	
		
			for(int i=0;i<ins;i++) {
				System.out.println(vec[i]);
				if(numero==vec[i]) {
					encontrado=true;
					pos=i;
					break;
				} else if(numero>vec[i]) {
					pos=i+1;
				} else if(numero<vec[i]) {
					pos=i;
					break;
				}
			}
		
		if(encontrado) {
			System.out.println("Está en la posición "+pos+"\n");
		}
		else {
			System.out.println("No está en ninguna posicion, deberia estar en la "+pos+"\n");
		}
		return pos;
	}
	
	public static void eliminar(int[] vec, int ins) {
        System.out.println("Dime numero");

        if(ins == 1) {
            vec[0] = 0;
        } else {
            int aux;
            int num=sc.nextInt();
            int pos=buscar(vec,ins,num);

            for(int i=pos; i<ins; i++) {
                int nPos=i+1;
                int nValor=0;

                if (nPos>=ins) {
                    nPos=i;
                } else {
                    nValor=vec[nPos];
                }

                aux=nValor;
                vec[i]=nValor;
                num=aux;
            }
        }
    }
	
	public static void main(String[]args) {
		int vec[]=new int[5];
		int me1, ins=0;
		boolean sw1=false;
		while(!sw1) {
			System.out.println("Que quieres hacer");
			System.out.println("1. Insertar");
			System.out.println("2. Buscar");
			System.out.println("3. Eliminar");
			System.out.println("4. Mostrar");
			System.out.println("5. Salir");
			me1=sc.nextInt();
			System.out.println();
			switch(me1) {
			
			case 1://insertar
				if(ins==vec.length) System.out.println("El vector está lleno, borra algo primero");
				else {
					insertar(vec,ins);
					ins++;
					System.out.println();
				}
				break;
				
			case 2://buscar
				System.out.println("Que numero quieres buscar");
				int num=sc.nextInt();
				buscar(vec, ins, num);
				break;
				
			case 3://eliminar
				if(ins==0)System.out.println("No hay nada que borrar");
				else {
					eliminar(vec,ins);
					ins--;
				}
				break;
				
			case 4://mostrar
				mostrar(vec, ins);
				break;
				
			case 5:
				sw1=true;
				break;

			}
		}
	}
}
