package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import operaciones.Resta;
import operaciones.Suma;

class RestaTest {

	@Test
	public void testResta2Reales() {
		double resultado = Resta.resta2Reales(5.4, 3.1);
		double esperado = 2.3;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	@Test
	public void testResta2RealesMenor0() {
		double resultado = Resta.resta2Reales(5.4, 6.4);
		double esperado = -1;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	@Test
	public void testResta2Enteros() {
		int resultado = Resta.resta2Enteros(9, 7);
		int esperado = 2;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta2EnterosMenor0() {
		int resultado = Resta.resta2Enteros(9, 19);
		int esperado = -10;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testResta3Reales() {
		double resultado = Resta.resta3Reales(9.9, 2.4, 3.2);
		double esperado = 4.3;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	@Test
	public void testResta3RealesMenor0() {
		double resultado = Resta.resta3Reales(9.9, 10.9, 3.8);
		double esperado = -4.8;
		
		assertEquals(esperado, resultado, 0.000000000000001);
	}
	
	@Test
	public void testRestaAcumulado() {
		Resta.restaAcumulado();
		
		// en este momento se abre la consola y nos pide los números necesarios 
		// para ejecutar este método.
		// Al finalizar el resultado es correcto y JUnit nos muestra todos los test como aprobados
	}

}
