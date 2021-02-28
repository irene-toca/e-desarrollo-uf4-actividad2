package tests;

/**
 * @autor Félix Cartón
 */
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import operaciones.Division;

public class DivisionTest {

	/**
	 * Comprobamos que el método diviDIsion2reales, en efecto, diDIvide dos reales.
	 */
	
	@Test
	public void testdividision2reales() {
		double resultado = Division.dividision2reales(1.2,2);
		double esperado = 0.6;

				assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que al dividir entre cero, se retorna cero.
	 */
	@Test
	public void testdividision2realescero() {
		double resultado = Division.dividision2reales(1.2, 0);
		double esperado = 0;

		assertEquals(esperado, resultado);
	}	
	/**
	 * Comprobamos que divide números negativos.
	 */
	@Test
	public void testdividision2realesnegativos() {
		double resultado = Division.dividision2reales(-1.4,2);
		double esperado = -0.7;

				assertEquals(esperado, resultado);
	}
	
	/**
	 * Comprobamos que el método division2enteros, en efecto, divide dos enteros.
	 */
	@Test
	public void testdivision2enteros() {
		double resultado = Division.division2enteros(6, 3);
		double esperado = 2;

		assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que al dividir entre cero, se retorna cero.
	 */
	@Test
	public void testdivision2enteroscero() {
		double resultado = Division.division2enteros(6, 0);
		double esperado = 0;

		assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que divide negativos.
	 */
	@Test
	public void testdivision2enterosnegativos() {
		double resultado = Division.division2enteros(6, -3);
		double esperado = -2;

		assertEquals(esperado, resultado);
	}
	
	/**
	 * Comprobamos que el método inversoreal, en efecto, realiza la operación.
	 */
	@Test
	public void testinversoreal() {
		double resultado = Division.inversoreal(10);
		double esperado = 0.1;

		assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que al hacer el inverso de un número negativo, se retorna un número negativo.
	 */
	@Test
	public void testinversorealnegativo() {
		double resultado = Division.inversoreal(-10);
		double esperado = -0.1;

		assertEquals(esperado, resultado);
	}
	/*
	 * Comprobamos que al hacer el inverso de cero, se retorna cero.
	 */
	@Test
	public void testinversorealcero() {
		double resultado = Division.inversoreal(0);
		double esperado = 0;

		assertEquals(esperado, resultado);
	}
	/**
	 * Comprobamos que realiza la operación raíz cuadrada.
	 */
	@Test
	public void testraizreal() {
		double resultado = Division.raizreal(4);
		double esperado = 2;

		assertEquals(esperado, resultado);
	}
	//Código obsoleto. Se modificó división para controlar la excepción de dividir por cero retornando cero.
//	/**
//     * El test comprueba que los métodos lancen una excepción al dividir entre cero.
//     */
//    @Test
//    public void testdivisionentrecero() {
//        Exception exception1 = assertThrows(ArithmeticException.class, () -> {
//            Division.division2reales(1, 0);
//        });
//        String expectedMessage = "/ by zero";
//        String actualMessage1 = exception.getMessage();
//
//        Exception exception2 = assertThrows(ArithmeticException.class, () -> {
//            Division.division2enteros(3, 0);
//        });
//        String actualMessage2 = exception.getMessage();
//
//        Exception exception3 = assertThrows(ArithmeticException.class, () -> {
//            Division.inversoreal(0);
//        });
//        String actualMessage3 = exception.getMessage();
//        assertTrue(actualMessage1.contains(expectedMessage));
//        assertTrue(actualMessage2.contains(expectedMessage));
//        assertTrue(actualMessage3.contains(expectedMessage));
//    }

}
