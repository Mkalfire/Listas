package estatica;

import java.util.Arrays;

/**
 * 
 * @author malfire
 *
 * @param <T> Genérico.
 */

public class ListaEstatica <T>{
	
	private T[] vector;
	private int numElements;
	
	/**
	 * Constructor que crea un Array de objetos tipo T con 4 huecos.
	 */
	public ListaEstatica() {
		vector= (T[]) new Object[4];
		numElements=0;
	}
	/**
	 * Constructor que genera un Array con los mismo elementos y la misma longitud de el Array que se le pasa.
	 * @param Lista: Array que recibe el constructor.
	 */

	public ListaEstatica(ListaEstatica <T> Lista) {
		
		T[] aux=  (T[]) new Object[Lista.vector.length];
		for(int i=0; i<vector.length; i++) {
			aux[i]=Lista.vector[i];
			
		} 	
		numElements= Lista.numElements;
		
	}
	/**
	 * Método que comprueba si la Lista está vacía o no.
	 * @return: True si está vacía, False si no.
	 */
	public boolean isVacia() {
		if(numElements==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * Método que vacia la lista.
	 */
	public void Vaciar() {
		numElements=0;
	}
	
	/**
	 * Método que retorna la cantidad de elementos que hay en la lista.
	 * @return: numElements.
	 */
	public int longitud() {
		return numElements;
	}
	/**
	 * Método que dado una posición y un elemento, lo inserta en la lista.
	 * @param pos: Posición del elemento.
	 * @param element: Elemento de tipo T.
	 */
	
	public void insertar(int pos, T element) {
		
		if(numElements==vector.length) {
			extender();	
		}
		
		int posLibre=pos-1;
		for(int i=numElements; i>posLibre; i--) {
			
			vector[i]=vector[i-1];
		}
		vector[posLibre]=element;
		numElements++;
	}
	/**
	 * Método que crea un nuevo Array con el doble de longitud que el Array creado en el constructor.
	 */
	private void extender() {

		T[] aux= (T[]) new Object[vector.length*2];
		
		for(int i=0; i<vector.length; i++) {
			aux[i]=vector[i];
		}
		vector=aux;
	}
	
	/**
	 * Método que retorna un elemento de tipo T dada una  posición.
	 * @param pos: Posición del elemento.
	 * @return: Elemento de tipo T.
	 */
	public T consultar(int pos) {
		return vector[pos-1];
	}
	/**
	 * Método que dado una posición y un elemento, este se inserta en esa posición aunque ya este ocupado por otro elemento, actuando como "Modificador".
	 * @param pos:Posición del elemento.
	 * @param element: Elemento de tipo T.
	 */
	public void modificar(int pos, T element) {
		
		this.vector[pos-1]=element;
	}
	
	/**
	 * Método que comprueba si un elemento que se le pasa existe en la lista o no.
	 * @param Element: Elemento de tipo T.
	 * @return: True si el elemento que se le pasa está en la lista, False si no.
	 */
	public int buscar(T Element) {		
		int i=0;
		while( i<numElements && !vector[i].equals(Element)) {
			i++;
		}
		if(i==numElements) {
			return 0;	
		}else {
			return i+1;
		}
		
		
	}
	/**
	 * Método que elimina un elemento de la lista dado la posición del mismo.
	 * @param pos: Posición del elemento.
	 */
	public void borrrar(int pos) {
		for(int i=pos-1; i<numElements-1; i++) {
			vector[i]=vector[i+1];
			vector[i+1]=null;
		}
		numElements--;
		
	}
	@Override
	public String toString() {
		return "ListaEstatica" + Arrays.toString(vector);
	}
		
	
	
	
	

}