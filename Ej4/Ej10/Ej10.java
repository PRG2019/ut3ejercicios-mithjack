package Ej10;
import java.util.*;
public class Ej10 {
	private static int rdo;
	private static String st="";
	
	public static int decbin(int x) {
	if (x<2)  rdo=x;
	else rdo=decbin(x/2)*10+x%2;
	return rdo;
}
	public static int decbinbas(int x, int b) {
	if (x<b)  rdo=x;
	else rdo=decbinbas(x/b,b)*10+x%b;
	return rdo;
}
	
	public static String stdecbin(int x) {
		if (x<2)  st+=x;
		else st+=stdecbin(x/2)+x%2;
		return st;
}
	/*public static String stdecbinba(int x, int b) {
	
		if (x<b)  st+=x;
		else st+=stdecbinbas(x/b,b)+x%b;
		return st;
	}*/
	
	public static String stdecbinbas(int x, int b) {
		 //String st="";
			if (x<b)  st=st + (char) ( (x<10)? x+'0' :  (x-10+'A'));
			else st+=stdecbinbas(x/b,b) + (char) ((x%b<10)? x%b+'0' : x%b-10+'A');
			return st;
	}
	
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1 bin");
	System.out.println("2 Elegir");
	System.out.println("3 bin String");
	System.out.println("4 Elegir String");
	int el=sc.nextInt();
	switch(el) {
	case 1:
		System.out.println("numero");
		int num=sc.nextInt();
		System.out.println(decbin(num));
		break;
	case 2:
		System.out.println("numero");
		num=sc.nextInt();
		System.out.println("base");
		int bas=sc.nextInt();
		System.out.println(decbinbas(num,bas));
		break;
	case 3:
		System.out.println("numero");
		num=sc.nextInt();
		System.out.println(stdecbin(num));
		break;
	case 4:
		System.out.println("numero");
		num=sc.nextInt();
		System.out.println("base");
		bas=sc.nextInt();
		System.out.println(stdecbinbas(num,bas));
		break;
		
	}
	
	
	sc.close();
	}
}