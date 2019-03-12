/**
* 
*   @author: Jorge Luis Serna (https://github.com/jorgelserve/eafit) 
*   @version: 1.0
*/

import junit.framework.TestCase;
import java.util.Scanner;

public class Taller4 {
	public static void punto1A() {
		for(int i = 30; i > -31; i--) {
			if(i%5==0)
				System.out.println(i);
		}
	}

	public static void punto1B(int sum) {
		if(sum > 0) {
			int acum=0;
			for(int i = 1; i <= sum; i++) {
				acum += i;
			}
			System.out.println(acum);
		} else {
			System.out.println("Debe ser un nuemro positivo");
		}
	}

	public static void punto1C(int m, int n) {
		int acum = 1;
		if(m < n) {
			for(int i = m; i <= n; i++) {
				acum *= i;
			}
		} else {
			System.out.println(m + " Deber ser menor que " + n);
		}
		System.out.println(acum);
	}

	public static int punto1D(int n) {
		if(n != 0 && n != 1) {
			int factorial = 1;
			for(int i = 1; i <= n; i++) {
				factorial *= i;
			}
			return factorial;
		} else {
			return 1;
		}
	}

	public static void punto1E() {
	   for(int a = 1; a <= 10; a ++) {
		   for(int b = 1; b <= 10; b++) {
			   System.out.println(a + " x " + b + " = " + (a*b));
		   }
		   System.out.println();
	   }
	}

	public static double punto1F(double base, int exponente) {
		if(exponente == 0) {
			return 1;
		} else {
			double cont = base;
			for(int i = 1; i < exponente; i ++) {
				base *= cont;
			}
			return base;
		}
	}

	public static void punto1G(int num) {
		if(num > 0) {
			for(int i = num; i > 0; i--) {
				if(num % i == 0) {
					System.out.println(i);
				}
			}
		} else {
			System.out.println("Debe ser un numero positivo mayor a 0");
		}
	}

	public static void punto1H() {
		Scanner in = new Scanner(System.in);
		int num;
		int divisores = 0;
		int i;
		System.out.println("Ingresa un número entero: ");
		System.out.println("(Para salir ingresa -1)");
		do {
			
			System.out.print("> ");
			num = in.nextInt();
			for(i = num; i > 0; i--) {
				divisores = (num % i == 0) ? divisores+1 : divisores;
			}
			if(divisores == 2) {
				System.out.println("Numero primo");
			} else {
				System.out.println("Numero par");
			}
			divisores = 0;
		}while(num != -1);
	}

	public static void punto1I() {
		Scanner in = new Scanner(System.in);
		System.out.println("Ingresa un numero");
		System.out.print("> ");
		int num = in.nextInt();
		while(num >= 1 && num <=5) {
			do {
				System.out.println("Ingresa un numero");
				System.out.print("> ");
				num = in.nextInt();
			}while(num >= 1 && num <=5);
			System.out.println("Numero no valido. Ingresalo nuevamente");
			System.out.print("> ");
			num = in.nextInt();
		}
	}

	public static void punto1J() {
		double coseno = 1;
		boolean control = true;
		int i = 1;
		do {
			if(control) {
				coseno = coseno - (punto1F(i, i*2) / punto1D(i*2));
			} else {
				coseno = coseno + (punto1F(i, i*2) / punto1D(i*2));
			}
			control = !control;
			i++;
		}while(coseno > 0.0001);
		System.out.println(coseno);
	}
}
