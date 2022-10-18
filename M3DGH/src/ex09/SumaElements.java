package ex09;

public class SumaElements {

	private static int[] enteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	private static int suma(int[] vector) {
		int res = 0;
		for (int i = 0; i < vector.length; i++) {
			res += vector[i];
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("La suma de los elementos es:" + suma(enteros));
	}

}
