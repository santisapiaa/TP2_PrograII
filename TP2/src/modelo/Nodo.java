package modelo;

import interfaces.INodo;
import modelo.Persona;

public class Nodo implements INodo{
	
	private Persona dato;
	private INodo izquierdo;
	private INodo derecho;

	public Nodo(Persona dato) {
		super();
		this.dato = dato;
		this.izquierdo = null;
		this.derecho = null;
	}

	@Override
	public Persona getDato() {
		return dato;
	}

	@Override
	public void setDato(Persona dato) {
		this.dato = dato;
	}

	@Override
	public INodo getIzquierdo() {
		return izquierdo;
	}

	@Override
	public void setIzquierdo(INodo izquierdo) {
		this.izquierdo = izquierdo;
	}

	@Override
	public INodo getDerecho() {
		return derecho;
	}

	@Override
	public void setDerecho(INodo derecho) {
		this.derecho = derecho;
	}
	
	

}
