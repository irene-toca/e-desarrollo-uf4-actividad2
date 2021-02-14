package operaciones;

import java.util.Scanner;

/**
 * Esta clase definir� las operaciones relacionadas con la resta
 *
 * @author rober
 ** @version 1.0
 * @since 13-02-2021 .
 */
public class Principal {

	/**
	 * 
	 * @param args - Clase principal que ir� llamando a las demas para realizar
	 *             operaciones
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("�Que tipo de operacion quieres realizar? Introduce suma, resta, multiplicacion o division");
		
		//Entrada por teclado. Obligamos a que la palabra se vaya a minisculas
		String operacion = entrada.nextLine().toLowerCase();
		
		
		//Menu operacion para seleccionar segun lo teclado
		switch (operacion) {

		case "suma":
			System.out.println("es la suma");



      
			break;
			
			//Opciones de resta
		case "resta":
			System.out.println("Operacion Resta");
			System.out.println("Pulse 1 para restar dos numeros reales");
			System.out.println("Pulse 2 para restar dos numeros enteros");
			System.out.println("Pulse 3 para restar tres numeros reales");
			System.out.println("Pulse 4 para ir restando numeros hasta llegar a 0 o inferior");
			
			
			
			//Entrada por teclado
			int operacionResta = entrada.nextInt();
			
			//Otro menu para seleccionar las operaciones de la resta
			switch (operacionResta) {
			
			//Pasamos dos variables y llamamos al metodo resta2Reales de clase Resta
			
			case 1:
				System.out.println("Introduzca primer digito");
				double num1Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num2Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Resta.resta2Reales(num1Real, num2Real));
				break;
			//Pasamos dos variables y llamamos al metodo resta2Enteros de clase Resta
				
			case 2:
				System.out.println("Introduzca primer digito");
				int num1Entero = entrada.nextInt();
				System.out.println("Introduzca segundo digito");
				int num2Entero = entrada.nextInt();
				System.out.println("El resultado es: " + Resta.resta2Enteros(num1Entero, num2Entero));
				break;
				
			//Pasamos tres variables y llamamos al metodo resta3Reales de clase Resta
			case 3:
				System.out.println("Introduzca primer digito");
				double num3Real = entrada.nextDouble();
				System.out.println("Introduzca segundo digito");
				double num4Real = entrada.nextDouble();
				System.out.println("Introduzca tercer digito");
				double num5Real = entrada.nextDouble();
				System.out.println("El resultado es: " + Resta.resta3Reales(num3Real, num4Real, num5Real));
				break;
				
			//Llamamos directamente a restaAcumulado de clase Resta donde realizaremos las operaciones
			case 4:

				Resta.restaAcumulado();

				break;

			}

			break;
		case "multiplicacion":
			System.out.println("es la multiplicacion");
			break;
		case "division":
			System.out.println("es la division");
			break;

		default:
			System.out.println("La operacion introducida no es valida");
		}

	}

}
