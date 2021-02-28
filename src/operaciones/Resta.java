package operaciones;

import java.util.Scanner;

/**
 * Esta clase definir� las operaciones relacionadas con la resta
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
	 * En este metodo restar� dos variables de tipo double y devolvere un resultado
	 *
	 * @param num1      - Valor introducido por el usuario
	 * @param num2      - Valor introducido por el usuario
	 * 
	 */
	public static double resta2Reales(double num1, double num2) {

		return (num1 - num2);
	}

	/**
	 * En este metodo restar� dos variables de tipo entero y devolvere un resultado
	 *
	 * @param num1     - Valor introducido por el usuario
	 * @param num2     - Valor introducido por el usuario
	 * 
	 */
	public static int resta2Enteros(int num1, int num2) {

		return (num1 - num2);
	}

	/**
	 * En este metodo restar� tres variables de tipo double y devolvere un resultado.
	 *
	 * @param num1     - Valor introducido por el usuario.
	 * @param num2     - Valor introducido por el usuario.
	 * @param num3     - Valor introducido por el usuario.
	 * 
	 */
	public static double resta3Reales(double num1, double num2, double num3) {

		return (num1 - num2 - num3);
	}

	/**
	 * En este metodo ire restando numeros al valorAcumulado
	 * @param num       - Valor que ira restando el valor fijado
	 
	 */
        public void valorAcumulado(double num) {
		Resta.valorAcumulado-=num ;

	}
	
	/**
	 * Este metodo pone el valor acumulado al numero que introduzcamos
         * @param num       - Valor que fijaremos para ir restando los demas numeros
	 */
	public void setValorAcumulado(double num) {
		Resta.valorAcumulado = num;
	}

}