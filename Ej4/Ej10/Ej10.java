package Ej10;
import java.util.*;
public class Ej10 {
private static int rdo;
	public static int decbin(int x) {
	if (x<2)  rdo=x;
	else rdo=decbin(x/2)*10+x%2;
	return rdo;
}
	
public static void main(String[]args) {
	System.out.println("numero");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	System.out.println(Ej10.decbin(num));
	sc.close();
	}
}