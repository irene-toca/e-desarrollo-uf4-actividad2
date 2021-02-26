package operaciones;

import java.util.Scanner;

/**
 * Esta clase implementará todos los metodos que estan relacionados con la sumas de la calculadora
 * @author irene  
 * @version 1.0
 * @since 17- 01- 2021 
 * 
 * double resultado  es lo que nos dara al sumar  los dos numeros reales en el primer metodo
 * tambien lo podremos reutilizar para sumar los tres numeros reales en el tercer metodo 
 * 
 * int solucion       es lo que nos dara al sumar  los dos numeros entero 
 * 
 * static int acumulador = 0 este empieza en cero e iremos acumulando segun los numeros que pasemos por consola 
 * 
 */
public class Suma {	
	public double n1;
	public double resultado;
	public int solucion;
	public int num;
	public static double valorAcumulado = 0;

	
	
	
	
	/**
	 * 
	 * Creamos un metodo  double  Suma2Reales
	 * 
	 * @param num1  es un double y es el primer numero real a sumar
	 * @param num2  es un double y es el segundo numero real a sumar
	 * @return resultado      Nos devuelve  double como resultado  ya que es la  suma de dos numeros  reales  (num1, num2) que retornan
	 * 
	 */
	public double suma2Reales(double num1, double num2) {
		resultado = num1 + num2;
		return resultado;
	}
	
	
	/**
	 * 
	 * Creamos un metodo int Sumamos2Enteros
	 * al cual le pasamos por consola  dos numeros enteros  para poderlos suma
	 * 
	 * @param num1  es un int primer numero entero a sumar
	 * @param num2  es un int segundo numero entero a sumar
	 * @return solucion      Nos devuelve  int como solucion ya que es la  suma de dos numeros enteros  (num1, num2) que retornan
	 * 
	 */
	public int suma2Enteros(int num1, int num2) {
		solucion = num1 + num2;
		return solucion;
		
	}
	
	
	/**
	 * Creamos un metodo  double  Suma3Reales
	 * al cual le pasamos por consola  tres numeros reales para poderlos sumar 
	 * 
	 * @param num1  es un double y es el primer numero real a sumar
	 * @param num2  es un double y es el segundo numero real a sumar
	 * @param num3  es un double y es el tercer numero real a sumar
	 * @return resultado     Nos devuelve  double como resultado  ya que es la  suma de tres  numeros 
	 *              reales  (num1, num2, num3) que retornan
	 * 
	 */
	public double suma3Reales(double num1, double num2, double num3) {
		resultado = num1 + num2 + num3;
		return resultado;
		
	}
	
	
	/**
	 * 
	 * Creamos un metodo valorAcumulado que añade un valor a la propiedad static valorAcumulado
	 * 
	 * @param  num valor que se añadirá a la propiedad static valorAcumulado
	 * 
	 */

	public void valorAcumulado(double num) {
		Suma.valorAcumulado += num;

	}
}