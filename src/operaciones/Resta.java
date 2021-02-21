package operaciones;

import java.util.Scanner;

/**
 * Esta clase definirá las operaciones relacionadas con la resta
 *
 * @author rober
 ** @version 2.0
 * @since 18-01-2021 .
 */
public class Resta {
	
	

	/**
	 * Usando la variable entera acumuLador iremos restando numeros
	 */
	static int acumuLador = 0;

	/**
	 * Variable de tipo double para restar los dos numeros reales
	 */
	double resultado;

	/**
	 * Variable de tipo integer para restar los numeros enteros
	 */
	int solucion;
	
	/**
	 * Variable entrada para obtener los valores del Scanner por consola
	 */

	private static Scanner entrada;

	/**
	 * En este metodo restaré dos variables de tipo double y devolvere un resultado
	 *
	 * @param num1      - Valor introducido por el usuario
	 * @param num2      - Valor introducido por el usuario
	 * @param resultado - Resultado de restar num1 menos num2
	 */
	public static double resta2Reales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * En este metodo restaré dos variables de tipo entero y devolvere un resultado
	 *
	 * @param num1     - Valor introducido por el usuario
	 * @param num2     - Valor introducido por el usuario
	 * @param solucion - Resultado de restar num1 menos num2
	 */
	public static int resta2Enteros(int num1, int num2) {

		return (num1 - num2);
	}

	/**
	 * En este metodo restaré tres variables de tipo double y devolvere un resultado.
	 *
	 * @param num1     - Valor introducido por el usuario.
	 * @param num2     - Valor introducido por el usuario.
	 * @param num3     - Valor introducido por el usuario.
	 * @param solucion - Resultado de restar num1 menos num2 menos num3.
	 */
	public static double resta3Reales(double num1, double num2, double num3) {

		return (num1 - num2 - num3);
	}

	/**
	 * En este metodo ire restando variables de tipo entero hasta obtener un
	 * resultado
	 *
	 * @param acumulador     - Iremos restando los numeros hasta llegar a 0. Cuando
	 *                       llegue a 0 acaba el bucle.
	 * @param numArestar     - Valor introducido por el usuario que ira restando al
	 *                       acumulador.
	 * @param resultadoResta - Es el resultado obtenido de restar al acumulador el
	 *                       numArestar.
	 */
	public static void restaAcumulado() {
		
		
		entrada = new Scanner(System.in);

		
		System.out.println("Introduzca primer digito");
		int acumulador = entrada.nextInt();
		while (acumulador <= 0) {
			System.out.println("Introduzca numero mayor que cero");
			acumulador = entrada.nextInt();

		}
		
		System.out.println(acumulador);

		for (int i = 0; i < 2; i++) {
			System.out.println("Introduzca digito a restar");
			int numArestar = entrada.nextInt();
			int resultadoResta = acumulador - numArestar;
			acumulador = resultadoResta;
			System.out.println("El resultado de la operacion es: " + resultadoResta);
			if (resultadoResta <= 0) {
				i = 2;

			} else {
				i = 0;
			}

		}

	}

}