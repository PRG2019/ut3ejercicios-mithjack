package Pez;

public class Pez implements Cloneable {
private String nombre;

public String getNombre(){
	return this.nombre;
}

public void setNombre(String nombre) {
	this.nombre=nombre;
}



public Object clone() {
	Object Pez2=null;
	try {
		Pez2=super.clone();
    	}
	catch(CloneNotSupportedException ex){
		System.out.println("No se puede duplicar.");
	}
	
	return Pez2;
	}



public boolean equals(Object pez) {		
	boolean ig=false;
	Pez p = (Pez) pez;
	if (this.nombre == p.nombre) {
		ig=true;
	}
	return ig;
}
}