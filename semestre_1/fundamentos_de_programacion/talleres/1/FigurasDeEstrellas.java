/*
  FigurasDeEstrellas
	@author: Jorge Luis Serna (https://github.com/jorgelserve)
	@version: 1.0.0
*/
public class FigurasDeEstrellas {
	public static void main (String[] args) {
		progrecionCerrandoce();
		uno();
		dos();
		System.out.println(" ");
		progrecionCerrandoce();
		uno();
		progrecionAbriendoce();
		System.out.println("");
		tresVerticales();
		progrecionCerrandoce();
		uno();
		dos();
	}
	
	public static void tresVerticales () {
		uno();
		uno();
		uno();
	}
	
	public static void progrecionAbriendoce () {
		dos();
		ocho();
	}
	
	public static void progrecionCerrandoce () {
		ocho();
		dos();
	}
	
	public static void ocho () {
		System.out.println("****");
		System.out.println("****");
	}
	
	public static void dos () {
		System.out.println(" * *");
	}
	
	public static void uno () {
		System.out.println("  *");
	}
}



