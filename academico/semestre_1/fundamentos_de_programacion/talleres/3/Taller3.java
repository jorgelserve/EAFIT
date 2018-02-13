import java.util.Scanner;

public class Taller3 {
	public static void main(String[] args) {
		printTriangleType(5, 7, 7);
	}
	
	public static void printTriangleType (int a, int b, int c) {
		System.out.print("\033[H\033[2J");
		if((a > 0 && c > 0 && c > 0) && ((a < b+c) && (b < a+c) && (c < a+b))) {
			System.out.print("Las medidas " + a + ", " + b + " y " + c  + " forman un triangulo ");
			if(a == b && b == c & c == a) {
				System.out.println("equilatero");
			} else if(a == b || b == c || c == a) {
				System.out.println("isósceles");
			} else {
				System.out.println("escaleno");
			}
		} else {
			System.out.println("\u001B[31mError: \u001B[0mLas medidas que ingresaste no corresponden a un triangulo");
		}
	}


	public static void ejercicio6() {
		System.out.print("\033[H\033[2J");
		int a = 3;
		int b = 2;
		
		if(a%2 != 0) {
			if(b%2 == 0) {
				System.out.println("cierto");
			}
		} else {
			System.out.println("falso");
		}
	}


	public static void ejercicio7(int fecha) {
		
		
		String mes[] = {"Enero", "Febrero","Marzo", "Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		if (Integer.toString(fecha).length() <= 8) {
			int year = fecha / 10000;
			fecha -= year * 10000;
			int month = fecha / 100;
			fecha -= month * 100;
			int date = fecha;
			System.out.println(date + " de " + mes[month-1] + " de " + year);
			System.out.println("si");
		} else {
			System.out.println("no"
		}
	}


	public static void ejercicio8(String color) {
		if(color.equalsIgnoreCase("R")) {
			System.out.println("\u001B[31mRED\u001B[0m");
		} else if(color.equalsIgnoreCase("G")) {
			System.out.println("\u001B[32mGREEN\u001B[0m");
		} else if(color.equalsIgnoreCase("B")) {
			System.out.println("\u001B[34mBLUE\u001B[0m");
		}
	}


	public static boolean hasPennies(int cents) {
		return !(cents%5==0);
	}


	public static int numUnique(int a, int b, int c) {
		if(a != b && a != c && b != c) {
			return 3;
		} else if ((a == b && b != c) || (a == c && c != b) || (b == c && a != b)) {
			return 2;
		} else {
			return 0;
		}
	}




	public static void ejercicio12() {
		int valor = 15000;
		int billetes;
		if(valor >= 1000) {
			if(valor >= 10000) {
				billetes = valor / 10000;
				valor = valor % 10000;
				System.out.println(billetes + " de 10.000");
			}
			if(valor >= 5000) {
				billetes = valor / 5000;
				valor = valor % 5000;
				System.out.println(billetes + " de 5.000");
			}
			if(valor >= 1000) {
				billetes = valor / 1000;
				valor = valor % 1000;
				System.out.println(billetes + " de 1.000");
			}
		}
	}


	public static void ejercicio13(int peso, int estatura) {
		return peso/(estatura * estatura);
	}


	public static void ejercicio13(int peso, double estatura) {
		estatura = estatura * estatura; 
		double imc = peso/estatura;
		System.out.println();
		if(imc < 20) {
			System.out.println("Falta de peso");
		} else if(imc >= 20 && imc >= 25) {
			System.out.println("Peso norma");
		} else if(imc >= 26 && imc <=30) {
			System.out.println("Sobrepeso");
		} else if(imc >= 31 && imc <= 40) {
			System.out.println("Obesidad");
		} else {
			System.out.println("Fuerte obesidad");
		}
	}


	public static void ejercicio14(int month, int date) {
		int control = 0;
		int dias = 0;
		int diasEnMese[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String mes[] = {"Enero", "Febrero","Marzo", "Abril", "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
		while(control <= month - 2) {
			dias += diasEnMese[control];
			control += 1;
		}
		dias += date;
		System.out.print("Faltan ");
		System.out.print(dias-1);
		System.out.print(" para el " + date + " de " + mes[month-1]);
	}
}






