package ex16;

public class Area {

	private static final double PI = 3.1416;

	public static void main(String[] args) {

		double area = CalcularArea(Double.parseDouble(args[0]));
		System.out.println(area);
	}

	private static double CalcularArea(double radi) {
		double res = PI * (radi * radi);
		return res;
	}

}