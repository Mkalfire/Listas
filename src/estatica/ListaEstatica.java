package estatica;

import java.util.Arrays;

/**
 * 
 * @author malfire
 *
 * @param <T> Gen�rico.
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
	 * M�todo que comprueba si la Lista est� vac�a o no.
	 * @return: True si est� vac�a, False si no.
	 */
	public boolean isVacia() {
		if(numElements==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	/**
	 * M�todo que vacia la lista.
	 */
	public void Vaciar() {
		numElements=0;
	}
	
	/**
	 * M�todo que retorna la cantidad de elementos que hay en la lista.
	 * @return: numElements.
	 */
	public int longitud() {
		return numElements;
	}
	/**
	 * M�todo que dado una posici�n y un elemento, lo inserta en la lista.
	 * @param pos: Posici�n del elemento.
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
	 * M�todo que crea un nuevo Array con el doble de longitud que el Array creado en el constructor.
	 */
	private void extender() {

		T[] aux= (T[]) new Object[vector.length*2];
		
		for(int i=0; i<vector.length; i++) {
			aux[i]=vector[i];
		}
		vector=aux;
	}
	
	/**
	 * M�todo que retorna un elemento de tipo T dada una  posici�n.
	 * @param pos: Posici�n del elemento.
	 * @return: Elemento de tipo T.
	 */
	public T consultar(int pos) {
		return vector[pos-1];
	}
	/**
	 * M�todo que dado una posici�n y un elemento, este se inserta en esa posici�n aunque ya este ocupado por otro elemento, actuando como "Modificador".
	 * @param pos:Posici�n del elemento.
	 * @param element: Elemento de tipo T.
	 */
	public void modificar(int pos, T element) {
		
		this.vector[pos-1]=element;
	}
	
	/**
	 * M�todo que comprueba si un elemento que se le pasa existe en la lista o no.
	 * @param Element: Elemento de tipo T.
	 * @return: True si el elemento que se le pasa est� en la lista, False si no.
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
	 * M�todo que elimina un elemento de la lista dado la posici�n del mismo.
	 * @param pos: Posici�n del elemento.
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