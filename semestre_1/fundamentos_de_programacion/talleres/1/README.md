# Fundamentos de Programación (ST0242)
### Taller número 1
La respuesta a este taller se debe enviar por Eafit Interactiva. La fecha y hora límites son los definidos en Eafit Interactiva. El taller debe ser desarrollado de manera individual.
 
Las respuestas a los ejercicios 1 al 5 se presentan en un archivo llamado [taller1.txt](https://github.com/jorgelserve/EAFIT/blob/master/academico/semestre_1/fundamentos_de_programacion/talleres/1/taller1.txt). Las respuestas a los ejercicios 6 en adelante se incluyen en un archivo llamado [Taller1.java](https://github.com/jorgelserve/EAFIT/blob/master/academico/semestre_1/fundamentos_de_programacion/talleres/1/Taller1.java), que contiene una clase llamada Taller1 y varios métodos, siguiendo el siguiente ejemplo:
 ```java
/**
* Soluciones al taller 1.
*
* @author Pepito Pérez
* @version Enero de 2018
*/

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


1. Cuáles de los siguientes son identificadores válidos en Java (si o no y explique):
 
	* class
	* contadorInstancias
	* XYZ
	* if
	* acum_of_shots
	* Z5

2. Escriba las instrucciones en Java que producen la siguiente salida:
	 ```text
	This is a test of your
		knowledge of "quotes" used
		in 'string literals.'
	You're bound to "get it right" if you read the section on
	'' quotes. ''
	 ```
3. Identifique 4 errores en el siguiente programa:

	```java
	public class Errores
	{
	   public static void main(string [] args) {
	       System.out.println("Hola amiga:")
	       System.out.println("Bienvenida al curso);
	   
	}
	```



4. Qué salida produce el siguiente programa:
	 ```java
	public class Methods
	{
	   public static void primero() {
	       System.out.println("En el primer método");
	   }

	   public static void segundo() {
	       primero();
	       System.out.println("En el segundo método");
	   }

	   public static void tercero() {
	       primero();
	       System.out.println("En el tercer método");
	       segundo();
	   }

	   public static void main() {
	       tercero();
	       segundo();
	       primero();
	   }
	}
	```

5. El siguiente programa es correcto para Java. Pero es difícil de entender para un humano por la falta de indentación y la falta de comentarios. Formatee el programa y agregue un comentario en el encabezado:
	 ```java
	public class Indentar
	{
	   public 
	static void main(String 
	[] args) { System.out.println("Los programas pueden ser");
	System.out.println(
	"fáciles o difíciles de leer,"
	);System.out.println("dependiendo del programador.");
	System.out.println
	("Deberían ser fáciles de leer");
	System.out.println("Para todos, incluido el programador");
	}}
	```
 
6. Escriba un programa en Java que se llama FigurasDeEstrellas y genere la siguiente salida. Use métodos estáticos para eliminar la redundancia en su solución:
	```text
		*****
		*****
		 * * 
		  *
		 * *

		*****
		*****
		 * * 
		  *
		 * *
		*****
		*****

		  *
		  *
		  *
		*****
		*****
		 * *
		  *
		 * *

	```

7. Escriba un programa que escriba la siguiente línea 243 veces (notar que 243 es 3 elevado a la 5) :
 
		```Llamar métodos es un concepto poderoso.```
	No debe escribir un programa que use 243 líneas de código; use métodos para acortar el programa. ¿Cuál es el programa más corto que puede escribir usando solamente el material de este capítulo (no se pueden utilizar ciclos)?





### Código de Ética
* Usted puede conversar con sus compañeros acerca de los enfoques que cada uno está utilizando para la tarea, pero NO se debe mirar el código de sus compañeros y mucho menos usarlo como parte de su tarea.  
* No debe aceptar que otra persona (compañero, tío, amigo, novia, primo hermano del mocho) “le ayude” escribiendo parte del código de su tarea.
* Copiar código de un compañero constituye un fraude. Para mayor información, mirar el [reglamento]( http://www.eafit.edu.co/institucional/reglamentos/Paginas/reglamento-academico-pregrado.aspx) académico de EAFIT:

 
* http://www.eafit.edu.co/institucional/reglamentos/Documents/pregrado/regimen-disciplinario/cap1.pdf
 