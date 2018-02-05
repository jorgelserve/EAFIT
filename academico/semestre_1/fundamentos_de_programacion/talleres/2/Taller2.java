/*
	@author: Jorge Luis Serna (https://github.com/jorgelserve)
	@version: 1.0.0
*/

public class Taller2 {
	public static int ejercicio6(int a, int b) {
		return a - a / b * b;
	}

	public static int ejercicio7(int a, int b) {
		return (a * a * a) + ((3 * a) * (b * 2)) + ((3 * a) * (b * 2)) + (b * 3);
	}

	public static double ejercicio8(double parcial1, double parcial2, double parcial3, double seguimiento) {
		double notas = (parcial1 * 15/100)+(parcial2*20/100)+(parcial3*0.25)+(seguimiento*0.20);
		return ((5-notas) / 0.20) - 10;
	}

	public static void ejercicio9() {
		int cantidad = 36;
		int six_packs = cantidad / 6; 
		int cajas = six_packs / 3;
		int restante = (6 -(cantidad - six_packs * 6));
		if(cantidad%6 == 0 && (cantidad/3)%3 == 0) {
			System.out.println("Cantidad de six packs: " + six_packs);
			System.out.println("Cantidad de cajas: " + cajas);
		} else {
			System.out.println("Cantidad de six packs: " + six_packs);
			System.out.println("Cantidad de cajas: " + cajas);
			if((6 -(cantidad - six_packs * 6)) != 6) {
				System.out.println("Te faltan " + restante + " productos mas para llenar el ultimo six pack");
			}
			restante = (cajas * 18) + (six_packs * 6) -1;
			// restant
			if(cantidad%18==0 && (cantidad/18)%18 == 0) {
				System.out.println("Te faltan " + (restante - cantidad) + " productos mas para llenar la ultima caja");
			}
		}
	}

	public static void ejercicio10() {
		int horas = 2000;


		int semanas = horas / 168;
		horas = (horas - (semanas * 168));
		int dias = horas/ 24;
		horas = (horas - (dias * 24)); 

		if(horas == 0) {
			System.out.println("¿En serio?");
		} else if (horas == 1) {
			System.out.println(horas +  " hora es " + semanas + " semanas, " + dias + " dias y " + horas + " hora");
		} else {
			System.out.println(horas +  " horas son " + semanas + " semanas, " + dias + " dias y " + horas + " horas");
		}
	}



	public static void ejercicio11() {
		double altura = 3;
		double distancia = 0.7;
		altura = (0.5 *     ((altura*altura) + (distancia * distancia))  );
		System.out.println("La escalera esta a una altura de " + altura);
    }

    public static void ejercicio12() {
        int numero = 466;
        int cuenta = numero;
        int centenas = cuenta / 100;
        cuenta -= centenas *  100;
        
        int decenas = (cuenta / 10);
        cuenta -= (decenas *  10) ;
        

        int unidades = cuenta;
        System.out.println(numero);
        System.out.println("\t" + centenas + " centenas");
        System.out.println("\t" + decenas + " decenas");
        System.out.println("\t" + unidades + " unidades");
    }
}