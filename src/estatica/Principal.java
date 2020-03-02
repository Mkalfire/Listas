package estatica;

public class Principal {

	public static void main(String[] args) throws Exception {
		
		System.out.println("<-------------------------PILA ESTÁTICA------------------------------>\n");
		PilaEstatica<String> p = new PilaEstatica<String>();
		System.out.println("¿La pila está Vacia?: "+p.Vacia());//La pila está vacía pues todavía no hemos insertado ningun elemento.
		
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
		System.out.println(p.toString()+"---aqui el vector está lleno");
		p.insertar("pablo");//Aqui es cuando se crea el otro Array con el doble de longitud que el Array anterior.
		System.out.println(p.toString()+"---el vector ya tiene 8 huecos");
	
		System.out.println("¿La pila está Vacia?: "+p.Vacia());
		System.out.println("¿Cuál es el último elemento de la pila?: "+p.cima());	
		System.out.println("¿Cuántos elementos hay en total?: "+p.numElements());
		p.Vaciar();
		System.out.println("¿Cuántos elementos hay ahora?: "+p.numElements()+"\n");
		System.out.println("<-------------------------PILA ESTÁTICA------------------------------>"+"\n");
		
		
		System.out.println("<-------------------------COLA ESTÁTICA------------------------------>\n");
		
		ColaEstatica<Integer> c = new ColaEstatica<Integer>();
		System.out.println("¿La cola está vacía?: "+c.Vacia());//La cola está vacía pues todavía no hemos insertado ningun elemento.
		
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
		c.extraer();//quitamos el primer elemento que ya es su turno en la charcutería y movemos a los demas una posición atrás.
		System.out.println(c.toString()+"---el 1 se va a ver a la novia y los demas avanzan hasta que les toque a ellos.");
		System.out.println("¿Cuál es el primero de la cola?: "+c.primero());//preguntamos quién es el primero de la cola.
		System.out.println("¿Cuántos elementos hay en total?: "+c.numElements());
		System.out.println("¿La cola está vacía?: "+c.Vacia());//volvemos ha preguntar si cola está vacía.
		c.vaciar();
		System.out.println("¿Cuántos elementos hay ahora?: "+c.numElements()+"\n");
		
		System.out.println("<-------------------------COLA ESTÁTICA------------------------------>\n");
		
		
		System.out.println("<-------------------------LISTA ESTÁTICA------------------------------>\n");
		

		ListaEstatica<String> l = new ListaEstatica<String>();
		
		System.out.println("¿La Lista está vacía?: "+l.isVacia());//obviamente está vacía ya que no hemos insertado ningun elemento todavía
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
		l.borrrar(4);//borramos elementos con su posición.
		System.out.println(l.toString());
		l.modificar(4, "jakson");//modificamos un elemento dado una posición y el elemento que le sustituirá.
		System.out.println(l.toString());
		System.out.println("Dada una posición nos devuelve el elemento de esa posición: "+l.consultar(4));
		System.out.println("¿Cuántos elementos hay en total?: "+l.longitud());
		System.out.println("¿La lista está vacía?: "+l.isVacia());//volvemos ha preguntar si cola está vacía.
		l.Vaciar();
		System.out.println("¿Cuántos elementos hay ahora?: "+l.longitud()+"\n");
		System.out.println(l.buscar("jakson"));

		System.out.println("<-------------------------LISTA ESTÁTICA------------------------------>\n");
		
		
		
		
		
		
	}

}
