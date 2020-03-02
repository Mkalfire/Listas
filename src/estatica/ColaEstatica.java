package estatica;

import java.util.Arrays;

/**
 * 
 * @author malfire
 *
 * @param <T>: Tipo Gen�rico.
 */

public class ColaEstatica <T> {
	
	private T[] vector;
	private int numElements;
	private int primero;
	private int ultimo;
	
	/**
	 * Constructor que genera una Cola vacia de objetos de tipo T con 4 huecos.
	 */
	public ColaEstatica() {
		
		vector=  (T[]) new Object[4];
		numElements=0;
		primero=0;
		ultimo=0;
	}
	
	/**
	 * Constructor que genera un Array con la misma longitud y los mismos elementos de la variable Cola.
	 * @param Cola: Array que se le pasa al m�todo.
	 */
	
	public ColaEstatica(ColaEstatica <T> Cola) {
		
		vector= (T[]) new Object[Cola.vector.length];
		
		for(int i=0; i<vector.length; i++) {
			vector[i]= Cola.vector[i];
		}
		numElements=Cola.numElements;	
		primero=Cola.primero;
		ultimo=Cola.ultimo;
		
	}
	/**
	 * M�todo que comprueba si la Cola est� vac�a o no.
	 * @return: True si la cola est� vac�a y False si no.
	 */
	public boolean Vacia() {
		if(numElements==0) {
			return true;
		}else {
			return false;
		}
	}
	 
	/**
	 * M�todo que inserta un elemento en la cola. Comprobando si est� llena o no.
	 * @param element: Elemento de tipo T.
	 */
	public void insertar(T element) {
		
		if(numElements==vector.length) {
			extender();
			vector[numElements]=element;
			numElements++;
	
			
		}else {
			vector[numElements]=element;
			numElements++;
		}
		
	}
	/**
	 * M�todo que crea un nuevo Array con el doble de posiciones que el Array creado en el constructor.
	 */
	private void extender() {
		
		T[] aux = (T[]) new Object[vector.length*2];
		 
		for(int i=0; i<vector.length;i++) {
			
			aux[i]=vector[i];
		}
		vector=aux;	
	}
	
	
	/**
	 * M�todo que vacia la cola.
	 */
	public void vaciar() {
		numElements=0;
		primero=0;
		ultimo=0;
	}

	public void extraer() throws Exception {
	
		if(numElements>0) {

			for(int i=0; i<vector.length-1; i++) {
				vector[i]=vector[i+1];
			}
			
			numElements--;
			
		}else {
			throw new Exception("la cola est� vac�a");
		}
	}
	/**
	 * M�todo que retorna el primero elemento de la Cola.
	 * @return: Elemento de tipo gen�rico.
	 */
	public T primero() {
		return vector[primero];
	}
	/**
	 * M�todo que retornar el n�mero de elementos que hay en la pila.
	 * @return: El n�mero de elementos que la variable numElements almacena.
	 */
	public int numElements() {
		return numElements;
	}
	

	@Override
	public String toString() {
		return "COLA=" + Arrays.toString(vector) ;
	}
	
	

	
	
	
}
