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
	
	
	private int tama�o;
	/**
	 * Constructor con la Cola vacia
	 */
	public ColaDinamica() {
		primero=null;
		ultimo=null;
		tama�o=0;
	}
	/**
	 * M�todo que comprueba si la Cola est� vac�a o no.
	 * @return: True si est� vac�a, false si no.
	 */
	public boolean isVacia() {
		
		if(primero==null) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * M�todo que devuelve el numero de elementos que hay en la pila.
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
	 * M�todo que retorna el primer elemento de la Cola.
	 * @return: Elemento de tipo gen�rico.
	 */
	public T primero() {
	
		return primero.element;
	}
	/**
	 * M�todo que vacia la cola.
	 */
	public void vaciar() {
		primero=null;
	}
	/**
	 * M�todo que inserta un elemento de tipo gen�rico en la Cola.
	 * @param element: Elemento de tipo gen�rico.
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
	tama�o++;
		
		
		
	}
	/**
	 * M�todo que extrae un elemento de la Cola.
	 * @throws Exception : la cola est� vac�a
	 */
	public void extraer() throws Exception {
		
	if(isVacia()) {
		throw new Exception("la cola est� vac�a");
	}else {
		Nodo aux= primero.siguiente;
		primero=null;
		primero=aux;
		tama�o--;
	
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
