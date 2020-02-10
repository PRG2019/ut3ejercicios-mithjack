/*
 * @mithjack
 */
package Diccionario;

public class Palabras {

	private String p1;
	private String p2;
	private String p3;

	public Palabras(String p1, String p2, String p3) {
	this.p1=p1;
	this.p2=p2;
	this.p3=p3;
	}

	public String getPIngles(){
		return p1;	
	}
	public String getPEsp(){
		return p2;	
	}
	public String getPFr(){
		return p3;	
	}
	
	public String toString() {
		return "La palabra se dice: Ingles: "+p1+", Español: "+p2+", Frances: "+p3; 
	}
}
