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
	 * Comprobamos que el m�todo division2reales, en efecto, divide dos reales.
	 */
	@Test
	public void testdividision2reales() {
		double resultado = Division.dividision2reales(1.2, 2);
		double esperado = 0.6;

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

	/**
	 * Comprobamos que el m�todo inversoreal, en efecto, realiza la operaci�n.
	 */
	@Test
	public void testinversoreal() {
		double resultado = Division.inversoreal(10);
		double esperado = 0.1;

		assertEquals(esperado, resultado);
	}
	/**
	 * El test comprueba que los m�todos lancen una excepci�n al dividir entre cero.
	 */
	@Test
	public void testdivisionentrecero() {
		Exception exception1 = assertThrows(ArithmeticException.class, () -> {
			Division.division2reales(1, 0);
		});
		String expectedMessage = "/ by zero";
		String actualMessage1 = exception.getMessage();

		Exception exception2 = assertThrows(ArithmeticException.class, () -> {
			Division.division2enteros(3, 0);
		});
		String actualMessage2 = exception.getMessage();

		Exception exception3 = assertThrows(ArithmeticException.class, () -> {
			Division.inversoreal(0);
		});
		String actualMessage3 = exception.getMessage();
		assertTrue(actualMessage1.contains(expectedMessage));
		assertTrue(actualMessage2.contains(expectedMessage));
		assertTrue(actualMessage3.contains(expectedMessage));
	}

	/**
	 * Comprobamos que el m�todo raizreal, en efecto, realiza la operaci�n.
	 */
	@Test
	public void testraizreal() {
		double resultado = Division.raizreal(4);
		double esperado = 2;

		assertEquals(esperado, resultado);
	}

}
