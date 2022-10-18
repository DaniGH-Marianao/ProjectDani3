package ex13;

import java.util.Scanner;

public class Tamano {

	public static void main(String[] args) {

		// Declaro variables
		Scanner lector = new Scanner(System.in);
		String[] cadena = new String[10];

		int res = 0;
		int i = 0;
		int j = 1;
		int tamanomajor = 0;

		// Pido el array y lo guardo
		for (i = 0; i < cadena.length; i++) {
			System.out.println("Introduce una frase");
			cadena[i] = lector.nextLine();

		}
		// Comparo cual es la frase mas grande
		String major = cadena[0];
		for (i = 0; i < cadena.length - 1; i++) {
			if (cadena[i].length() >= major.length()) {

				major = cadena[i];
				tamanomajor = cadena[i].length();
			}

		}
		// Doy la respuesta
		System.out.println(major + " Tiene " + tamanomajor + " Caracteres ");

	}
}