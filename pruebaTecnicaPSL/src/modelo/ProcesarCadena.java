package modelo;
import modelo.Numero;

/**
 * 
 * @author Sergio Garcia
 * @version 1.0
 *
 */
public class ProcesarCadena {
	
	Numero num = new Numero();
	
	
	/**
	 * 
	 * valida que las cadenas cumplan con el formato exigido
	 * 
	 * @param entrada
	 * 					cadena de texto ingresada por el usuario (debe tener la estructura
	 * 					numero del 1 al 9, cadena de numeros naturales ejemplo: 4,58677
	 * @return parametros
	 * 					 arreglo estático, en la posición[0], contiene el tamaño de la variable
	 * 											 posición[1], contiene la cadena de números a imprimir 
	 */
	public String[] recibirCadena(String entrada) {
		
		
		if(!entrada.contains(",")) {
			throw new IllegalArgumentException("se deben ingresar una ',' "); 	
		}
		
		String [] parametros = entrada.split(",");
		
		if(parametros.length>2) {
			throw new IllegalArgumentException("se deben ingresar máximo dos caracteres "); 	
		}
		
		
		if (!(esNumerico(parametros[0]) && esNumerico(parametros[1]))) {
			throw new NumberFormatException("los datos ingresados deben ser numéricos");
		}
		
		return parametros;

	}

	/**
	 * 
	 * @param cadena
	 * 				String que se verificará que su contenido sea numérico
	 * @return
	 * 				true -> si el contenido del parámetro es numérico
	 * 				false -> si el contenido del parámetro no es numérico 
	 */
	public boolean esNumerico(String cadena) {

		try {
			Integer.parseInt(cadena);
			

			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}


	/**
	 * guarda e imprime los números con el tamaño de los parámetos ingresados
	 * 
	 * @see modelo/ProcesarCadena.java.recibirCadena
	 * @param parametros
	 * 					arreglo estático, posición[0], contiene el tamaño de los números
	 * 								      posición[1], contiene la cadena de números a imprimir 
	 * 					
	 */
	public void imprimirCadenaDeNumeros(String[] parametros) {
		
		int size = Integer.parseInt(parametros[0]);
		String numero = parametros[1];
		int temp;
				
		num.setCantFil(size*2+3);
		
		//se calcula el ancho de la matriz de la linea, incluyendo los espacios en blanco entre caracteres
		num.setCantCol( ((size+2)*numero.length())+numero.length()-1);
		num.setSize(size);
		

		String [][] matrizNumero = new String[num.getCantFil()][num.getCantCol()];
		int posIniX=0;
		int posIniY=0;
		
		for (int i = 0; i < numero.length(); i++) {

			temp=Integer.parseInt(""+numero.charAt(i));

			switch (temp) {
			case 0:
				
				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumCero(k, j, posIniX, posIniY);
					
					}
				
				}
				posIniX = posIniX+size+2+1;
				posIniY=0;
				
				
				break;
				
			case 1:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumUno(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
			
			case 2:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumDos(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
			
			case 3:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumTres(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
				
			case 4:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumCuatro(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
			
			case 5:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumCinco(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
				
			case 6:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumSeis(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
			
			case 7:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumSiete(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
				
			case 8:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumOcho(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;
				
			case 9:

				for (int j = posIniY; j < posIniY+size*2+3; j++) {
					for (int k = posIniX; k < posIniX+size+2; k++) {
						matrizNumero[j][k] = num.hacerNumNueve(k, j, posIniX, posIniY);

					}

				}
				posIniX = posIniX+size+2+1;
				posIniY=0;


				break;


			default:
				break;
			}


		}
		
		for (int i = 0; i < matrizNumero.length; i++) {
			for (int j = 0; j < matrizNumero[0].length; j++) {
				
				if (matrizNumero[i][j]==null) {
					matrizNumero[i][j]=" ";
				}
				System.out.print(matrizNumero[i][j]);
			}
			System.out.println("");
		}

	}

}
