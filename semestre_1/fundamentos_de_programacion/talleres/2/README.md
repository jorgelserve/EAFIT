# Fundamentos de Programación (ST0242)
### Taller número 2
La respuesta a este taller se debe enviar por Eafit Interactiva. La fecha y hora son las especificadas en Eafit Interactiva. El taller debe ser desarrollado de manera individual.

Las respuestas a los ejercicios 1 al 5 se presentan en un archivo llamado [taller2NombreApellido.txt]()
Las respuestas a los ejercicios 6 al 12 se incluyen en un archivo llamado [Taller2.java](), que contiene una clase llamada Taller2 y varios métodos. Recuerde que cada método debe tener comentarios y estar bien indentado. El punto 13 se consigna en un archivo pdf llamado [taller2.pdf]().

 ```java
/**
* Soluciones al taller 1.
*
* @author Pepito Pérez
* @version Enero de 2018
* /

public class Taller1
{
	public static void punto7() {
		System.out.println("Hola, ¿cómo estás?");
	}

	public static void main(String [] args) {
		punto7();
	}
}
```


1.	Muestre cómo se ejecutan las siguientes expresiones paso a paso y escriba el resultado (teniendo en cuenta las reglas de precedencia de operadores vistas en clase):
	* 3 + 4 / 5 * 7 – 3
	* (13 – 4) / 5 * 3  * (3 – 5) + 12
	* 2 + 17 % 3 – (8 * (3 /2)) – 12 + 13
	* 7 * 3 – 4 / 3 - 7

2. Muestre cómo se ejecutan las siguientes expresiones y escriba el resultado (teniendo en cuenta las reglas de precedencia de operadores vistas en clase):
	+ 5.0 / 2 * 11 / 3 – 7
	+	12 / 5 * 4.4 * 3 / 6 – 0.3
	+	(3 * 4.0 / 3 – 1.3) / 5 * 3 – 4
	+	13 / 3 / 5.0 * (3.1 + 2.3) – 4 / 3

3.	Muestre cómo se ejecutan las siguientes expresiones y escriba el resultado (como lo haría un programa en Java), explicando el tipo final de la expresión:
	+ 2 + 2 + 3 + 4
	+	2 + " 2 + 3 " + 4
	+	“hola” 34 " + 2 * 4
	+	4 + 1 + 9 + "." + (-3 + 10) + 11

4.	Considere el siguiente código:
	```java
	int first = 7;
	int second = 13;
	first = first + second;
	second = first – second;
	first = first – second;
	```
	¿Cuál es el valor de las variables first y second al final del código?

5.	Reescriba el código del ejercicio anterior usando operadores de asignación (por ejemplo +=, -=, etc.).

6.	Escriba un método que reciba dos números enteros positivos (a y b) y retorne el residuo de dividir a entre b. No puede utilizar el operador % (módulo). Recordar que el residuo de dividir 11 entre 3 es 2.
	```java
	public static int ejercicio6(int a, int b) {
		//...
	}
	```
7.	Suponga que solamente cuenta con las operaciones suma, resta, multiplicación y división (no hay exponenciación). Escriba un algoritmo que reciba un valor entero en la variable a, otro en la variable b y retorne el resultado de la siguiente operación:
a3 + 3a2b + 3ab2 + b3
	```java
	public static int ejercicio7(int a, int b) {
		//...
	}
	 ```

8.	Teodoro es un estudiante del curso de Fundamentos de Programación. Escriba un método que reciba las notas de los parciales (15%, 20% y 25%), los talleres (10%) y los quizzes (10%), y que le diga a Teodoro cuánto debe sacar en la práctica final para aprobar el curso con una buena nota, es decir 4.0.
	```java
	public static double ejercicio8(float parcial1, float parcial2, float parcial3, float seguimiento){
		//...
	}
	```
9.	Un “six pack” es un conjunto de 6 unidades de un producto. Una caja tiene 3 “six pack”. Se requiere escribir un programa que dado un número de unidades de un producto, calcule “cuántos six” pack y cuántas cajas se pueden crear. El programa, además, debe informar cuantas unidades se requieren para completar el último “six pack” y la última caja.

10.	Un programa recibe un un número X de horas, se desea conocer el número de semanas, días y horas equivalentes. Por ejemplo, dado un total de 2,000 horas, el programa debe mostrar: 11 semanas, 6 días y 8 horas.

11.	Escriba un programa en Java que calcule la altura que podemos alcanzar con una escalera de 3 metros que está apoyada sobre la pared, si la parte inferior de la escalera la situamos a 70 centímetros de ésta. El programa debe imprimir el resultado. Ver la siguiente figura:
![](data:image/png;base64,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)	

12.	Juanito debe descomponer un número de 3 cifras en unidades, decenas y centenas. Ayúdale a Juanito escribiendo un programa en Java que imprima por separado las 3 cifras de cualquier número. Por ejemplo, si el número es 456, el programa debe imprimir: 6 unidades, 5 decenas y 4 centenas.

13.	(Consulta en la biblioteca): Realice la primera consulta en medios físicos en la biblioteca de la Universidad; es decir, consulte un libro con ejemplar impreso. MUY IMPORTANTE: No olvide citar las fuentes. Para esta tarea no se pueden consultar páginas web, la fuente debe ser un libro.
**a**.  ¿Qué es un algoritmo? Consulte varios libros donde definan qué es un algoritmo.
**b**.  ¿Qué notaciones se utilizan para representar un algoritmo?  


### Código de Ética
* Usted puede conversar con sus compañeros acerca de los enfoques que cada uno está utilizando para la tarea, pero NO se debe mirar el código de sus compañeros y mucho menos usarlo como parte de su tarea.  
* No debe aceptar que otra persona (compañero, tío, amigo, novia, primo hermano del mocho) “le ayude” escribiendo parte del código de su tarea.
* Copiar código de un compañero constituye un fraude. Para mayor información, mirar el [reglamento]( http://www.eafit.edu.co/institucional/reglamentos/Paginas/reglamento-academico-pregrado.aspx) académico de EAFIT:

 
* http://www.eafit.edu.co/institucional/reglamentos/Documents/pregrado/regimen-disciplinario/cap1.pdf
 