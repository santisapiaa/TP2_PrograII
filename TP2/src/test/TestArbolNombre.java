package test;

import modelo.Arbol;
import modelo.CompararDNI;
import modelo.CompararNombre;
import interfaces.IArbol;
import modelo.Persona;
import interfaces.IPersona;
import modelo.Nodo;
import interfaces.INodo;

public class TestArbolNombre {
	public static void main(String[] args) {
		IArbol arbol = new Arbol();
		
		IPersona [] personas = {
			new Persona("1","Jorge"),
			new Persona("6","Alejo"),
			new Persona("2","Santiago"),
			new Persona("9","Palermo"),
			new Persona("15","Bouzat"),
			new Persona("8","Elias Gomez"),
			new Persona("21","Montoro"),
			new Persona("18","Maher"),
			new Persona("31","Bianchi"),
			new Persona("7","Mammana"),
			new Persona("19","Tevez"),
			new Persona("26","Centurion"),
			new Persona("20","Benedetto"),
			new Persona("35","Roman"),
			new Persona("42","Zarate")
		};
	
		CompararNombre compNombre = new CompararNombre();
		
		IArbol<IPersona> arbolNombre = new Arbol<>();
		
		for (IPersona p : personas) {
			arbolNombre.insertar(p, compNombre);
		}
		
		System.out.println("Recorrido In Order");
		arbolNombre.recorridoInorder();
		
		System.out.println("\n\nRecorrido Post Order");
		arbolNombre.recorridoPostorder();
		
		System.out.println("\n\nRecorrido Pre Order");
		arbolNombre.recorridoPreorder();
		
		System.out.println("\n\nBuscar X");
        IPersona aBuscar = new Persona("42", "Zarate");
        INodo<IPersona> nodoEncontrado = arbolNombre.buscar(aBuscar, compNombre);
        System.out.println("En el arbol de Nombre: " + (nodoEncontrado != null ? nodoEncontrado.getDato() : "No encontrado"));
        
        System.out.println("\nEliminar X");
        IPersona aEliminar = new Persona("7", "Mammana");
        nodoEncontrado = arbolNombre.buscar(aEliminar, compNombre);
        System.out.println("Antes de eliminar: " + (nodoEncontrado != null ? nodoEncontrado.getDato() : "No encontrado"));
        arbolNombre.eliminar(aEliminar, compNombre);
        nodoEncontrado = arbolNombre.buscar(aEliminar, compNombre);
        System.out.println("Después de eliminar: " + (nodoEncontrado != null ? nodoEncontrado.getDato() : "No encontrado"));
	}
}
