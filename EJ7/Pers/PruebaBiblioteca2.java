/*
 *@autor:mithjack
 */
import java.util.*;
import java.io.*;
public class PruebaBiblioteca2 {

	@SuppressWarnings({ "rawtypes", "deprecation", "unused", "resource" })
	public static void main(String[] args) throws ExcepcionContenedor, FileNotFoundException {
		Scanner tec = new Scanner(System.in);
		File f=null;
		f=new File("Biblio.txt");

		boolean continuar = true;
		int dato;
		String titulo;
		String autor;
		String editorial;
		float precio;
		Biblioteca bibliotequita = new Biblioteca("Biblioteca 1");
		
		/*
		 * Añadimos aqui la lectura del documento de texto
		 */
		DataInputStream entrada=new DataInputStream(new FileInputStream("Biblio.txt"));
		try {
			while((titulo=entrada.readLine())!=null) {
				int contador=3;
				while(contador>0) {
					autor=entrada.readLine();
					contador--;
					editorial=entrada.readLine();
					contador--;
					precio=entrada.readFloat();
					bibliotequita.añadir(new Libro(titulo,autor,editorial,precio));
					contador--;
				}
			}
		}
		
		catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
		int pos;
		while (continuar) {
			System.out.println("1. Anyadir libro.");
			System.out.println("2. Eliminar libro.");
			System.out.println("3. Libro mas barato.");
			System.out.println("4. Número de libros existentes en la biblioteca.");
			System.out.println("5. Mostrar libros biblioteca.");
			//System.out.println("66. Purgar biblioteca.");
			int opcion = tec.nextInt();
			switch (opcion) {
			case 1:
				String Biblio = "Biblio.txt";
				
				try {
					FileOutputStream ficheroSalida = new FileOutputStream(Biblio, true);//al poner true el documento no se sobreescribira
					DataOutputStream d=new DataOutputStream(ficheroSalida);
					
					tec.nextLine();
					System.out.println("Titulo:");
					titulo = tec.nextLine();
					System.out.println("Autor:");
					autor = tec.nextLine();
					System.out.println("Editioral:");
					editorial = tec.nextLine();
					System.out.println("Precio");
					precio = tec.nextFloat();
					bibliotequita.añadir(new Libro(titulo,autor,editorial,precio));
					
					/*
					 * Añadira al documento cada parametro seguido de un salto de linea
					 */
					d.writeChars(titulo);
					d.writeChar('\n');
					d.writeChars(autor);
					d.writeChar('\n');
					d.writeChars(editorial);
					d.writeChar('\n');
					d.writeFloat(precio);
					d.writeChar('\n');
					d.close();
				}
				
				catch (FileNotFoundException e) {
					System.out.println("¡El fichero no existe!");
				} 
				
				catch (IOException e) {
					System.out.println(e.getMessage());
				} 
				
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
					break;
			
			case 2:
				tec.nextLine();
				System.out.println("Titulo:");
				titulo = tec.nextLine();
				bibliotequita.eliminar(titulo);
			break;
			
			case 3:
				System.out.println(bibliotequita.masbarato());
			break;
			
			case 4:
				bibliotequita.num();
			break;

			case 5:
				bibliotequita.mostar();
			break;
			
			/*case 66:
				File f2=null;
				f2=new File("Biblio.txt");
				Biblio = "Biblio.txt";
				try {
					FileOutputStream ficheroSalida = new FileOutputStream(Biblio, true);
					DataOutputStream d=new DataOutputStream(ficheroSalida);
					d.writeChar(' ');
					d.close();
				}
				
				catch (FileNotFoundException e) {
					System.out.println("¡El fichero no existe!");
				} 
				
				catch (IOException e) {
					System.out.println(e.getMessage());
				} 
				
				catch (Exception e) {
					System.out.println(e.getMessage());
				}
			break;
			*/			
			}
		}
	}
}
