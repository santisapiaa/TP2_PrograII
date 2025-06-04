package interfaces;

public interface INodo {
	IPersona getDato();
	void setDato(IPersona dato);
	
	INodo getIzquierdo();
	void setIzquierdo(INodo izquierdo);
	
	INodo getDerecho();
	void setDerecho(INodo derecho);

}
