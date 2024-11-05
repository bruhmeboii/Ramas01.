package util;

import java.util.Scanner;

public class Funciones {
	public static int dimeEntero(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String s = sc.nextLine();
				int num = Integer.parseInt(s);
				return num;
			} catch (Exception ex) {
				System.out.println("Formato Incorrecto");
			}
		} while (true);
		
	}
	
	public static double dimeDouble(String texto, Scanner sc) {
		do {
			try {

				System.out.println(texto);
				String s = sc.nextLine();
				double num = Double.parseDouble(s);
				return num;
			} catch (Exception ex) {
				System.out.println("Formato Incorrecto");
			}
		} while (true);
		
	}
	public static boolean esDouble(String texto) {
		try {

			double num = Double.parseDouble(texto);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}

	public static boolean esInt(String texto, Scanner sc) {

			try {
				int num = Integer.parseInt(texto);
				return true;
			} catch (Exception ex) {
				return false;
			}


	}

}
