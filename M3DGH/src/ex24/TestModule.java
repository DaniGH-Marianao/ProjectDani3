package ex24;

import java.util.Scanner;

import m3utils.Module;

public class TestModule {
	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("1.Xarxes 2.Hardware");
		int codi = lector.nextInt();
		String resultado = Module.getModulCurt(codi);
		System.out.println(resultado);
		lector.close();
	}

};