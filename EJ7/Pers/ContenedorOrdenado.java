import java.util.Vector;
import java.io.Serializable;


public class ContenedorOrdenado <T extends EsComparable<T>>implements Serializable{
	private Vector<T> datos;

	/** Construye un Contenedor de datos por defecto
	 * de 10 elementos
	 * 
	 */
	public ContenedorOrdenado() {
		datos= new Vector<T>();
	}
	
	/**
	 * Construye un Contenedor de datos con parámetros de entrada:
	 * Capacidad int
	 * @return
	 */
	public ContenedorOrdenado(int cap){
		datos= new Vector<T>(cap);
	}
	
	/**
	 * Nos indica si el contenedor esta o no lleno
	 * @return boolean
	 */
	private boolean contenedorLleno(){
		boolean rdo;
		if (datos.size()==datos.capacity())
			rdo = true;
		else
			rdo = false;
		return rdo;
	}
	/**
	 * Anyade un dato ordenado que le pasamos como parametro al contenedor
	 * @param dato
	 * @return booleano: Si se puede anyadir o no el dato al contenedor
	 * @throws ExcepcionContenedor 
	 */
	public boolean anyadeDatoOrdenado(T dato) throws ExcepcionContenedor{
		if (datos.size()==datos.capacity()) throw new ExcepcionContenedor("Error! est� llena la biblioteca");
		else {
		boolean ok=false;
		
		int i=0;
		while (i<datos.size() && (dato.mayorQue(datos.elementAt(i))) ){
		
			i++;
		}
		datos.add(i,dato);
		ok= true;
		
		return ok;
		}
	}
	/**
	 * Metodo para obtener el dato que está en una determinada posición
	 * @param pos posición del elemento que queremos obtener
	 * @return el elemento que está en esa posición
	 */
	public T getDatoPos(int pos){
		T res=null;
		if(pos < datos.size())
			res= datos.elementAt(pos);
		
		return res;
	}
	/**
	 * Método para eliminar un dato del contenedor
	 * @param dato que queremos eliminar del contenedor
	 * @throws ExcepcionContenedor 
	 */
	public void eliminarDato(int dato) throws ExcepcionContenedor{
		if (dato<0) throw new ExcepcionContenedor("Error! no existe ese dato"); //Si la posicion es <0 porque no existe salta error
		else{
			datos.remove(dato);
		}
	}
	
	/**
	 * Método que devuelve el número de datos actuales
	 * existentes en el contenedor
	 * @return número de datos del contenedor
	 */
	public int numElementos(){
		return datos.size();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Biblioteca \n libros=" + datos;
	}
	/**
	 * Método para buscar un dato en el contenedor
	 * @param dato a buscar
	 * @return booleano indicando si el dato se encuentra o no en el contenedor.
	 */
	public boolean buscarDato(T dato){
		boolean esta= false;
		
		int i=0;

		while (i<datos.size() && dato.mayorQue(datos.elementAt(i))) //!(dato.equals(datos.elementAt(i))))
			i++;

		//Elemento esta en el vector
		if (i<datos.size()) 
			esta= true;

		
		return esta;
	}
	

	/**
	 * Método para buscar un dato en el contenedor
	 * @param dato a buscar
	 * @return entero indicando si la posicion del dato en el contenedor, -1 si no esta
	 */
	public int buscarDatoPos(T dato){
		int pos=-1;
		
		int i=0;
		while (i<datos.size() && dato.mayorQue(datos.elementAt(i))) //!(dato.equals(datos.elementAt(i))))
			i++;
		
		//Elemento esta en el vector
		if (i<datos.size())
			pos=i;
		/*
		 * Si no est� dentro del limite del array nos mostrar� e� error del array, tambien podriamos ponerlo con ExcepcionContenedor
		 */
		if(pos<0) {
			throw new ArrayIndexOutOfBoundsException("No est� dentro del array"); 
		}
		else{
			return pos;
		}

	}
	
	
	
}
