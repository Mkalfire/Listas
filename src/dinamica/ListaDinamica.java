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
	 * M�todo que devuleve la longitud de la lista.
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
	 * M�todo que comprueba si la lista est� vac�a o no.
	 * @return: True si la lista est� vac�a, false si no.
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
	 * M�todo que inserta un elemento de tipo gen�rico dada su posici�n y su elemento.
	 *@param elemento: Elemento de tipo gen�rico.
     *@param pos: Posici�n del elemento.
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
	 * M�todo que retorna el elemento de la posici�n que le des.
	 * @param pos: posici�n del elemento de tipo gen�rico.
	 * @return: elemento.
	 */
	public T consultar(int pos) {
		
		Nodo aux= primero;
		for(int i=0; i<pos-1; i++) {
			aux=aux.siguiente;
			
		}return aux.elemento;
	}
	/**
	 * M�todo que busca el la lista el elemento que le pases y te devuelve su posici�n.
	 * @param element: elemento que hay que buscar.
	 * @return: posici�n del elemento.
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
	 * M�todo que borra un elemento de la lista dada su posic�n.
	 * @param pos: posici�n del elemento.
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
	 * M�todo que cambia un elemento por otro.
	 * @param element: elemento que sustituir� al otro elemento
	 * @param pos: posici�n del elemento que va a ser modificado.
	 */
	public void moficar( T element,int pos) {
		Nodo aux= primero;
		for(int i=0; i<pos-1; i++) {
			aux=aux.siguiente;
		
		}
		aux.elemento=element;
		
	}
	/**
	 * M�todo que imprime los elementos de la lista.
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
