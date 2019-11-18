package ej14;

public class Scuenta {
	//atributo
	private double saldo;
	private String titular;
	private long ncuenta;
	
	//Constructor
	Scuenta(){
		saldo=0.0;
		titular="Default";
		ncuenta=0;
	}
	Scuenta(double param){
		saldo=param;
	}
	
	//metodos
	public void reintegro(double param) {
		if(saldo-param>=0)	saldo=saldo-param;
		else System.out.println("No dispones de tanto saldo");
	}
	public void ingreso(double param) {
		saldo=saldo+param;
	}
	//-----------------------
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double param) {
		saldo=param;
	}
	
	//-----------------------
	public String getNom() {
		return titular;
	}
	public void setNom(String n) {
		titular=n;
	}
	//-----------------------
	public long getcuenta() {
		return ncuenta;
	}
	public void setncuenta(long c) {
		ncuenta=c;
	}
	
	public void mostrar() {
	System.out.println("Tu saldo actual: "+saldo);
	System.out.println("Titular de la cuenta: "+titular);
	System.out.println("N� de cuenta: "+ncuenta);
	}
	/*
	public String toString() {
		return "Tu saldo actual: "+saldo+"\nTitular de la cuenta: "+titular+"\nN� de cuenta: "+ncuenta;
		
	}
	*/
}
