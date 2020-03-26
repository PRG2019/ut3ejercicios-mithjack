package Ej2;

class Prueba{
	protected String nombre;
	protected int ID;
	public String getIdent(){return nombre;}
	/**
	 * El nombre de la funcion es igual en ambos casos, solo hay que cambiar el nombre de una de ellas y compilara sin errores
	 * public int getIdent(){return ID;}		
	 */
	public int getID(){return ID;}
}
