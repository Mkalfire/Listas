package dinamica;

public class PilaDinamica <T>{

	private class Nodo{
		private T elemento;
		private Nodo siguiente;
		
		/**
		 * Constructor que crea un Nodo con su elemento y puntero.
		 * @param elemento: Elemento de tipo genérico.
		 * @param siguiente: Puntero.
		 */
		public Nodo(T elemento, Nodo siguiente) {
			this.elemento=elemento;
			this.siguiente=siguiente;
		}
	}
	private Nodo ultimo;//siempre 
	private int tamaño;
	
	/**
	 * Constructor con la pila vacia.
	 */
	public PilaDinamica() {
		ultimo=null;
		tamaño=0;
	}
	/**
	 * Método que comprueba si la pila está vacía o no.
	 * @return: True si está vacía, false si no.
	 */
	public boolean Vacia() {
		
		if(ultimo==null) {
			return true;
		}else {
			return false;
		}
		/* Es lo mismo
	if(tamaño==0) {
		return true;
	}else {
		return false;
	}
	*/
	}
	/**
	 * Método que retorna la longitud de la lista.
	 * @return: int.
	 */
	public int longitud() {
		return tamaño;
	}
	
	/**
	 * Método que retorna el último Elemento de tipo genérico.
	 * @return: Elemento de tipo genérico.
	 */
	public T ultimo() {
		return ultimo.elemento;
	}
	/**
	 * Método que inserta un elemento de tipo genérico en la Pila.
	 * @param element: Elemento de tipo genérico.
	 */
	public void insertar(T element) {
		Nodo aux= new Nodo(element,ultimo);
		ultimo=aux;
		tamaño++;
	}
	/**
	 * Método que extrae el último elemento de la Pila.
	 * @return: Último elemento de la Pila de tipo genérico.
	 * @throws Exception :La pila está vacía.
	 */
	public T extraer() throws Exception {
	if(Vacia()) {
		throw new Exception("La pila está vacía");
	}else {
		T element=ultimo.elemento;
		ultimo=ultimo.siguiente;
		tamaño--;
		return element;
	}
		
	}
	/**
	 * Método que vacía la Pila.
	 */
	public void vaciar() {
		tamaño=0;
		
	}
	
	
	 /**
	  * Método para imprimir los elementos de la Pila.
	  * @return: String(los elementos).
	  */
	public String toString() {
		
		String texto="";
		Nodo aux= ultimo;
		while(aux!=null) {
			texto+="\n"+aux.elemento;
			aux=aux.siguiente;
			
		}
		return texto;
		
	}
	
	
	
	
	
	
	
	
	
}
