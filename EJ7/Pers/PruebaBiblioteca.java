import java.util.*;
import java.io.*;
public class PruebaBiblioteca {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ExcepcionContenedor {
		Scanner tec = new Scanner(System.in);
		
		boolean continuar = true;
		int dato;
		String titulo;
		String autor;
		String editorial;
		float precio;
		Biblioteca bibliotequita = new Biblioteca("Biblioteca 1");

		ObjectInputStream ois=null;
		try {
			File f=new File("Biblio.dat");
			FileInputStream fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			while(true) {
				Biblioteca b=(Biblioteca) ois.readObject();
				bibliotequita=b;
			}
		}
		
		catch (IOException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} 
		
		int pos;
		while (continuar) {
			System.out.println("1. Anyadir libro.");
			System.out.println("2. Eliminar libro.");
			System.out.println("3. Libro mas barato.");
			System.out.println("4. Número de libros existentes en la biblioteca.");
			System.out.println("5. Mostrar libros biblioteca.");
			System.out.println("66. Purgar biblioteca.");
			int opcion = tec.nextInt();
			switch (opcion) {
			case 1:
				String Biblio = "Biblio.dat";
				
				try {
					FileOutputStream ficheroSalida = new FileOutputStream(Biblio);
					ObjectOutputStream objetoSalida = new ObjectOutputStream(ficheroSalida);
					
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
					
					objetoSalida.writeObject(bibliotequita);
					objetoSalida.close();
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
			
			case 66:
				try{         
					File f=new File("Biblio.dat");
					System.out.println(f.getName() + " borrado");   
					f.delete();
				}
				
				catch(Exception e){  
					e.printStackTrace();  
				}  
			break;
			}

		}


	}

}
