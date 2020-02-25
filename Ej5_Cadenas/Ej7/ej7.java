package Ej7;
import java.util.*;
public class ej7 {
public static Scanner sc=new Scanner (System.in);
public static void main(String[]args) {
	System.out.println("Dime palabra");
	String palabra=sc.nextLine(), pal2="", mayo="";
	
	int lon=0;
	for(int i=0;i<palabra.length();i++) {
		if(palabra.charAt(i)!=' ') {
			pal2+=palabra.charAt(i);
		}
		else {
			if(pal2.length()>lon) {
				lon=pal2.length();
				mayo=pal2;
				pal2="";
			}
		}
	}
	if(pal2.length()>lon) {
		lon=pal2.length();//longitud de la palabra
		mayo=pal2;//intercambio mayo por la palabra2
		pal2="";//reinicio de pal2
	}
	System.out.println("La palabra mas larga de '"+palabra+"' es "+mayo+" con "+lon+"");
}
}
