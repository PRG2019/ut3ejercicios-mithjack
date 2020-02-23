/*
 * @mithjack
 *	mejora: cambiar cada opci�n por una funcion para acortar codigo
 */

package Diccionario_HS;

import java.util.*;

public class Diccionario {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Hashtable<Integer, Palabras> vocabulario = new Hashtable<Integer, Palabras>();
		boolean sw1 = false;
		int idHS=0;
		while (!sw1) {
			System.out.println("\nQue quieres hacer:");
			System.out.println("1. Insertar palabras");
			System.out.println("2. Traducir del Ingles");
			System.out.println("3. Traducir del Espa�ol");
			System.out.println("4. Traducir del Frances");
			System.out.println("5. Eliminar palabra");
			System.out.println("6. Modificar palabra");
			System.out.println("7. Listar palabras introducidas");
			System.out.println("0. Salir ");
			int men1 = sc.nextInt();

			switch (men1) {

			case 1:
				System.out.println("Dime la palabra inglesa o * para volver al menu");
				String p1 = sc.next();
				if (p1.equals("*"))
					break;

				else {
					System.out.println("Dime la palabra espa�ola o * para volver al menu");
					String p2 = sc.next();
					if (p2.equals("*"))
						break;

					else {
						System.out.println("Dime la palabra francesa o * para volver al menu");
						String p3 = sc.next();
						if (p3.equals("*"))
							break;

						else {
							Palabras a�adir = new Palabras(p1, p2, p3);
							vocabulario.put(idHS,a�adir);
							idHS++;
						}
					}
				}
				System.out.println();
				break;

			case 2: case 3:	case 4:
				if (vocabulario.size() == 0)
					System.out.println("Primero debes a�adir una palabra\n");
				else {
					System.out.println("Que quieres traducir?");
					String pre = sc.next();
					boolean encon = false;
					if (men1 == 2) {
						for (int i = 0; i < vocabulario.size(); i++) {
							if (vocabulario.get(i).getPIngles().equals(pre)) {
								System.out.println(vocabulario.get(i));
								encon = true;
							}
						}
						if (!encon)
							System.out.println("La palabra no existe");
					} else if (men1 == 3) {
						for (int i = 0; i < vocabulario.size(); i++) {
							if (vocabulario.get(i).getPEsp().equals(pre)) {
								System.out.println(vocabulario.get(i));
								encon = true;
							}
						}
						if (!encon)
							System.out.println("La palabra no existe");
					} else {
						for (int i = 0; i < vocabulario.size(); i++) {
							if (vocabulario.get(i).getPFr().equals(pre)) {
								System.out.println(vocabulario.get(i));
								encon = true;
							}
						}
						if (!encon)
							System.out.println("La palabra no existe");
					}
				}
				break;

			case 5:
				if (vocabulario.size() == 0)
					System.out.println("Primero debes a�adir una palabra\n");
				else {
					boolean encon = false;
					System.out.println("De que idioma es la palabra?");
					System.out.println("1. Ingles");
					System.out.println("2. Espa�ol");
					System.out.println("3. Frances");
					int idi = sc.nextInt();

					if (idi == 1) {
						System.out.println("Que quieres eliminar?");
						String pre = sc.next();
						for (int i = 0; i < vocabulario.size(); i++) {
							if (vocabulario.get(i).getPIngles().equals(pre)) {
								vocabulario.remove(i);
								encon = true;
							}
						}
						if (!encon)
							System.out.println("La palabra no existia");
					}

					else if (men1 == 2) {
						System.out.println("Que quieres eliminar?");
						String pre = sc.next();
						for (int i = 0; i < vocabulario.size(); i++) {
							if (vocabulario.get(i).getPEsp().equals(pre)) {
								vocabulario.remove(i);
								encon = true;
							}
						}
						if (!encon)
							System.out.println("La palabra no existia");
					}

					else {
						System.out.println("Que quieres eliminar?");
						String pre = sc.next();
						for (int i = 0; i < vocabulario.size(); i++) {
							if (vocabulario.get(i).getPFr().equals(pre)) {
								vocabulario.remove(i);
								encon = true;
							}
						}
						if (!encon)
							System.out.println("La palabra no existia");
					}
				}
				break;

			case 6:
				boolean encon = false;
				System.out.println("De que idioma es la palabra?");
				System.out.println("1. Ingles");
				System.out.println("2. Espa�ol");
				System.out.println("3. Frances");
				int idi = sc.nextInt();

				if (idi == 1) {
					System.out.println("Que quieres editar?");
					String pre = sc.next();
					for (int i = 0; i < vocabulario.size(); i++) {
						if (vocabulario.get(i).getPIngles().equals(pre)) {
							System.out.println("Dime la palabra inglesa");
							p1 = sc.next();
							System.out.println("Dime la palabra espa�ola");
							String p2 = sc.next();
							System.out.println("Dime la palabra francesa");
							String p3 = sc.next();
							Palabras a�adir = new Palabras(p1, p2, p3);
							vocabulario.put(i,a�adir);
							encon = true;
						}
					}
					if (!encon)
						System.out.println("La palabra no existia");
				}

				else if (men1 == 2) {
					System.out.println("Que quieres editar?");
					String pre = sc.next();
					for (int i = 0; i < vocabulario.size(); i++) {
						if (vocabulario.get(i).getPEsp().equals(pre)) {
							System.out.println("Dime la palabra inglesa");
							p1 = sc.next();
							System.out.println("Dime la palabra espa�ola");
							String p2 = sc.next();
							System.out.println("Dime la palabra francesa");
							String p3 = sc.next();
							Palabras a�adir = new Palabras(p1, p2, p3);
							vocabulario.put(i,a�adir);
							encon = true;
						}
					}
					if (!encon)
						System.out.println("La palabra no existia");
				}

				else {
					System.out.println("Que quieres editar?");
					String pre = sc.next();
					for (int i = 0; i < vocabulario.size(); i++) {
						if (vocabulario.get(i).getPFr().equals(pre)) {
							System.out.println("Dime la palabra inglesa");
							p1 = sc.next();
							System.out.println("Dime la palabra espa�ola");
							String p2 = sc.next();
							System.out.println("Dime la palabra francesa");
							String p3 = sc.next();
							Palabras a�adir = new Palabras(p1, p2, p3);
							vocabulario.put(i,a�adir);
							encon = true;
						}
					}
					if (!encon)
						System.out.println("La palabra no existia");
				}
				break;

			case 7:
				System.out.println("Hay " + vocabulario.size() + " palabras ingresadas");
				System.out.println(vocabulario);
				break;

			case 0:
				sw1 = true;
				break;
			}
		}
	}
}
