package dinamica;


public class ColaDinamica<T>{
	
	private class Nodo{
		private T element;
		private Nodo siguiente;
		
		/**
		 * Constructor que crea un Nodo con su elemento y su puntero. 
		 * @param element
		 * @param siguiente
		 */
		public Nodo(T element, Nodo siguiente) {
			this.element=element;
			this.siguiente=siguiente;

		}

		public T getElement() {
			return element;
		}

		public void setElement(T element) {
			this.element = element;
		}

		public Nodo getSiguiente() {
			return siguiente;
		}

		public void setSiguiente(Nodo siguiente) {
			this.siguiente = siguiente;
		}

		
		
	}
	
	
	private Nodo primero;
	private Nodo ultimo;
	
	
	private int tamaño;
	/**
	 * Constructor con la Cola vacia
	 */
	public ColaDinamica() {
		primero=null;
		ultimo=null;
		tamaño=0;
	}
	/**
	 * Método que comprueba si la Cola está vacía o no.
	 * @return: True si está vacía, false si no.
	 */
	public boolean isVacia() {
		
		if(primero==null) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Método que devuelve el numero de elementos que hay en la pila.
	 * @return: int.
	 */
	public int longitud() {
		int cont=0;
		Nodo aux=primero;
		while(aux!=null) {
			aux=aux.siguiente;
			cont++;
		}
		return cont;
	}
	
	/**
	 * Método que retorna el primer elemento de la Cola.
	 * @return: Elemento de tipo genérico.
	 */
	public T primero() {
	
		return primero.element;
	}
	/**
	 * Método que vacia la cola.
	 */
	public void vaciar() {
		primero=null;
	}
	/**
	 * Método que inserta un elemento de tipo genérico en la Cola.
	 * @param element: Elemento de tipo genérico.
	 */
	public void insertar(T element) {
		
	Nodo aux= new Nodo(element, null);

	if(isVacia()) {
		primero=aux;
		ultimo=aux;
	}else {
		if(longitud()==1) {
			primero.setSiguiente(aux);
			ultimo=aux;
			
		}else {
			ultimo.setSiguiente(aux);
			ultimo=aux;
		}
	
	}
	tamaño++;
		
		
		
	}
	/**
	 * Método que extrae un elemento de la Cola.
	 * @throws Exception : la cola está vacía
	 */
	public void extraer() throws Exception {
		
	if(isVacia()) {
		throw new Exception("la cola está vacía");
	}else {
		Nodo aux= primero.siguiente;
		primero=null;
		primero=aux;
		tamaño--;
	
	}
		
	}
	
	public String toString() {
		
		String texto="";
		Nodo aux= primero;
		while(aux!=null) {
			texto+="\n"+aux.element;
			aux=aux.siguiente;
			
		}
		return texto;
		
	}
	
	
	
	
	
	
	

}
