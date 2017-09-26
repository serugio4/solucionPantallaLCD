package pruebas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import interfaz.*;
import modelo.*;

/**
 * Debido a que la mayoría de errores se pueden presentar en el ingreso de datos por parte del usuario
 * las pruebas unitarias se concentran en el método encargado de recibir y validar que los paramétros 
 * ingresados satisfagan las condiciones planteadas para el ejercicio.
 * 
 * @author serug
 * @version 1.0
 * 
 */
public class PruebaUnitaria {

	ProcesarCadena proc;
	Numero num;
	
	@Before
	public void inicializarVariables() {
		proc = new ProcesarCadena();
		num = new Numero();
		
	}
	
	
	  
	  
	  
	 
	
	@Test
	public void testProcesarCadenaSinComa() {
		
		try {
			proc.recibirCadena("00");
			fail("se esperaba un IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			
		}	
	}
	
	@Test
	public void testProcesarCadenaNoNumerica() {
		
		try {
			proc.recibirCadena("1,b");
			fail("se esperaba un NumberFormatException");
		} catch (NumberFormatException e) {
			
		}	
	}
	
	@Test
	public void testProcesarCadenaNumeroNegativo() {
		
		try {
			proc.recibirCadena("-1,-1");
			fail("se esperaba un NumberFormatException");
		} catch (NumberFormatException e) {
			
		}	
	}
	
	@Test
	public void testProcesarCadenaMasArgumentos() {
		
		try {
			proc.recibirCadena("-1,1,11");
			fail("se esperaba un IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			
		}	
	}
	
	@Test
	public void testProcesarCadenaNumeroReal() {
		
		try {
			proc.recibirCadena("2.1,11.5");
			fail("se esperaba un NumberFormatException");
		} catch (NumberFormatException e) {
			
		}	
	}
	
	@Test
	public void testProcesarCadenaTamañoMuyGrande() {
		
		try {
			proc.recibirCadena("10,12349999999999999999999999999999999999999999999999999999999999999999999999999");
			fail("se esperaba un NumberFormatException");
		} catch (NumberFormatException e) {
			
		}	
	}
	
	@Test
	public void testProcesarCadenaTamañoMuyGrandeLimiteDeUnInt() {
		
		String[] arrayEsperado = {"5", "2147483647"};
		
		assertArrayEquals(arrayEsperado, proc.recibirCadena("5,2147483647"));
			
		
		
	}
	
	@Test
	public void testProcesarCadenaTamañoMuyGrandeLimiteDeUnIntMasUno() {
		
		try {
			proc.recibirCadena("10,2147483648");
			fail("se esperaba un NumberFormatException");
		} catch (NumberFormatException e) {
			
		}	
		
		
	}
	
	
}
