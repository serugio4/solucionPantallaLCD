package modelo;

/**
 * 
 * @author sergio Garcia
 *@version 1.0
 */
public class Numero {
	
	
	private final String CARACTER_HORIZONTAL = "-";
	private final String CARACTER_VERTICAL = "|";
	private int cantFil;
	private int cantCol;
	private int size;

	
	
/**
 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
 * @param posX 
 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
 * @param posY
 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
 * @param posXIni
 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
 * @param posIniY
 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
 * @return posActual
 * 				El valor para formar el n�mero uno en la coordenada especificada 	
 */
	public String hacerNumUno(int posX , int posY, int posXIni, int posIniY) {
		
		String posActual="";
		
		if (posX == posXIni+size && posY!=0 )  {
			posActual = CARACTER_VERTICAL;
		}

		else {
			posActual=" ";
		}
		return posActual;

	}

	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero dos en la coordenada especificada 	
	 */
	public String hacerNumDos(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if ( (posY==0 && posX!=posXIni && posX <posXIni+size+2-1)|| 
			(posY==cantFil/2 && posX!=posXIni && posX <posXIni+size+2-1)|| 
			(posY==cantFil-1 &&posX!=posXIni && posX <posXIni+size+2-1)) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if((posX ==posXIni+size+2-1 && posY>0 && posY<(cantFil/2)) || posX==posXIni && posY>cantFil/2 && posY<cantFil-1 ) {
			
			posActual= CARACTER_VERTICAL;
		}
		
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero tres en la coordenada especificada 	
	 */
	public String hacerNumTres(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if ((posY == 0 && posX <posXIni+size)|| (posY==cantFil/2 && posX <posXIni+size) ||
				(posY==cantFil-1 && posX <posXIni+size)) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if((posX == posXIni+size && posY>0 && posY<(cantFil/2)) || posX == posXIni+size && posY>cantFil/2 && posY<cantFil-1 ) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero cuatro en la coordenada especificada 	
	 */
	public String hacerNumCuatro(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if (posY == cantFil/2 && posX > posXIni && posX < posXIni+size+1){
			posActual = CARACTER_HORIZONTAL;
		}
		else if((posY<cantFil/2 && posX==posXIni || posX==posXIni+size+1) || posY>cantFil/2 && posX== posXIni+size+1) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero cinco en la coordenada especificada 	
	 */
	public String hacerNumCinco(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if ((posY == 0 && posX > posXIni)|| (posY==cantFil/2 && posX > posXIni && posX < posXIni+size+1) ||
				(posY==cantFil-1 && posX < posXIni+size+1)) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if((posX==posXIni && posY<(cantFil/2) && posY>0) || posX==posXIni+size+1 && posY>cantFil/2 && posY<cantFil-1 ) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero seis en la coordenada especificada 	
	 */
	public String hacerNumSeis(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if ((posY == 0 && posX > posXIni && posX<posXIni+size+1)|| 
				(posY==cantFil/2 && posX > posXIni && posX < posXIni+size+1) || 
				(posY==cantFil-1 && posX <posXIni+size+1 && posX>posXIni)) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if((posX==posXIni && posY<(cantFil/2) && posY>0) || (posY >cantFil/2 && 
				(posX==posXIni || posX==posXIni+size+1  ) && posY<cantFil-1)) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}

	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero siete en la coordenada especificada 	
	 */
	public String hacerNumSiete(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if (posX == posXIni+size+1 && posY>0 ) {
			posActual = CARACTER_VERTICAL;
		}
		else if(posY==0 && posX<posXIni+size+1) {
			posActual = CARACTER_HORIZONTAL;
		}

		else {
			posActual=" ";
		}
		return posActual;

	}
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero ocho en la coordenada especificada 	
	 */
	public String hacerNumOcho(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if (((posX>posXIni && posX<posXIni+size+1) && posY==0) || ((posX>posXIni && posX<posXIni+size+1) && posY==cantFil/2)
				|| ((posX>posXIni && posX<posXIni+size+1) && posY==cantFil-1)) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if((posY!=0 && posY != cantFil/2 && posY!=cantFil-1) && (posX==posXIni || posX==posXIni+size+1) ) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero nueve en la coordenada especificada 	
	 */
	public String hacerNumNueve(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if (((posX>posXIni && posX<posXIni+size+1) && posY==0) || ((posX>posXIni && posX<posXIni+size+1) && posY==cantFil/2)
				|| ((posX>posXIni && posX<posXIni+size+1) && posY==cantFil-1)) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if(((posY!=0 && posY < cantFil/2) && (posX==posXIni || posX==posXIni+size+1)) ||
				(posY > cantFil/2 && posY <cantFil-1) && (posX==posXIni+size+1)) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	/**
	 *  Se debe llamar m�ltiples veces indic�ndole las coordenadas adecuadas para generar el n�mero completo 
	 * @param posX 
	 * 				indica la posici�n actual en la coordenada x que se usar� para guardar el caracter apropiado en la matriz
	 * @param posY
	 * 				indica la posici�n actual en la coordenada y que se usar� para guardar el caracter apropiado en la matriz
	 * @param posXIni
	 * 				indica la posici�n en la coordenada x en la cual inicia el n�mero
	 * @param posIniY
	 * 				indica la posici�n en la coordenada y en la cual inicia el n�mero
	 * @return posActual
	 * 				El valor para formar el n�mero cero en la coordenada especificada 	
	 */
	public String hacerNumCero(int posX , int posY, int posXIni, int posIniY) {

		String posActual="";

		if ( (posX>posXIni && posX < posXIni+size+2-1 && posY==0) || 
				(posX>posXIni && posX < posXIni+size+2-1 && posY==cantFil-1) ) {
			posActual = CARACTER_HORIZONTAL;
		}
		else if( (posX==posXIni && (posY>0 && posY<cantFil-1) || (posX==posXIni+size+2-1 && (posY>0 && posY<cantFil-1))) ) {
			
			posActual= CARACTER_VERTICAL;
		}
		else {
			posActual=" ";
		}
		
		return posActual;
		
		
	}
	
	/**
	 * 
	 * @return cantFil
	 * 					Cantidad total de filas de la matriz que almacena los n�meros para su impresi�n
	 * 			
	 */
	public int getCantFil() {
		return cantFil;
	}

	/**
	 * 
	 * @param cantFil
	 * 					Establece la cantidad de filas que tiene la matriz que almacena los n�meros
	 */
	public void setCantFil(int cantFil) {
		this.cantFil = cantFil;
	}

	/**
	 * 
	 * @return 
	 * 			Cantidad total de columnas de la matriz que almacena los n�meros para su impresi�n
	 */
	public int getCantCol() {
		return cantCol;
	}

	/**
	 * 
	 * @param cantCol
	 * 					Establece la cantidad de filas que tiene la matriz que almacena los n�meros
	 */
	public void setCantCol(int cantCol) {
		this.cantCol = cantCol;
	}
	
	/**
	 * 
	 * @return getSize
	 * 					Retorna el tama�o de los n�meros que se van a imprimir
	 */
	public int getSize() {
		return size;
	}

	/**
	 * 
	 * @param size 
	 * 				Establece el tama�o de los n�meros que se van a imprimir
	 */
	public void setSize(int size) {
		this.size = size;
	}
}


