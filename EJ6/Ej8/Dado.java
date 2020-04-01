package Ej8;

import java.util.Random;
public class Dado extends Sorteo{


	@Override
	public int lanzar() {
		Random rand=new Random();
		int posibilidades=rand.nextInt(6)+1;		
		return posibilidades;
	}
	
}
