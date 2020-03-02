package dinamica;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		PilaDinamica <String>pd= new PilaDinamica<String>();
		System.out.println("<-------------------------PILA DINÁMICA------------------------------>\n");
		System.out.println("¿La lista está vacía?(Al principio): "+pd.Vacia());
		System.out.println("¿Cuantos elementos hay?: "+pd.longitud());
		pd.insertar("pedro");
		pd.insertar("juana");
		pd.insertar("marcos");
		pd.insertar("Antonio");
		System.out.println("ELEMENTOS INSERTADOS:");
		System.out.println(pd.toString()+"\n");
		System.out.println("¿La lista está vacía?(ya hay elementos insertados): "+pd.Vacia());
		System.out.println("¿Cuantos elementos hay?: "+pd.longitud());
		System.out.println("EXTRAEMOS UN ELEMENTO: ");
		System.out.println("¿A quién hemos extraido?: "+pd.extraer());
		System.out.println(pd.toString()+"\n");
		System.out.println("¿Cuantos elementos hay ahora?: "+pd.longitud());
		pd.vaciar();
		System.out.println("VACIAMOS LA PILA Y PREGUNTAMOS CUANTOS ELEMENTOS HAY AHORA?: "+pd.longitud()+"\n");
		System.out.println("<-------------------------PILA DINÁMICA------------------------------>\n");
		
		
		System.out.println("<-------------------------COLA DINÁMICA------------------------------>\n");
		ColaDinamica <String>cd= new ColaDinamica<String>();
		System.out.println("¿La lista está vacía?(Al principio): "+cd.isVacia()); 
		System.out.println("¿Cuantos elementos hay?: "+cd.longitud());
		cd.insertar("Loca");
		cd.insertar("pedro");
		cd.insertar("caca");
		System.out.println("ELEMENTOS INSERTADOS:");
		System.out.println(cd.toString()+"\n");
		System.out.println("¿La lista está vacía?(ya hay elementos insertados): "+cd.isVacia());
		System.out.println("¿Cuantos elementos hay?: "+cd.longitud());
		System.out.println("EXTRAEMOS UN ELEMENTO(el primero): ");
		cd.extraer();
		System.out.println(cd.toString()+"\n");
		System.out.println("¿Cuantos elementos hay ahora?: "+cd.longitud());
		cd.vaciar();
		System.out.println("VACIAMOS LA PILA Y PREGUNTAMOS CUANTOS ELEMENTOS HAY AHORA?: "+cd.longitud()+"\n");

		System.out.println("<-------------------------COLA DINÁMICA------------------------------>\n");
		
		System.out.println("<-------------------------LISTA DINÁMICA------------------------------>\n");
		ListaDinamica<String> ld = new ListaDinamica<String>();
		System.out.println("¿La lista está vacía?(Al principio): "+ld.isVacia());
		System.out.println("¿Cuantos elementos hay?: "+ld.longitud());
		ld.insertar("Pancracio",1);
		ld.insertar("quijote",2);
		ld.insertar("Dumbo",3);
		ld.insertar("Mario",4);
		System.out.println("ELEMENTOS INSERTADOS:");
		System.out.println(ld.toString()+"\n");
		System.out.println("¿La lista está vacía?(ya hay elementos insertados): "+ld.isVacia());
		System.out.println("¿Cuantos elementos hay?: "+ld.longitud());
		System.out.println("MODIFICAMOS el elemento pancracio por jakson y Dumbo por orejas: ");
		ld.moficar("jakson", 1);
		ld.moficar("Orejas", 3);
		System.out.println(ld.toString()+"\n");
		System.out.println("BORRAMOS EL PRIMER ELEMENTO:");
		ld.delete(1);
		System.out.println(ld.toString()+"\n");
		System.out.println("¿Qué elemento está en la posición tres?: "+ld.consultar(3));
		System.out.println("¿Cuantos elementos hay ahora?: "+ld.longitud());
		System.out.println("¿En que posición está el elemento OREJAS?: "+ld.buscar("Orejas"));
		
		System.out.println("<-------------------------LISTA DINÁMICA------------------------------>\n");
	}

}
