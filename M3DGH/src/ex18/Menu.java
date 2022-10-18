package ex18;

import java.util.Scanner;

public class Menu {

	Scanner teclado = new Scanner(System.in);
	int x, y;

	public void menu() {
		String opc = " ";
		System.out.println("Intruduce una frase");
		String frase = teclado.nextLine();
		do {
			System.out.println();
			System.out.print("----- Menú Principal -----" + "\nA. Mostrar la longitud del text"
					+ "\nB. Entrar un altre text i indicar si són iguals "
					+ "\nC. Entrar dos enters (inici i fi) i mostrar el tros del text corresponent" + "\nD. Salir"
					+ "\nIngrese una opción: ");
			opc = teclado.nextLine().toLowerCase();

			switch (opc) {
			case "a":
				int res = longitud(frase);
				System.out.println(res);
				break;
			case "b":
				res = iguals(frase);
				System.out.println();
				if (res == 1) {
					System.out.println("Son iguals");
				} else {
					System.out.println("No son iguals");
				}
				break;
			case "c":
				res = tros(frase);
				break;
			case "d":
				System.out.println();
				System.out.println("Gracias por usar la aplicación. Vuelva Pronto");
			}

		} while (!opc.equalsIgnoreCase("D"));
	}

	private int tros(String frase) {
		int res = 0;
		String[] vect = frase.split(" ");
		System.out.println("Dame un inici");
		int inici = teclado.nextInt();
		System.out.println("Fi");
		int fi = teclado.nextInt();
		System.out.println("Inici , Fi");
		System.out.println(vect[inici] + " , " + vect[fi]);

		return res;
	}

	private int iguals(String frase) {
		System.out.println("Intruduce una nueva frase");
		String frase2 = teclado.nextLine();
		int res = 0;
		System.out.println(frase);
		System.out.println(frase2);
		if (frase == frase2) {
			res = 1;
		} else if (frase != frase2) {
			res = 2;
		}
		return res;
	}

	private int longitud(String frase) {
		int res = frase.length();
		return res;
	}

	public static void main(String[] args) {
		Menu fc = new Menu();
		fc.menu();
	}
}
