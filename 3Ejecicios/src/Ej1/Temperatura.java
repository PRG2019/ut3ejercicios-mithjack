/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej1;
public class Temperatura {
//atrib
private double temp;


//cons
Temperatura(){
	temp=0;
}
Temperatura (double param){
	temp=param;

}//met
public void celfar(/*double param*/) {
	double far = temp*1.8+32;
	System.out.println(far);
}
public void farcel(/*double param*/) {
	double far = (temp-32)/1.8;
	System.out.println(far);
}


public double getCel() {
	return temp;
}
public void setCel(double param) {
	temp=param;
}

public double getFar() {
	return temp;
}
public void setFar(double param) {
	temp=param;
}

public void mostrar(){
}

}