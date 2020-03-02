package dinamica;

public class PilaDinamica <T>{

	private class Nodo{
		private T elemento;
		private Nodo siguiente;
		
		/**
		 * Constructor que crea un Nodo con su elemento y puntero.
		 * @param elemento: Elemento de tipo gen�rico.
		 * @param siguiente: Puntero.
		 */
		public Nodo(T elemento, Nodo siguiente) {
			this.elemento=elemento;
			this.siguiente=siguiente;
		}
	}
	private Nodo ultimo;//siempre 
	private int tama�o;
	
	/**
	 * Constructor con la pila vacia.
	 */
	public PilaDinamica() {
		ultimo=null;
		tama�o=0;
	}
	/**
	 * M�todo que comprueba si la pila est� vac�a o no.
	 * @return: True si est� vac�a, false si no.
	 */
	public boolean Vacia() {
		
		if(ultimo==null) {
			return true;
		}else {
			return false;
		}
		/* Es lo mismo
	if(tama�o==0) {
		return true;
	}else {
		return false;
	}
	*/
	}
	/**
	 * M�todo que retorna la longitud de la lista.
	 * @return: int.
	 */
	public int longitud() {
		return tama�o;
	}
	
	/**
	 * M�todo que retorna el �ltimo Elemento de tipo gen�rico.
	 * @return: Elemento de tipo gen�rico.
	 */
	public T ultimo() {
		return ultimo.elemento;
	}
	/**
	 * M�todo que inserta un elemento de tipo gen�rico en la Pila.
	 * @param element: Elemento de tipo gen�rico.
	 */
	public void insertar(T element) {
		Nodo aux= new Nodo(element,ultimo);
		ultimo=aux;
		tama�o++;
	}
	/**
	 * M�todo que extrae el �ltimo elemento de la Pila.
	 * @return: �ltimo elemento de la Pila de tipo gen�rico.
	 * @throws Exception :La pila est� vac�a.
	 */
	public T extraer() throws Exception {
	if(Vacia()) {
		throw new Exception("La pila est� vac�a");
	}else {
		T element=ultimo.elemento;
		ultimo=ultimo.siguiente;
		tama�o--;
		return element;
	}
		
	}
	/**
	 * M�todo que vac�a la Pila.
	 */
	public void vaciar() {
		tama�o=0;
		
	}
	
	
	 /**
	  * M�todo para imprimir los elementos de la Pila.
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
