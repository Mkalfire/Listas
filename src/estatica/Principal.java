package estatica;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		System.out.println("<-------------------------PILA EST�TICA------------------------------>\n");
		PilaEstatica<String> p = new PilaEstatica<String>();
		System.out.println("�La pila est� Vacia?: "+p.Vacia());//La pila est� vac�a pues todav�a no hemos insertado ningun elemento.
		
		p.insertar("juan");//insertamos algunos elementos
		System.out.println(p.toString());
		p.insertar("arelys");
		System.out.println(p.toString());
		p.insertar("jakson");
		System.out.println(p.toString());
		p.extraer();//quitamos elementos de la pila
		System.out.println(p.toString()+"-----quitamos al ultimo(0)");
		p.insertar("loca");
		System.out.println(p.toString());
		p.insertar("yuliana");
		System.out.println(p.toString());
		p.extraer();
		System.out.println(p.toString());
		p.insertar("pedro");
		System.out.println(p.toString()+"---aqui el vector est� lleno");
		p.insertar("pablo");//Aqui es cuando se crea el otro Array con el doble de longitud que el Array anterior.
		System.out.println(p.toString()+"---el vector ya tiene 8 huecos");
	
		System.out.println("�La pila est� Vacia?: "+p.Vacia());
		System.out.println("�Cu�l es el �ltimo elemento de la pila?: "+p.cima());	
		System.out.println("�Cu�ntos elementos hay en total?: "+p.numElements());
		p.Vaciar();
		System.out.println("�Cu�ntos elementos hay ahora?: "+p.numElements()+"\n");
		System.out.println("<-------------------------PILA EST�TICA------------------------------>"+"\n");
		
		
		System.out.println("<-------------------------COLA EST�TICA------------------------------>\n");
		
		ColaEstatica<Integer> c = new ColaEstatica<Integer>();
		System.out.println("�La cola est� vac�a?: "+c.Vacia());//La cola est� vac�a pues todav�a no hemos insertado ningun elemento.
		
		c.insertar(1);//insertamos elementos.
		System.out.println(c.toString());
		c.insertar(2);
		System.out.println(c.toString());
		c.insertar(3);
		System.out.println(c.toString());
		c.insertar(4);
		System.out.println(c.toString());
		c.insertar(0);
		System.out.println(c.toString());
		c.extraer();//quitamos el primer elemento que ya es su turno en la charcuter�a y movemos a los demas una posici�n atr�s.
		System.out.println(c.toString()+"---el 1 se va a ver a la novia y los demas avanzan hasta que les toque a ellos.");
		System.out.println("�Cu�l es el primero de la cola?: "+c.primero());//preguntamos qui�n es el primero de la cola.
		System.out.println("�Cu�ntos elementos hay en total?: "+c.numElements());
		System.out.println("�La cola est� vac�a?: "+c.Vacia());//volvemos ha preguntar si cola est� vac�a.
		c.vaciar();
		System.out.println("�Cu�ntos elementos hay ahora?: "+c.numElements()+"\n");
		
		System.out.println("<-------------------------COLA EST�TICA------------------------------>\n");
		
		
		System.out.println("<-------------------------LISTA EST�TICA------------------------------>\n");
		

		ListaEstatica<String> l = new ListaEstatica<String>();
		
		System.out.println("�La Lista est� vac�a?: "+l.isVacia());//obviamente est� vac�a ya que no hemos insertado ningun elemento todav�a
		l.insertar(1, "Juan");//empezamos a insertar elementos en la lista
		System.out.println(l.toString());
		l.insertar(2, "Pedro");
		System.out.println(l.toString());
		l.insertar(3, "Amancio");
		System.out.println(l.toString());
		l.insertar(4, "Antonio");
	
		System.out.println(l.toString());
		l.insertar(5, "Putin");
		System.out.println(l.toString());
		l.borrrar(4);//borramos elementos con su posici�n.
		System.out.println(l.toString());
		l.modificar(4, "jakson");//modificamos un elemento dado una posici�n y el elemento que le sustituir�.
		System.out.println(l.toString());
		System.out.println("Dada una posici�n nos devuelve el elemento de esa posici�n: "+l.consultar(4));
		System.out.println("�Cu�ntos elementos hay en total?: "+l.longitud());
		System.out.println("�La lista est� vac�a?: "+l.isVacia());//volvemos ha preguntar si cola est� vac�a.
		l.Vaciar();
		System.out.println("�Cu�ntos elementos hay ahora?: "+l.longitud()+"\n");
		System.out.println(l.buscar("jakson"));

		System.out.println("<-------------------------LISTA EST�TICA------------------------------>\n");
		
		
		
		
		
		
	}

}
