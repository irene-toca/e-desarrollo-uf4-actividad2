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
		
		
	/**
	 * Test de verificacion del método suma2Reales
	 * tenemos que conseguir que nuestro resultado sea igual
	 * al esperado por el sistema
	 */
	@Test
	public void Testsuma2Reales() {
		double resultado = Suma.suma2Reales(5.4, 7.5);
		double esperado = 12.9;
		
		assertEquals(esperado, resultado);
	}
	@Test
	public void Testsuma2Reales0() {
		double resultado = Suma.suma2Reales(0,0);
		double esperado = 0;
		
		assertEquals(esperado, resultado);	
	}

	@Test
	public void Testsuma2Realesnegativo() {
		double resultado = Suma.suma2Reales(-1,-2);
		double esperado = -3;
		
		assertEquals(esperado, resultado);
	}
	@Test
	public void Testsuma2Enteros () {
		int resultado = Suma.suma2Enteros(6,4);
		int esperado = 10;
		
		assertEquals(esperado, resultado);
	}
	@Test
	public void Testsuma2Enteros0 () {
		int resultado = Suma.suma2Enteros(0,0);
		int esperado = 0;
		
		assertEquals(esperado, resultado);
	}
	@Test
	public void Testsuma2Enterosnegativos () {
		int resultado = Suma.suma2Enteros(-2,-3);
		int esperado = -5;
		
		assertEquals(esperado, resultado);
	}
	@Test
	public void Testsuma3Reales () {
		double resultado  = Suma.suma3Reales(2.3,4.1,5.1);
		double esperado = 11.5;
				
		assertEquals(esperado, resultado);
	}
	@Test
	public void Testsuma3Reales0 () {
		double resultado  = Suma.suma3Reales(0,0,0);
		double esperado = 0;
				
		assertEquals(esperado, resultado);
	}	
	@Test
	public void Testsuma3Realesnegativos () {
		double resultado  = Suma.suma3Reales(-1,-2,-3);
		double esperado = -6;
				
		assertEquals(esperado, resultado);
	}	
	//revisar ya que este codigo tiene que ser muy revisado
	@Test
	public void TestvalorAcumulado () {
		double resultado  = Suma.valorAcumulado();
		for(int i = 1; i <= 3; i++) {
			
			num = 2;
			num = 3;
			num = 1;
			Suma.acumulador = Suma.acumulador + num;
			//Suma.acumulador += num;
		}
		
		double esperado = 6;
			assertEquals(esperado, resultado);
			
		}
	/*@Test
	public void TestvalorAcumulado0 () {
		double resultado  = Suma.valorAcumulado();
		scanner.nextInt(0);
		scanner.nextInt(0);
		scanner.nextInt(0);
		double esperado = 0;
			assertEquals(esperado, resultado);
			
		}@Test
	public void TestvalorAcumuladonegativo () {
			double resultado  = Suma.valorAcumulado();
			scanner.nextInt(-2);
			scanner.nextInt(-3);
			scanner.nextInt(-1);
			double esperado = -6;
				assertEquals(esperado, resultado);
				
			}*/
 }