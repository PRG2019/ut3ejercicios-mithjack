package Ej1;

public class Encargado extends Empleado {

	protected Encargado(int x) {
		super(x);
	}

	@Override
	public int getSueldo(){
		return sueldo+((sueldo*10)/100);
	}

}
