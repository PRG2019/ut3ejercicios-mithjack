package Ej3;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Orden {
	public static void Ordena() {
		try {
			ArrayList<Integer>num=new ArrayList<Integer>();
			FileReader fr=new FileReader("NUM.txt");
			BufferedReader br=new BufferedReader(fr);
			String s;
			while((s=br.readLine()) !=null) {
				int numero=Integer.parseInt(s);
				num.add(numero);
			}
			num.forEach((n)->System.out.print(n+" "));
			System.out.println("\nOrdenado");
			Collections.sort(num);
			num.forEach((n)->System.out.print(n+" ")); 
			if(fr!=null) fr.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws IOException {
		Ordena();
	}
}
