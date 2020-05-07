import java.io.Serializable;

public class Libro implements Serializable, EsComparable<Libro> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String titulo;
	private String autor;
	private String editorial;
	private float precio;
	
	public Libro(String titulo,String autor,String editorial,float precio) {
		this.setTitulo(titulo);
		this.setAutor(autor);
		this.setEditorial(editorial);
		this.setPrecio(precio);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

    @Override
	public String toString() {
		return "\n Libro [titulo=" + titulo + ", autor=" + autor + ", editorial=" + editorial + ", precio=" + precio + "]";
	}

	public boolean equals(Libro x) {

        boolean iguales = false;

        if (this.titulo == x.titulo)  {

            if (this.autor == x.autor) {

                if (this.editorial == x.editorial) {

                    if (this.precio == x.precio) {

                        iguales = true;

                    }

                }
            }

        }

        return iguales;

    }

    public boolean mayorQue(Libro dato) {

        return precio > dato.getPrecio();

    }
    
    
}
