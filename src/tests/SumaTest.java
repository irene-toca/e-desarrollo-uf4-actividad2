package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;


import operaciones.Suma;


	/**En esta clase test se iplementaran las pruebas para conseguir
	 * chekear los metodos adscritos a la clase Suma.
	 * 
	 * Para ello crearemos 4 bloques de test que tiene dicha clase,
	 *  y 3 test por cada uno para los diferentes posibles casos de
	 *  resultados negativos, cero o otros casos.
	 * 
	 * @version 0.1
	 * @author Pedro
	 * @since 20/02/2020
	 */
 public class SumaTest {
	 	/**
		 * Test de verificacion del metodo suma2Reales
		 * tenemos que conseguir que nuestro resultado sea igual
		 * al esperado por el sistema
		 */
	@Test
	public void Testsuma2Reales() {
		double resultado = Suma.suma2Reales(5.4, 7.5);
		double esperado = 12.9;
		
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma2Reales
	 * comprobando la casuistica en la que el resutaldo sea 0 
	 * y los diferentes sumandos sean 0
	 */
	@Test
	public void Testsuma2Reales0() {
		double resultado = Suma.suma2Reales(0,0);
		double esperado = 0;
		
		assertEquals(esperado, resultado);	
	}
	/**
	 * Test de verificacion del metodo suma2Reales
	 * comprobando el caso de resultado negativo y que los
	 * sumandos sean negativos
	 */
	@Test
	public void Testsuma2Realesnegativo() {
		double resultado = Suma.suma2Reales(-1,-2);
		double esperado = -3;
		
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma2Enteros
	 * tenemos que conseguir que nuestro resultado sea igual
	 * al esperado por el sistema
	 */
	@Test
	public void Testsuma2Enteros () {
		int resultado = Suma.suma2Enteros(6,4);
		int esperado = 10;
		
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma2Enteros
	 * comprobando la casuistica en la que el resutaldo sea 0 
	 * y los diferentes sumandos sean 0
	 */
	@Test
	public void Testsuma2Enteros0 () {
		int resultado = Suma.suma2Enteros(0,0);
		int esperado = 0;
		
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma2Enterosnegativos
	 * comprobando el caso de resultado negativo y que los
	 * sumandos sean negativos
	 */
	@Test
	public void Testsuma2Enterosnegativos () {
		int resultado = Suma.suma2Enteros(-2,-3);
		int esperado = -5;
		
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma3Reales
	 * tenemos que conseguir que nuestro resultado sea igual
	 * al esperado por el sistema
	 */
	@Test
	public void Testsuma3Reales () {
		double resultado  = Suma.suma3Reales(2.3,4.1,5.1);
		double esperado = 11.5;
				
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma3Reales
	 * comprobando la casuistica en la que el resutaldo sea 0 
	 * y los diferentes sumandos sean 0
	 */
	@Test
	public void Testsuma3Reales0 () {
		double resultado  = Suma.suma3Reales(0,0,0);
		double esperado = 0;
				
		assertEquals(esperado, resultado);
	}
	/**
	 * Test de verificacion del metodo suma3Realesnegativos
	 * comprobando el caso de resultado negativo y que los
	 * sumandos sean negativos
	 */
	@Test
	public void Testsuma3Realesnegativos () {
		double resultado  = Suma.suma3Reales(-1,-2,-3);
		double esperado = -6;
				
		assertEquals(esperado, resultado);
	}	
	//revisar ya que este codigo tiene que ser muy revisado
	@Test
	
	public void TestvalorAcumulado () {

		double resultado  = Suma.valorAcumulado(1,2,3);
		double esperado = 6;
			assertEquals(esperado, resultado);
			
		
		}
	/**
	 * Test de verificacion del metodo valorAcumulado
	 * comprobando la casuistica en la que el resutaldo sea 0 
	 * y los diferentes sumandos sean 0
	 */
	@Test
	public void TestvalorAcumulado0 () {
		double resultado  = Suma.valorAcumulado(0,0,0);
		double esperado = 0;
			assertEquals(esperado, resultado);
			
		}
	/**
	 * Test de verificacion del metodo valorAcumulado
	 * comprobando el caso de resultado negativo y que los
	 * sumandos sean negativos
	 */
 @Test
	public void TestvalorAcumuladonegativos () {
		double resultado  = Suma.valorAcumulado(-1,-3,3);
		double esperado = -1;
			assertEquals(esperado, resultado);
			
		}
}