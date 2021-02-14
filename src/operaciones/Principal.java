package operaciones;

import java.util.Locale;
import java.util.Scanner;

/**
 * Esta clase es para ejecutar los métodos de las diferentes clases
 *
 * @author rober, Irene, F�lix
 ** @version 1.0
 * @since 14-02-2021 .
 */
public class Principal {

	/**
	 * 
	 * @param args Parámetros para la clase main
	 */
	public static void main(String[] args) {
		// Declaración de variables para los métodos de la clase Suma
		double a;
		double b;
		double c;
		int a1;
		int b1;
		double resultado;
		int solucion;
		Suma suma1 = new Suma();

		Scanner entrada = new Scanner(System.in);
		entrada.useLocale(Locale.US);

		System.out.println(
				"¿Que tipo de operacion quieres realizar? \nIntroduce suma, resta, multiplicacion o division");

		// Entrada por teclado. Obligamos a que la palabra se vaya a minisculas
		String operacion = entrada.nextLine().toLowerCase();

		// Menu operación para seleccionar segun lo teclado
		switch (operacion) {

		case "suma":
			System.out.println("Operación Suma");
			System.out.println("Pulse 1 para sumar dos números reales ");
			System.out.println("Pulse 2 para sumar dos números enteros ");
			System.out.println("Pulse 3 para sumar tres números reales");
			System.out.println("Pulse 4 para sumar el valor acumulado de tres números");

			// Entrada por teclado
			int operacionSuma = entrada.nextInt();

			// Otro menú para seleccionar las operaciones de la resta
			switch (operacionSuma) {

			case 1:
				System.out.println("\nPRIMER MÉTODO  SUMA DE  2 REALES\n");
				System.out.println("Introduce un número");

				a = entrada.nextDouble();
				System.out.println(a);
				System.out.println("Introduce otro número");
				b = entrada.nextDouble();
				System.out.println(b);

				resultado = suma1.suma2Reales(a, b);
				System.out.println("El resultado de la suma es: " + resultado);
				System.out.println("\n***********************\n");
				break;

			case 2:
				System.out.println("\nSEGUNDO MÉTODO  SUMA DE 2 ENTEROS\n");

				System.out.println("Introduce un número");
				a1 = entrada.nextInt();
				System.out.println(a1);
				System.out.println("Introduce otro número");
				b1 = entrada.nextInt();
				System.out.println(b1);

				solucion = suma1.suma2Enteros(a1, b1);
				System.out.println("El resultado de la suma es: " + solucion);
				System.out.println("\n***********************\n");
				break;

			case 3:
				System.out.println("\nTERCER MÉTODO  SUMA DE 3 REALES\n");
				System.out.println("Introduce un número");
				a = entrada.nextDouble();
				System.out.println(a);
				System.out.println("Introduce otro número");
				b = entrada.nextDouble();
				System.out.println(b);
				System.out.println("Introduce último número");
				c = entrada.nextDouble();

				resultado = suma1.suma3Reales(a, b, c);
				System.out.println("El resultado de la suma es: " + resultado);
				System.out.println("\n***********************\n");
				break;

			case 4:
				System.out.println("\nCUARTO MÉTODO ACUMULANDO \nSe repetirá tres veces");
				System.out.println("Introduce un número");
				a1 = entrada.nextInt();
				solucion = suma1.valorAcumulado(a1);
				System.out.println("El valor acumulado es : " + solucion);

				System.out.println("Introduce otro número");
				a1 = entrada.nextInt();
				solucion = suma1.valorAcumulado(a1);
				System.out.println("El valor acumulado es : " + solucion);

				System.out.println("Introduce el último número");
				a1 = entrada.nextInt();
				solucion = suma1.valorAcumulado(a1);
				System.out.println("FIN. El valor acumulado es : " + solucion);
				break;

			default:
				System.out.println("La opción seleccionada no es correcta \nFin del programa");

			}

			break;

		// Opciones de resta
		case "resta":
			System.out.println("Operación Resta");
			System.out.println("Pulse 1 para restar dos números reales");
			System.out.println("Pulse 2 para restar dos números enteros");
			System.out.println("Pulse 3 para restar tres números reales");
			System.out.println("Pulse 4 para ir restando números hasta llegar a 0 o inferior");

			// Entrada por teclado
			int operacionResta = entrada.nextInt();

			// Otro menu para seleccionar las operaciones de la resta
			switch (operacionResta) {

			// Pasamos dos variables y llamamos al método resta2Reales de clase Resta

			case 1:
				System.out.println("Introduzca primer digito");
				double num1Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num2Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Resta.resta2Reales(num1Real, num2Real));
				break;
			// Pasamos dos variables y llamamos al metodo resta2Enteros de clase Resta

			case 2:
				System.out.println("Introduzca primer digito");
				int num1Entero = entrada.nextInt();
				System.out.println("Introduzca segundo digito");
				int num2Entero = entrada.nextInt();
				System.out.println("El resultado es: " + Resta.resta2Enteros(num1Entero, num2Entero));
				break;

			// Pasamos tres variables y llamamos al metodo resta3Reales de clase Resta
			case 3:
				System.out.println("Introduzca primer digito");
				double num3Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num4Real = entrada.nextDouble();
				System.out.println("Introduzca tercer digito");
				double num5Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Resta.resta3Reales(num3Real, num4Real, num5Real));
				break;

			// Llamamos directamente a restaAcumulado de clase Resta donde realizaremos las
			// operaciones
			case 4:

				Resta.restaAcumulado();

				break;

			}

			break;
		case "Producto":
			System.out.println("Operacion Producto");
			System.out.println("Pulse 1 para multiplicar dos números reales");
			System.out.println("Pulse 2 para multiplicar dos números enteros");
			System.out.println("Pulse 3 para multiplicar tres números reales");
			System.out.println("Pulse 4 para exponenciar el primer n�mero introducido por el segundo");

			// Entrada por teclado
			int operacionProducto = entrada.nextInt();

			// Switch de selecci�n de operaci�n en men�
			switch (operacionProducto) {

			// Pasamos dos variables y llamamos al metodo multiplica2Reales de clase
			// Producto

			case 1:
				System.out.println("Introduzca primer digito");
				double num1Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num2Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Producto.multiplica2reales(num1Real, num2Real));
				break;

			// Pasamos dos variables y llamamos al metodo multiplica2enteros de clase
			// Producto
			case 2:
				System.out.println("Introduzca primer digito");
				int num1Entero = entrada.nextInt();
				System.out.println("Introduzca segundo digito");
				int num2Entero = entrada.nextInt();
				System.out.println("El resultado es: " + Producto.multiplica2enteros(num1Entero, num2Entero));
				break;

			// Pasamos tres variables y llamamos al metodo multiplica3reales de clase
			// Producto
			case 3:
				System.out.println("Introduzca primer digito");
				double num1Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num2Real = entrada.nextDouble();
				System.out.println("Introduzca tercer digito");
				double num3Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Producto.multiplica3reales(num1Real, num2Real, num3Real));
				break;

			// Pasamos dos variables y llamamos al metodo potencia
			case 4:
				System.out.println("Introduzca primer digito");
				double num1Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num2Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Producto.potencia(num1Real, num2Real));
				break;

			}

			break;
		case "división":
			System.out.println("es la división");
			break;

		default:
			System.out.println("La operación introducida no es valida \nFin del programa.");
		}

	}

}
