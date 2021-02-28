package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Resta;
import operaciones.Suma;

class RestaTest {
	
	double resultado;
	int resultado2;
	double esperado;
	int esperado2;

	/**
	 * Test para el m�todo resta2Reales
	 */
	@Test
	public void testResta2Reales() {
		 resultado = Resta.resta2Reales(5.4, 3.1);
		 esperado = 2.3;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	/**
	 * Test para el m�todo resta2Reales llegando a un resultado menor a 0
	 */
	@Test
	public void testResta2RealesMenor0() {
		 resultado = Resta.resta2Reales(5.4, 6.4);
		 esperado = -1;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	/**
	 * Test para el m�todo resta2Enteros
	 */
	@Test
	public void testResta2Enteros() {
		 resultado2 = Resta.resta2Enteros(9, 7);
		 esperado2 = 2;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Test para el m�todo resta2Enteros llegando a un resultado menor a 0
	 */
	@Test
	public void testResta2EnterosMenor0() {
		resultado2 = Resta.resta2Enteros(9, 19);
		esperado2 = -10;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Test para el m�todo resta3Reales
	 */
	@Test
	public void testResta3Reales() {
		resultado = Resta.resta3Reales(9.9, 2.4, 3.2);
		esperado = 4.3;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	/**
	 * Test para el m�todo resta3Reales llegando a un resultado menor a 0
	 */
	@Test
	public void testResta3RealesMenor0() {
		resultado = Resta.resta3Reales(9.9, 10.9, 3.8);
		esperado = -4.8;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	/**
	 * Test para el método restaAcumulado
	 */
	@Test
	public void testRestaAcumulado() {
		// primero ingresamos el número que será el minuendo
		
		Resta.setValorAcumulado(32.6);
		
		// luego los sustraendos
		
		Resta.valorAcumulado(7.3);
		Resta.valorAcumulado(5.9);
		Resta.valorAcumulado(100.7);
		
		esperado = -81.3;
		
		assertEquals(esperado, Resta.valorAcumulado, 0.00000000001);
	}

}
