# Fundamentos de Programación (ST0242)
### Taller número 3

La respuesta a este taller se debe enviar por Eafit Interactiva en la fecha y hora que dice en la aplicación. El taller debe ser desarrollado de manera individual.
 
Las respuestas a los ejercicios 1, 2, 3 y 4 se presentan en un archivo llamado [taller3.txt](https://github.com/jorgelserve/EAFIT/blob/master/academico/semestre_1/fundamentos_de_programacion/talleres/3/taller3.txt). Las respuestas a los ejercicios 5 al 17 se incluyen en un archivo llamado [Taller3.java](https://github.com/jorgelserve/EAFIT/blob/master/academico/semestre_1/fundamentos_de_programacion/talleres/3/Taller3.java), que contiene una clase llamada Taller3 y varios métodos. El punto 19 se consigna en un archivo pdf llamado [taller3.pdf](https://github.com/jorgelserve/EAFIT/blob/master/academico/semestre_1/fundamentos_de_programacion/talleres/3/taller3.pdf).
 
El punto 18 se resuelve en [Codingbat](http://codingbat.com). Para que se puedan calificar, usted debe crear una cuenta así: (codigoDeEstudiante)s20181g(grupo)t3@hotmail.com (no es necesario que la cuenta exista). Y debe agregar al profesor: st0242s20181g(grupo)t3@hotmail.com. Si usted no realiza este proceso, esta parte del taller no podrá ser calificada. Ver instrucciones detalladas al final de este documento.

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
----------
1. Traduzca cada una de las siguientes condiciones a condiciones lógicas que se puedan usar en una instrucción if. Asuma que ya se han declarado las variables x, y y z. Puede usar la función Math.abs(int), que retorna el valor absoluto del número que recibe como parámetro
	* z es impar
	* z no es menor que y al cuadrado
	* x no es múltiplo de z
	* v y w tienen el mismo signo
	* x es más grande que el valor absoluto de z
	* m tiene exactamente 2 dígitos y es negativo
	* b está más cerca de a que de c

2. Dadas las siguientes declaraciones:
	```java
	Int x = 1;
	Int y = -2;
	Int z = 3;
	```
	Cuál es el resultado de las siguientes expresiones:
	**a**. x == 4
	**b**. x == y
	**c**. x == z
	**d**. y == z
	**e**. x + y > 0
	**f**. x – z != 0
	**g**. x * (y + 2) > y – (y + z) * 2

3. Considere el siguiente método:
	```java
	public static void ifElseMystery2(int a, int b) {
       if (a * 2 < b) {
           a = a * 3;
       } else if (a > b) {
           b = b + 3;
       }
       if (b < a) {
           b++;
       } else {
           a--;
       }
       System.out.println(a + " " + b);
   }
	```
	
	Qué salida se produce en cada una de los siguientes llamados al método:
	* `ifElseMystery2(10, 2);` 
	* `ifElseMystery2(3, 8);`
	* `ifElseMystery2(4, 4);`
	* `ifElseMystery2(10, 30);`

4. El siguiente código tiene un error de lógica:
	```java
	Scanner console = new Scanner(System.in);
	System.out.print("Digite un número ");
	int number = console.nextInt();
	if (number % 2 == 0) {
		if (number % 5 == 0) {
			System.out.println("Divisible por 10.");
		} else {
			System.out.println("Impar.");
		}
	}
	```
	Examine el código y describa en qué caso el programa produce una información falsa acerca del número que se ingresa. Explique por qué. Luego corrija el código.

5. Escriba un método llamado printTriangleType(int, int, int). El método recibe tres parámetros enteros que representan las longitudes de los lados de un triángulo e imprime el tipo de triángulo que se puede conformar con dichas longitudes. Por ejemplo:
	* printTriangleType(5, 7, 7);
	* printTriangleType(6, 6, 6);
	* printTriangleType(5, 7, 8);
	* printTriangleType(2, 18, 2);
	
	
		Las salidas son:
	
			isósceles
			equilátero
			escaleno
			isósceles

	El programa debe imprimir un error si no se puede formar un triángulo. Por ejemplo, si uno de los lados es mayor que la suma de los otros dos lados.
	
6. Suponga que no puede usar ni el operador binario y ni tampoco el operador binario o. Escriba un algoritmo que escriba “cierto” si a es impar y si b es par; e imprima “falso” de lo contrario. Use if anidados.

7.  Escriba Un algoritmo que reciba un número de 8 dígitos, representando la fecha, así: AAAAMMDD (por ejemplo: 20160811 es el 11 de agosto de 2016). El algoritmo debe escribir separados el día, el mes y el año; y además escribir “si” si se trata de una fecha válida, o “no” de lo contrario (se puede ignorar los 29 de febrero de los años bisiestos). Pista: utilice divisiones por potencias de 10.

8. Escriba un método que reciba un carácter con el código de un color (en inglés) y escriba el nombre del color. Los códigos son: ‘R’ o ‘r’ para el rojo, ‘G’ o ‘g’ para el verde y ‘B’ o ‘b’ para el azul. Si se entra un código inválido, el programa debe producir un mensaje de error.

9. Considere las siguientes declaraciones:
	```java
	int x = 13;
	int y = -3;
	boolean b = false;
	```
	Cuál es el valor de las siguientes expresiones booleanas:
	1. !b
	2. b || true
	3. (x > y) && (x <= z)
	4. !(x % 2 == 0)
	5. b && !b
	6. (z < x) == false

10. Usando “zen booleano” (ver la presentación “ch05-program-logic-indefinite-loops.ppt” en Eafit Interactiva, Contenidos, Semana 3 ), escriba una versión mejorada del siguiente código, que retorna si una cantidad en centavos incluye “pennies” (monedas de 1 centavo de dólar):

	```java
	public static boolean hasPennies(int cents) {
	boolean nickelsOnly = (cents % 5 == 0);
	if (nickelsOnly == true) {
		return false;
	} else {
		return true;
		}
	}
	```
11. Escriba un método numUnique que reciba tres enteros como parámetro y retorne el número de valores únicos entre ellos. Por ejemplo: numUnique(18, 3, 4) retorna 3. En contraste, numUnique(6, 7, 6) retorna 2, porque solamente hay dos números únicos: el 6 y el 7.
12. Dado un valor, el programa debe imprimir el número de billetes de 10,000, de 5,000 y el número de monedas de 1,000 que se usan para obtener dicho valor. Si el número de billetes de 10,000 o 5,000 o el número de monedas de 1,000 es 0; no se debe imprimir esa denominación. 

13.  El índice de masa corporal, o IMC, es un método matemático con el que se puede evaluar el peso corporal de una persona en relación con su estatura. Para ello, en primer lugar, hay que medir el peso corporal y la estatura; el primero se expresa en kilogramos y el segundo, en metros. El IMC es el resultado de dividir el peso por el cuadrado de la estatura. 
	**La tabla que relaciona el ICM con una condición física es:**

| Condición Física | Hombre | Mujer |
|--|--|--|
| Falta de peso | IMC por debajo de 20 | por debajo de 19 |
| Peso norma | IMC entre 20-25 | IMC entre 19-24 |
| Sobrepeso | IMC entre 26-30 | IMC entre 25-30 |
| Obesidad | IMC entre 31-40 | IMC entre 31-40 |
| Fuerte obesidad | IMC mayor de 40 | IMC mayor de 40 |

Se requiere hacer un programa que ayude a medir la condición física de una persona. Esto es, el método debe recibir como parámetros la estatura y el peso de la persona y debe escribir su condición física.

14. Los cumpleaños son para todos una fecha especial.  El primero de enero de cada año usted desea conocer cuántos días faltan para su cumpleaños, o el de cualquiera de sus familiares y amigos. Elabore un algoritmo que le permita conocer cuántos días faltan para su cumpleaños a partir del 1 de enero. Esto es, el programa debe recibir el mes del año (como un número entre 1 y 12) y el día del mes del cumpleaños, y retornar el número de días que faltan para el cumpleaños desde el primero de enero.

15. Un trabajador necesita calcular su salario semanal, el cual se calcula de la siguiente manera:
	• Si trabaja 40 horas o menos se le paga $10000 por hora.
	• Si trabaja más de 40 horas se le paga $10000 por cada una de las 
	
	primeras 40 horas y $20000 por cada hora extra.
	
	Escriba un programa en Java que reciba el número de horas trabajadas por el empleado e imprima el salario de la semana.

16. Desarrolle un programa en java que calcule el gasto de agua en una vivienda dado el número de litros gastados, siendo el sistema de cobro como sigue:  
• La cuota fija mensual es de $60.000
• Los primeros 50 litros son gratis
• Entre 50 y 200 litros se cobra el litro a $30.000
• A partir de 200 litros se cobra el litro a $50.000

	Escriba un método que reciba el número de litros de agua gastados e imprima el valor que se debe pagar por el consumo de agua en la vivienda.

17. Los siguientes puntos son de la herramienta [CodingBat](http://codingbat.com) (ver las instrucciones al comienzo del taller)
	* ​logic 1: alarmClock
	* ​logic 1: specialEleven
	* ​logic 2: loneSum​
	* ​logic 2: luckySum
	* ​logic 2: noTeenSum
	* ​logic 2: roundSum

18. Consultas en la biblioteca. Realice las siguientes consultas en libros digitales en la biblioteca de la Universidad.  MUY IMPORTANTE: No olvide citar las fuentes.
**a**. ¿Qué son ciclos en computación?
**b**. Identifique por lo menos dos tipos de ciclos, dependiendo si la condición para continuar o no se chequea al principio o al final del ciclo.
**c**. ¿Cuándo es más conveniente utilizar uno y cuándo es más conveniente utilizar el otro?
---
### Código de Ética
* Usted puede conversar con sus compañeros acerca de los enfoques que cada uno está utilizando para la tarea, pero NO se debe mirar el código de sus compañeros y mucho menos usarlo como parte de su tarea.  
* No debe aceptar que otra persona (compañero, tío, amigo, novia, primo hermano del mocho) “le ayude” escribiendo parte del código de su tarea.
* Copiar código de un compañero constituye un fraude. Para mayor información, mirar el [reglamento]( http://www.eafit.edu.co/institucional/reglamentos/Paginas/reglamento-academico-pregrado.aspx) académico de EAFIT:

 
* http://www.eafit.edu.co/institucional/reglamentos/Documents/pregrado/regimen-disciplinario/cap1.pdf
 