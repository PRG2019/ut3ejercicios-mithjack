package ej7;

public class Conversor {
 public double unidad;
 
 
 Conversor(double u){
	 unidad=u;
 }
 
 public double millasAMetros() {
		unidad=unidad*1852;
		return unidad;	
	}
 public double millasAKilometros() {
		unidad=unidad/1.852;
		return unidad;	
	}
	
	
public double mostrar() {
	return unidad;
}
	
	
	
}
