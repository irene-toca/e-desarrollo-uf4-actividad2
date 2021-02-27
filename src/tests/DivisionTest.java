package tests;

/**
 * @autor F�lix Cart�n
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import operaciones.Division;

public class DivisionTest {

	/**
	 * Comprobamos que el m�todo diviDIsion2reales, en efecto, diDIvide dos reales.
	 */
	@Test
	public void testdividision2realescero() {
		double resultado = Division.dividision2reales(1.2, 0);
		double esperado = 0;

		assertEquals(esperado, resultado);
	}
	@Test
	public void testdividision2reales() {
		double resultado = Division.dividision2reales(1.2,2);
		double esperado = 0.6;

				assertEquals(esperado, resultado);
	}
	@Test
	public void testdividision2realesnegativos() {
		double resultado = Division.dividision2reales(-1.4,2);
		double esperado = -0.7;

				assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que el m�todo division2enteros, en efecto, divide dos enteros.
	 */
	@Test
	public void testdivision2enteros() {
		double resultado = Division.division2enteros(6, 3);
		double esperado = 2;

		assertEquals(esperado, resultado);
	}
	@Test
	public void testdivision2enteroscero() {
		double resultado = Division.division2enteros(6, 0);
		double esperado = 0;

		assertEquals(esperado, resultado);
	}
	@Test
	public void testdivision2enterosnegativos() {
		double resultado = Division.division2enteros(6, -3);
		double esperado = -2;

		assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que el m�todo inversoreal, en efecto, realiza la operaci�n.
	 */
	@Test
	public void testinversoreal() {
		double resultado = Division.inversoreal(10);
		double esperado = 0.1;

		assertEquals(esperado, resultado);
	}
	@Test
	public void testinversorealnegativo() {
		double resultado = Division.inversoreal(-10);
		double esperado = -0.1;

		assertEquals(esperado, resultado);
	}
	@Test
	public void testinversorealcero() {
		double resultado = Division.inversoreal(0);
		double esperado = 0;

		assertEquals(esperado, resultado);
	}
	@Test
	public void testraizreal() {
		double resultado = Division.raizreal(4);
		double esperado = 2;

		assertEquals(esperado, resultado);
	}

}
