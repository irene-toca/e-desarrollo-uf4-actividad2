package tests;

/**
 * @autor Rober
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import operaciones.Producto;


class ProductoTest {
	
	
	/**
	 * Un test para el metodo en que se multiplican dos numeros reales
	 */
	@Test
	public void testMultiplica2Reales() {
		double resultado= Producto.multiplica2reales(7.2, 8.2);
		double esperado= 59.04;
		
		assertEquals(esperado, resultado);
	}
	/**
	 * Un test para el metodo en que se multiplican dos numeros reales y uno de ellos es 0
	 */
	@Test
	public void testMultiplica2Reales0() {
		double resultado= Producto.multiplica2reales(7.2, 0);
		double esperado= 0;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Un test para el metodo en que se multiplican dos numeros enteros
	 */
	@Test
	public void testMultiplica2Enteros() {
		double resultado= Producto.multiplica2enteros(10, 10);
		double esperado= 100;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Un test para el metodo en que se multiplican dos numeros enteros y uno de ellos es 0
	 */
	@Test
	public void testMultiplica2Enteros0() {
		double resultado= Producto.multiplica2enteros(100, 0);
		double esperado= 0;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Un test para el metodo en que se multiplican tres numeros reales
	 */
	@Test
	public void testMultiplica3Reales() {
		double resultado= Producto.multiplica3reales(7.2, 8.2, 5.2);
		double esperado= 307.008;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Un test para el metodo en que se multiplican tres numeros reales y uno de ellos es 0
	 */
	@Test
	public void testMultiplica3Reales0() {
		double resultado= Producto.multiplica3reales(7.2, 0, 5.2);
		double esperado= 0;
		
		assertEquals(esperado, resultado);
	}
	
	/**
	 * Un test para el metodo en que se eleva un numero por otro
	 */
	@Test
	public void testPotencia() {
		double resultado=Producto.potencia(4, 2);
		double esperado=16.0;
		
		assertEquals(esperado,resultado);
	}
	
	/**
	 * Un test para el metodo en que se eleva un numero por 0
	 */
	@Test
	public void testPotencia1() {
		double resultado=Producto.potencia(4, 0);
		double esperado=1.0;
		
		assertEquals(esperado,resultado);
	}
	
	/**
	 * Un test para el metodo en que se eleva 0 por un numero
	 */
	@Test
	public void testPotencia0() {
		double resultado=Producto.potencia(0, 8);
		double esperado=0;
		
		assertEquals(esperado,resultado);
	}
	
	@Test
	@Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
	public void testTiempo() throws InterruptedException{
		
		
			double resultado= Producto.multiplica3reales(7.2, 0, 5.2);
			double esperado= 0;
			
			assertEquals(esperado, resultado);
		}
	

}
