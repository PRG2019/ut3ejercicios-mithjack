package Ej5;

public class Huevo {
	public Huevo() {
		Huevo.Yema yema= new Huevo.Yema();
		yema.hacerYema();
		Huevo.Clara clara= new Huevo.Clara();
		clara.hacerClara();
	}
	
	class Yema{
		void hacerYema(){
			Yema yema=new Yema();
			System.out.println("yema");
		}
	}
	
	class Clara{
		void hacerClara(){
			Clara Clara=new Clara();
			System.out.println("clara");
		}
	}
	
	public static void main(String[]args) {
	Huevo huevo= new Huevo();
	}
}
