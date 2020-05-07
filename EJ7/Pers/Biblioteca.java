
public class Biblioteca<T> implements java.io.Serializable{
	private String nombre;
	private ContenedorOrdenado<Libro> biblioteca; 
	
	public Biblioteca(String nombre) {
		this.nombre = nombre;
		biblioteca = new ContenedorOrdenado<Libro>();
	}

	public Libro masbarato() throws ExcepcionContenedor {
		try{
			if(biblioteca.getDatoPos(0)==null) {
				throw new ExcepcionContenedor("No hay ningun libro en la biblioteca");
			}
		} catch(ExcepcionContenedor e) {
			System.out.println(e);
		}
		return biblioteca.getDatoPos(0);
    }

	
	public void añadir(Libro d) throws ExcepcionContenedor {
		try {
			biblioteca.anyadeDatoOrdenado(d);
		}  catch (ExcepcionContenedor ec) {
			System.out.println(ec);
		}
		
	}
	
	public void eliminar(String d) throws ExcepcionContenedor {
		try{
			biblioteca.eliminarDato(buscarnombre(d));
		}catch(ExcepcionContenedor ec) {
			System.out.println(ec);
			System.out.println("Error el titulo no se ha encontrado \n");
		}
	}
	
	public void num() {
		System.out.println(biblioteca.numElementos());
	}
	
	public void mostar() {
		System.out.println(biblioteca.toString());
	}
	
	public int buscarnombre(String dato){
		int pos = 0;
		for(int i=0;i<biblioteca.numElementos();i++) {
			if(dato.equals(biblioteca.getDatoPos(i).getTitulo())) {
				pos = i;
			}
		}
		
		return pos;
	}
}
