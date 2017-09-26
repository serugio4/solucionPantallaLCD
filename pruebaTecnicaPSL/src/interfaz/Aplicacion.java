package interfaz;

import java.util.Scanner;

import modelo.Numero;
import modelo.ProcesarCadena;

/**
 * Crea e inicializa los objetos para ejecutar la aplicación
 * 
 * 
 * @author Sergio Garcia
 * @version 1.0
 *
 */
public class Aplicacion {

	
	/**
	 *  Inicializa los objetos de las clases Numero y ProcesarCadena, además procede a la ejecución del programa
	 */
	public void empezarAplicacion() {
		
		Numero num = new Numero();
		ProcesarCadena proc = new ProcesarCadena();
		String cadenaTeclado;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Aplicación de impresión de números en formato pantalla LCD \n"
				+ "digite el primer valor (numero entre 1 y 9) para seleccionar el tamaño\n"
				+ "enseguida digite una ','\n"
				+ "posteriormente digite la cadena de números que desea imprimir \n"
				+ "Ejemplo: 1,3456\n"
				+ "digite 0,0 para salir" );
		cadenaTeclado = entrada.nextLine();
		
				
		while(!cadenaTeclado.equals("0,0")) {
			
			proc.imprimirCadenaDeNumeros(proc.recibirCadena(cadenaTeclado));
		System.out.println("Aplicación de impresión de números en formato pantalla LCD \n"
				+ "digite el primer valor (numero entre 1 y 9) para seleccionar el tamaño\n"
				+ "enseguida digite una ','\n"
				+ "posteriormente digite la cadena de números que desea imprimir \n"
				+ "Ejemplo: 1,3456\n"
				+ "digite 0,0 para salir" );
		
		
		cadenaTeclado = entrada.nextLine();
		
	}
	
		
	}
	
	/**
	 * Inicia la ejecución de la aplicación
	 * 
	 */
	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.empezarAplicacion();
	}
	
}
