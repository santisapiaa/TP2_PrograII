package modelo;

import interfaces.INodo;
import interfaces.IPersona;

public class Nodo implements INodo{
	
	private IPersona dato;
	private INodo izquierdo;
	private INodo derecho;

	public Nodo(IPersona dato) {
		super();
		this.dato = dato;
		this.izquierdo = null;
		this.derecho = null;
	}

	@Override
	public IPersona getDato() {
		return dato;
	}

	@Override
	public void setDato(IPersona dato) {
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
