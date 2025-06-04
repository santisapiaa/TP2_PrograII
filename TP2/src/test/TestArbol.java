package test;

import modelo.Arbol;
import interfaces.IArbol;
import modelo.Persona;
import interfaces.IPersona;
import modelo.Nodo;
import interfaces.INodo;


public class TestArbol {
	public static void main(String[] args) {
		IArbol arbol = new Arbol();
		INodo encontrado;
		
		Persona p1 = new Persona(1,"jorge");
		Persona p2 = new Persona(6,"jorge");
		Persona p3 = new Persona(2,"jorge");
		Persona p4 = new Persona(9,"jorge");
		Persona p5 = new Persona(15,"jorge");
		Persona p6 = new Persona(8,"jorge");
		Persona p7 = new Persona(21,"jorge");
		Persona p8 = new Persona(18,"jorge");
		Persona p9 = new Persona(31,"jorge");
		Persona p10 = new Persona(7,"jorge");
		Persona p11 = new Persona(19,"jorge");
		Persona p12 = new Persona(26,"jorge");
		Persona p13 = new Persona(20,"jorge");
		Persona p14 = new Persona(35,"jorge");
		Persona p15 = new Persona(17,"jorge");

		
		arbol.insertar(p6);
		arbol.insertar(p8);
		arbol.insertar(p7);
		arbol.insertar(p3);
		arbol.insertar(p5);
		arbol.insertar(p1);
		arbol.insertar(p4);
		arbol.insertar(p15);
		arbol.insertar(p9);
		arbol.insertar(p14);
		arbol.insertar(p11);
		arbol.insertar(p12);
		arbol.insertar(p13);
		arbol.insertar(p10);
		arbol.insertar(p2);
		
		System.out.println("Recorrido In Order");
		arbol.recorridoInorder();
		
		System.out.println("\n\nRecorrido Post Order");
		arbol.recorridoPostorder();
		
		System.out.println("\n\nRecorrido Pre Order");
		arbol.recorridoPreorder();
		
		System.out.println("\n\nBuscar X");
		encontrado = arbol.buscar(0);
		System.out.println(encontrado != null ? " Encontrado: " + encontrado.getDato(): "No encontrado");
		
		System.out.println("\n\nEliminar X");
		encontrado = arbol.buscar(1);
		System.out.println(encontrado != null ? " Encontrado: " + encontrado.getDato(): "No encontrado");
		arbol.eliminar(1);
		encontrado = arbol.buscar(1);
		System.out.println(encontrado != null ? " Encontrado: " + encontrado.getDato(): "No encontrado");

		
		
	}
}
