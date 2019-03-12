/*
	@author: Jorge Luis Serna (https://github.com/jorgelserve)
	@version: 1.0.0
*/

public class Taller1 {

	public static void ejercicio6 () {
		decendente();
		uno()
		asendente();
		System.out.println();
		uno();
		uno();
		uno();
		decendente();
		uno();
		dos();
	}

	public static void ejercicio7 () {
		imprimir(0);
	}

	public static void imprimir (int control) {
		if(control <= 244) {
			System.out.println("Llamar metodos es un concepto poderoso");
			imprimir(control + 1);
		}
	}

	public static void cuatro () {
		System.out.println("* * * *");
	}

	public static void dos () {
		System.out.println("  * *");
	}

	public static void uno () {
		System.out.println("    *");
	}

	public static void decendente () {
		cuatro();
		cuatro();
		dos();
	}

	public static void asendente () {
		dos();
		cuatro();
		cuatro();
	}
}
