package ex12;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		int vector[] = new int[10];

		int res = 0;
		int i = 0;
		int pares = 0;
		int impares = 0;
		// Pido el array y lo guardo
		for (i = 0; i < vector.length; i++) {
			System.out.println("Introduce un numero");
			int num2 = lector.nextInt();
			vector[i] = num2;
		}

		i = 0;
		for (i = 0; i < vector.length; i++) {
			if (vector[i] % 2 == 0) {
				pares = pares + 1;

			} else if (vector[i] % 2 != 0) {
				impares = impares + 1;

			}
		}

		System.out.println(pares);

		System.out.println(impares);

	}
}
