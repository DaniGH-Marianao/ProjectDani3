package ex17;

import java.util.Scanner;

public class Area2 {

	private static final double PI = 3.1416;

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);
		System.out.println("Introduce el radi");
		int radi = lector.nextInt();

		double res = PI * (radi * radi);
		System.out.println(res);
	}

}