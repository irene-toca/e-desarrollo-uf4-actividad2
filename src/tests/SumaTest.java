package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;


import operaciones.Suma;
	
	
	/**En esta clas test se iplementaran las pruebas para conseguir
	 * checkear los metodos adscritos a la clase Suma.
	 *
	 * Para ello crearemos 4 test que tiene dicha clase,
	 *
	 * @version 0.1
	 * @author Pedro
	 * @since 20/02/2020
	 */
 		public class SumaTest {
 	static public int acumulador = 0;	
 	static double resultado;
 	static int solucion;
 	static int num;
 	static Scanner scanner = new Scanner(System.in);
 	Suma suma = new Suma();


 	/**
 	 * Test de verificacion del método suma2Reales
 	 * tenemos que conseguir que nuestro resultado sea igual
 	 * al esperado por el sistema
 	 */
 	@Test
 	public void Testsuma2Reales() {
 		double resultado = suma.suma2Reales(5.4, 7.5);
 		double esperado = 12.9;

 		assertEquals(esperado, resultado);
 	}
 	@Test
 	public void Testsuma2Reales0() {
 		double resultado = suma.suma2Reales(0,0);
 		double esperado = 0;

 		assertEquals(esperado, resultado);
 	}

 	@Test
	public void Testsuma2Realesnegativo() {
 		double resultado = suma.suma2Reales(-1,-2);
 		double esperado = -3;

 		assertEquals(esperado, resultado);
 	}
 	@Test
 	public void Testsuma2Enteros () {
 		int resultado = suma.suma2Enteros(6,4);
 		int esperado = 10;

 		assertEquals(esperado, resultado);
 	}
 	@Test
 	public void Testsuma2Enteros0 () {
 		int resultado = suma.suma2Enteros(0,0);
 		int esperado = 0;

 		assertEquals(esperado, resultado);
 	}
 	@Test
 	public void Testsuma2Enterosnegativos () {
 		int resultado = suma.suma2Enteros(-2,-3);
 		int esperado = -5;

 		assertEquals(esperado, resultado);
 	}	
 	@Test
 	public void Testsuma3Reales () {
 		double resultado  = suma.suma3Reales(2.3,4.1,5.1);
 		double esperado = 11.5;

 		assertEquals(esperado, resultado);
 	}
 	@Test
 	public void Testsuma3Reales0 () {
 		double resultado  = suma.suma3Reales(0,0,0);
 		double esperado = 0;

 		assertEquals(esperado, resultado);
 	}
 	@Test
 	public void Testsuma3Realesnegativos () {
 		double resultado  = suma.suma3Reales(-1,-2,-3);
 		double esperado = -6;

 		assertEquals(esperado, resultado);
 	}

 	@Test
 	public void TestvalorAcumulado () {
 		suma.resetValorAcumulado();
 		
 		suma.valorAcumulado(3.2);
 		suma.valorAcumulado(4.7);
 		suma.valorAcumulado(10.3);

 		double esperado = 18.2;
 		assertEquals(esperado, Suma.valorAcumulado, 0.00000000001);

 	}
 	@Test
	public void TestvalorAcumulado0 () {
 		suma.resetValorAcumulado();
 		
 		suma.valorAcumulado(0);
 		suma.valorAcumulado(0);
 		suma.valorAcumulado(0);
 		double esperado = 0;
 		assertEquals(esperado, Suma.valorAcumulado, 0.00000000001);

 	}
 	@Test
 	public void TestvalorAcumuladonegativo () {
 		suma.resetValorAcumulado();
 		
 		suma.valorAcumulado(-1.0);
 		suma.valorAcumulado(-2.0);
 		suma.valorAcumulado(-3.0);
 		double esperado = -6.0;
 		assertEquals(esperado, Suma.valorAcumulado, 0.00000000001);
 	}
 }