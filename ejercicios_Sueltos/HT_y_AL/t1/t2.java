package t1;
import java.util.*;
public class t2 {
	
	public static double media(ArrayList<Integer>in) {
		double media=0;
		double suma = 0;
		for(Integer i: in){
		suma = suma+i;
		}		
		media=suma/in.size();
		return media;
	}
	
	public static double mediaI(ArrayList<Integer>in) {
		double media=0;
		double suma = 0;

		Iterator it = in.iterator();
		while(it.hasNext())	suma+=(int)it.next() ;
		
		media=suma/in.size();
		return media;
	}
	
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>numeros =new ArrayList<Integer>();
		int n;
		
		System.out.println("Dime las notas de tus alumnos. Pon 0 para acabar: ");
		System.out.println("Nota: ");
		n = sc.nextInt();

		while(n != 0){
		numeros.add(n);
		System.out.println("Dime las notas de tus alumnos. Pon 0 para acabar: ");
		System.out.println("Nota: ");
		n = sc.nextInt();

		}
		System.out.println("Ha introducido: " + numeros.size() + " notas:");
		System.out.println(numeros);
		System.out.println();
		
		System.out.println(media(numeros));
		System.out.println();
		
		System.out.println(mediaI(numeros));
		sc.close();
	}
}
