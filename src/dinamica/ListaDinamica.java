package dinamica;



public class ListaDinamica <T>{
	private class Nodo{
		T elemento;
		Nodo siguiente;
	
		Nodo(T element, Nodo siguiente){
			
			this.elemento=element;
			this.siguiente=siguiente;
		}
	}
	private Nodo primero;

	/**
	 * Constructor que crea una lista vacia.
	 */
	public ListaDinamica() {
		
		this.primero = null;
	
	}
	/**
	 * Constructor que recibe una lista.
	 * @param Lista: lista que recibe.
	 */
	public ListaDinamica(ListaDinamica <T> Lista) {
		
	}
	/**
	 * Método que devuleve la longitud de la lista.
	 * @return: int.
	 */
	public int longitud() {
		int pos=0;//contador para contar la longitud de la lista
		Nodo aux= this.primero;//creamos un nodo auxiliar para guardar el primero de la lista
		while(aux!=null) {//avanza hasta que el siguiente sea null, fin de la lista.
			pos++;
			aux=aux.siguiente;
		}
		return pos;
	}
	/**
	 * Método que comprueba si la lista está vacía o no.
	 * @return: True si la lista está vacía, false si no.
	 */
	public boolean isVacia() {
		
		if(primero==null) {
			return true;
			
		}else {
			return false;
		}
	}
	public void vaciar() {
		primero=null;
	}
	/**
	 * Método que inserta un elemento de tipo genérico dada su posición y su elemento.
	 *@param elemento: Elemento de tipo genérico.
     *@param pos: Posición del elemento.
	 */
	public void insertar(T elemento,int pos) {
		
		if(pos==1) {
			primero=new Nodo(elemento,primero);
		}else {
			Nodo aux =this.primero;
			for(int i=1; i<pos-1;i++) {
				aux=aux.siguiente;
			}
		aux.siguiente= new Nodo(elemento,aux.siguiente);
		}

	}
	/**
	 * Método que retorna el elemento de la posición que le des.
	 * @param pos: posición del elemento de tipo genérico.
	 * @return: elemento.
	 */
	public T consultar(int pos) {
		
		Nodo aux= primero;
		for(int i=0; i<pos-1; i++) {
			aux=aux.siguiente;
			
		}return aux.elemento;
	}
	/**
	 * Método que busca el la lista el elemento que le pases y te devuelve su posición.
	 * @param element: elemento que hay que buscar.
	 * @return: posición del elemento.
	 */
	public int buscar(T element) {
		Nodo aux= primero;
		int pos=1;
		while(aux!=null && !aux.elemento.equals(element)  ) {
			aux=aux.siguiente;
			pos++;
		}
		if(aux==null) {
			pos=0;
		}
		return pos;
	}
	/**
	 * Método que borra un elemento de la lista dada su posicón.
	 * @param pos: posición del elemento.
	 */
	public void delete(int pos) {
		if(pos==1) {
			primero=primero.siguiente;
		}else {
			Nodo aux= primero;
			for(int i =1; i<pos-1; i++) {
				aux=aux.siguiente;
			}
		aux=aux.siguiente.siguiente;
		}
	}
	/**
	 * Método que cambia un elemento por otro.
	 * @param element: elemento que sustituirá al otro elemento
	 * @param pos: posición del elemento que va a ser modificado.
	 */
	public void moficar( T element,int pos) {
		Nodo aux= primero;
		for(int i=0; i<pos-1; i++) {
			aux=aux.siguiente;
		
		}
		aux.elemento=element;
		
	}
	/**
	 * Método que imprime los elementos de la lista.
	 */
	public String toString() {

		String texto="";
		Nodo aux= primero;
		while(aux!=null) {
			texto+="\n"+aux.elemento;
			aux=aux.siguiente;
			
		}
		return texto;
	}
	
	
	
	

}
