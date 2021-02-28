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
	 * Usando la variable double acumuLador iremos restando numeros,
         * siendo el primero el numero a restar por los siguientes
	 */
	public static double valorAcumulado = 100;
        

	
	
	/**
	 * Variable entrada para obtener los valores del Scanner por consola
	 */

	private static Scanner entrada;

	/**
	 * En este metodo restaré dos variables de tipo double y devolvere un resultado
	 *
	 * @param num1      - Valor introducido por el usuario
	 * @param num2      - Valor introducido por el usuario
	 * @return resultado - Este es el resultado de la resta
	 */
	public static double resta2Reales(double num1, double num2) {
		double resultado = num1 - num2;

		return resultado;
	}

	/**
	 * En este metodo restaré dos variables de tipo entero y devolvere un resultado
	 *
	 * @param num1     - Valor introducido por el usuario
	 * @param num2     - Valor introducido por el usuario
	 * @return resultado - Este es el resultado de la resta
	 * 
	 */
	public static int resta2Enteros(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}

	/**
	 * En este metodo restaré tres variables de tipo double y devolvere un resultado.
	 *
	 * @param num1     - Valor introducido por el usuario.
	 * @param num2     - Valor introducido por el usuario.
	 * @param num3     - Valor introducido por el usuario.
	 * @return resultado - Este es el resultado de la resta
	 * 
	 */
	public static double resta3Reales(double num1, double num2, double num3) {
		double resultado = num1 - num2 -num3;
		return resultado;
	}

	/**
	 * En este metodo ire restando numeros al valorAcumulado
	 * @param num       - Valor que ira restando el valor fijado
	 
	 */
        public static void valorAcumulado(double num) {
		Resta.valorAcumulado-=num ;

	}
	
	/**
	 * Este metodo pone el valor acumulado al numero que introduzcamos
         * @param num       - Valor que fijaremos para ir restando los demas numeros
	 */
	public static void setValorAcumulado(double num) {
		Resta.valorAcumulado = num;
	}

}