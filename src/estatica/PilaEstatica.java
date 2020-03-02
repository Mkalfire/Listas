package estatica;

import java.util.Arrays;

/**
 * 
 * @author malfire
 *
 * @param <T> tipo genérico.
 */

public class PilaEstatica<T> {	
	
	private T[] contenedor;
	private int numElements;
	

	/**
	 * Constructor que genera una pila de objetos de tipo T con 4 huecos.	
	 */
	public PilaEstatica() {
		
		contenedor = (T[]) new Object[4];
		numElements=0;
	}
	/**
	 * Constructor que crea una Array con la misma longitud y los mismos elementos del Array que se le pasa.
	 * 
	 * @param pila: Array que se le pasa al método.
	 */
	
	public PilaEstatica(PilaEstatica <T> pila) {
		
		contenedor=(T[]) new Object[pila.contenedor.length];
		for(int i=0; i<contenedor.length; i++) {
			contenedor[i]= pila.contenedor[i];
					
		}
		numElements= pila.numElements;
		
	}
	
	/**
	 * Método que comprueba si la Pila está vacia o no.
	 * @return: true si la pila está vacía, false si no.
	 * 
	 */
	
	public boolean Vacia() {
		
	if(numElements==0) {
		return true;
	}else {
		return false;
	}
		
	}
	
	/**
	 * Método que inserta un elemento en la pila. Comprabando si está llena o no.
	 * @param element: elemento de tipo genérico.
	 */
	
	public void insertar(T element) { 
		
		if(numElements==contenedor.length) {
			extender();
			contenedor[numElements]=element;
			numElements++;
		}else {
			contenedor[numElements]=element;
			numElements++;
		}
		
		
	}
	
	/**
	 * Método que crea un nuevo Array con el doble de longitud que el vector creado en el constructor.
	 */
	private void extender() {
		 
		T[] aux= (T[]) new Object[contenedor.length*2];
		 
		for(int i=0; i<contenedor.length; i++) {
			
			aux[i]= contenedor[i];
		}
		contenedor = aux;
	}
	
	/**
	 * Método que extrae el último elemento de la Pila.
	 * @return: Elemento de tipo genérico.
	 */
	public T extraer() {
		
		numElements--;
		return contenedor[numElements]=null; 
		
	}
	/**
	 * Método que devuelve el número de Elementos que hay en la pila. 
	 * @return: El número de elementos que la variable numElements almacena;
	 */
	 public int numElements(){
		 return numElements;
	}
	 
	 /**
	  * Método que vacia la pila.
	  */
	 public void Vaciar() {
		 /*
		 for(int i =0; i<contenedor.length-1; i++) {
			 contenedor[i]=null;
			 
		 }
		 */
		 numElements=0;
	 }
	 /**
	  * Método que retorna el ultimo elemento de la pila , pero no lo extrae.
	  * @return: Elemento de tipo genérico.
	  */
	  public T cima() {
		  return contenedor[numElements-1];
	  }
	@Override
	public String toString() {
		return " PILA=" + Arrays.toString(contenedor);
	}
	 
	
	 

	
}
