/*
	@author: Jorge Luis Serna (https://github.com/jorgelserve)
	@version: 1.0.0
*/

public class Taller1 {
    public static void main (String[] args) {
        imprimir(0);
    }
    
    public static void imprimir (int control) {
        if(control <= 244) {
            System.out.println("Llamar metodos es un concepto poderoso");
            imprimir(control + 1);
        }
    }
}