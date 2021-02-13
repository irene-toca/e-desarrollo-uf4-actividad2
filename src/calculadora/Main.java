package calculadora;

import java.util.Locale;
import java.util.Scanner;

import operaciones.Suma;

/**
 * Clase para ejecutar los métodos desarrollados por el equipo
 * @author Irene, Félix, Pedro, Roberto
 *
 */
public class Main {

	public static void main(String[] args) {
		
		double a; 
		double b;
		double c;
		int a1;
		int b1;
		double resultado;
		int solucion;

		/**
		 * Pruebas de la clase Suma
		 */
		System.out.println("\nPRIMER M�TODO  SUMA DE  2 REALES\n");
		System.out.println("Introduce un numero");

		Scanner scanner = new Scanner(System.in);
		scanner.useLocale(Locale.US);
		 a = scanner.nextDouble();
		System.out.println(a);
		System.out.println("Introduce otro numero");
		 b = scanner.nextDouble();
		System.out.println(b);

		Suma suma1 = new Suma();
		resultado = suma1.suma2Reales(a, b);
		System.out.println(" el resultado de la suma es: " + resultado);
		System.out.println("\n***********************\n");


		System.out.println("\nSEGUNDO M�TODO  SUMA DE 2 ENTEROS\n");
		System.out.println("Introduce un numero");
		 a1 = scanner.nextInt();
		System.out.println(a1);
		System.out.println("Introduce otro numero");
		 b1 = scanner.nextInt();
		System.out.println(b1);

		solucion = suma1.suma2Enteros(a1, b1);
		System.out.println(" el resultado de la suma es: " + solucion);
		System.out.println("\n***********************\n");


		System.out.println("\nTERCER M�TODO  SUMA DE 3 REALES\n");
		System.out.println("Introduce un numero");
		 a = scanner.nextDouble();
		System.out.println(a);
		System.out.println("Introduce otro numero");
		 b = scanner.nextDouble();
		System.out.println(b);
		System.out.println("Introduce �ltimo numero");
		c = scanner.nextDouble();

		resultado = suma1.suma3Reales(a, b, c);
		System.out.println(" el resultado de la suma es: " + resultado);
		System.out.println("\n***********************\n");


		System.out.println("\nCUARTO M�TODO ACUMULANDO \nSe repetirá tres veces");
		System.out.println("Introduce un numero");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);

		System.out.println("Introduce otro numero");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("El valor acumulado es : "  + solucion);

		System.out.println("Introduce el último numero");
		 a1 = scanner.nextInt();
		 solucion = suma1.valorAcumulado(a1);
		System.out.println("FIN. El valor acumulado es : "  + solucion);

		/**
		 * Fin de bloque de pruebas de la clase Suma
		 */

	}

}