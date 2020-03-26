package Ej5;

public class Huevo2 {

	public Yema hacerYema(){
		Yema yema=new Yema();
		return yema;
		
	}
	public Clara hacerClara(){
		Clara Clara=new Clara();
		return Clara;
	}
	
	static class Yema{
		Yema(){
			System.out.println("Yema");
		}
		}
	
	static class Clara{
		Clara(){
			System.out.println("Clara");
		}
		}
	
	public static void main(String[]args) {
	Huevo2 huevo= new Huevo2();
	huevo.hacerClara();
	huevo.hacerYema();
	//si hacemos static los metodos
	//Huevo2.hacerYema();
	//Huevo2.hacerClara();
	
	//Creandolos directamente desde el main
	Huevo2.Yema hy=new Huevo2.Yema();
	Huevo2.Clara hc=new Huevo2.Clara();
	}
}
