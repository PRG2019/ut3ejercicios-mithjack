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
	
	class Yema{
		Yema(){
			System.out.println("Yema");
		}
		}
	
	class Clara{
		Clara(){
			System.out.println("Clara");
		}
		}
	
	public static void main(String[]args) {
	Huevo2 huevo= new Huevo2();
	huevo.hacerClara();
	huevo.hacerYema();
	
	//si los hacemos static
	//Huevo2.hacerYema();
	//Huevo2.hacerClara();
	}
}



