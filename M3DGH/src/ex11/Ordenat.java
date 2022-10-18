package ex11;

import java.util.Scanner;

public class Ordenat {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el tamaño del vector");
		int tamañovector = lector.nextInt();

		int vector[] = new int[tamañovector];
		int tamFinal = (vector.length);

		int res = 0;
		int i = 0;
		int j = 1;
		// Pido el array y lo guardo
		for (i = 0; i < tamFinal; i++) {
			System.out.println("Introduce un vector de enteros");
			int num2 = lector.nextInt();
			vector[i] = num2;
		}

		i = 0;
		// Ascendent

		if (vector[0] <= vector[tamFinal - 1]) {

			while (res == 0 && i < vector.length - 1) {
				if (vector[i++] <= vector[j++]) {
					res = 0;
				} else {
					res = 1;
				}
			}
		}

		// Descendent
		if (vector[0] >= vector[tamFinal - 1]) {

			while (res == 0 && i < vector.length - 1) {
				if (vector[i++] >= vector[j++]) {
					res = 0;
				} else {
					res = 1;
				}
			}
		}

		// Resultado

		if (res == 1) {
			System.out.println("No esta ordenat");
		} else if (res == 0) {
			System.out.println("Esta ordenat");
		}

	}
}
