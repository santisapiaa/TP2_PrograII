package interfaces;

import modelo.Persona;

public interface INodo {
	Persona getDato();
	void setDato(Persona dato);
	
	INodo getIzquierdo();
	void setIzquierdo(INodo izquierdo);
	
	INodo getDerecho();
	void setDerecho(INodo derecho);

}
