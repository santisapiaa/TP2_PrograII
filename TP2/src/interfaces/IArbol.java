package interfaces;

import modelo.Persona;

public interface IArbol {
	void insertar(Persona dato);
	INodo buscar(int dato);
    
	void recorridoInorder();
	void recorridoPreorder();
	void recorridoPostorder();
	    
	public void eliminar(Persona dato);

}
