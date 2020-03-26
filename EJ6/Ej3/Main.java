package Ej3;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
	public static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Dime tu fecha de nacimiento (dd/MM/yyyy):");
		String fecha=sc.next();

		LocalDate fechaNac = LocalDate.parse(fecha, fmt);
		LocalDate ahora = LocalDate.now();

		Period periodo = Period.between(fechaNac, ahora);
		System.out.printf("Tu edad es: %s años, %s meses y %s días", periodo.getYears(), periodo.getMonths(), periodo.getDays());
	}
}
