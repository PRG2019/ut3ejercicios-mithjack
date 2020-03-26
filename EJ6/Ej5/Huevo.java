package Ej5;

import java.util.Scanner;
public class Huevo {

	class Yema{
		Yema(){	
			System.out.println("yema");
		}
	}
	
	class Clara{
		Clara(){
			System.out.println("clara");
		}
	}
	
	public void hacerYema(){
		Yema yema=new Yema();
	}
	
	public void hacerClara(){
		Clara Clara=new Clara();
	}
	
	public void main() {
		Huevo.this.hacerYema();
		Huevo.this.hacerClara();
	}

}

class test{
	public static void main(String[]args) {
		Huevo huevo=new Huevo();
		huevo.main();
	}
}

