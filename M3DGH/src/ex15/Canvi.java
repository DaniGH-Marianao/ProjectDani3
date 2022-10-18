package ex15;

import java.util.Arrays;

public class Canvi {

	public static void main(String[] args) {

		int vector[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		String[] vectorstring = new String[vector.length];

		for (int i = 0; i < vector.length; i++) {
			vectorstring[i] = String.valueOf(vector[i]);

		}
		System.out.println(Arrays.toString(vectorstring));

	}
}
