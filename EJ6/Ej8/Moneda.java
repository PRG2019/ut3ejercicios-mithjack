package Ej8;

import java.util.Random;
public class Moneda extends Sorteo {

	@Override
	public int lanzar() {
		Random rand=new Random();
		int posibilidades=rand.nextInt(2);
		if (posibilidades==0) System.out.println("Cara");
		else System.out.println("Cruz");
		return posibilidades;
	}

}
