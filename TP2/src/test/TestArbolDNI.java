package test;

import modelo.Arbol;
import modelo.CompararDNI;
import modelo.CompararNombre;
import interfaces.IArbol;
import modelo.Persona;
import interfaces.IPersona;
import modelo.Nodo;
import interfaces.INodo;

public class TestArbolDNI {
	public static void main(String[] args) {
		IArbol arbol = new Arbol();
		
		IPersona [] personas = {
			new Persona("6","Jorge"),
			new Persona("1","Alejo"),
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
	
		CompararDNI compDNI = new CompararDNI();
		
		IArbol<IPersona> arbolDNI = new Arbol<>();
		
		for (IPersona p : personas) {
			arbolDNI.insertar(p, compDNI);
		}
		
		System.out.println("Recorrido In Order en arbol DNI");
		arbolDNI.recorridoInorder();
		
		System.out.println("\n\nRecorrido Post Order en arbol DNI");
		arbolDNI.recorridoPostorder();
		
		System.out.println("\n\nRecorrido Pre Order en arbol DNI");
		arbolDNI.recorridoPreorder();
		
		System.out.println("\n\nBuscar X");
        IPersona aBuscar = new Persona("42", "Zarate");
        INodo<IPersona> nodoEncontrado = arbolDNI.buscar(aBuscar, compDNI);
        System.out.println("En el arbol de DNI: " + (nodoEncontrado != null ? nodoEncontrado.getDato() : "No encontrado"));
        
        System.out.println("\nEliminar X");
        IPersona aEliminar = new Persona("7", "Mammana");
        nodoEncontrado = arbolDNI.buscar(aEliminar, compDNI);
        System.out.println("Antes de eliminar: " + (nodoEncontrado != null ? nodoEncontrado.getDato() : "No encontrado"));
        arbolDNI.eliminar(aEliminar, compDNI);
        nodoEncontrado = arbolDNI.buscar(aEliminar, compDNI);
        System.out.println("Después de eliminar: " + (nodoEncontrado != null ? nodoEncontrado.getDato() : "No encontrado"));
	}
}
