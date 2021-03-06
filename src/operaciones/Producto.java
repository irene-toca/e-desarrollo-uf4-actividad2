package operaciones;

/**
 * Esta clase implementar todos los metodos que estan relacionados con la
 * multiplicacion de la calculadora.
 * 
 * @author Felix
 *
 */
public class Producto {

	/**
	 * Multiplica dos reales.
	 * 
	 * @param num1 numero real 1.
	 * @param num2 numero real 2.
	 * @return un double, producto de (num1, num2).
	 */
	public static double multiplica2reales(double num1, double num2) {
		return num1 * num2;
	}

	/**
	 * Multiplica dos enteros.
	 * 
	 * @param num1 entero numero 1.
	 * @param num2 entero numero 2.
	 * @return un integer, producto de (num1, num2).
	 */
	public static int multiplica2enteros(int num1, int num2) {
		return num1 * num2;
	}

	/**
	 * Multiplica tres reales.
	 * 
	 * @param num1 numero real 1.
	 * @param num2 numero real 2.
	 * @param num3 nmero real 3.
	 * @return un double, producto de (num1, num2, num3).
	 */
	public static double multiplica3reales(double num1, double num2, double num3) {
		return num1 * num2 * num3;
	}

	/**
	 * Exponecia un numero en funci�n de otro.
	 * 
	 * @param num1 numero real base.
	 * @param num2 numero real exponente.
	 * @return un double, resultado de elevar num1 a num2.
	 */
	public static double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}

}
