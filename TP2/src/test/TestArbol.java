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
		
		IPersona p1 = new Persona(1,"JORGE");
		IPersona p2 = new Persona(6,"Alejo");
		IPersona p3 = new Persona(2,"Santiago");
		IPersona p4 = new Persona(9,"Palermo");
		IPersona p5 = new Persona(15,"Bouzat");
		IPersona p6 = new Persona(8,"Elias Gomez");
		IPersona p7 = new Persona(21,"Montoro");
		IPersona p8 = new Persona(18,"Maher");
		IPersona p9 = new Persona(31,"Bianchi");
		IPersona p10 = new Persona(7,"Mammana");
		IPersona p11 = new Persona(19,"Tevez");
		IPersona p12 = new Persona(26,"Centurion");
		IPersona p13 = new Persona(20,"Benedetto");
		IPersona p14 = new Persona(35,"Roman");
		IPersona p15 = new Persona(17,"AlmiGOD");
		IPersona p16 = new Persona(42,"Zarate");


		
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
		arbol.insertar(p16);
		
		System.out.println("Recorrido In Order");
		arbol.recorridoInorder();
		
		System.out.println("\n\nRecorrido Post Order");
		arbol.recorridoPostorder();
		
		System.out.println("\n\nRecorrido Pre Order");
		arbol.recorridoPreorder();
		
		System.out.println("\n\nBuscar X");
		arbol.buscar(20);
		
		
		System.out.println("\n\nEliminar X");
		arbol.buscar(1);
		arbol.eliminar(1);
		arbol.buscar(1);

		
		
	}
}
