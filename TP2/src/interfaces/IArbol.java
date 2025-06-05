package interfaces;

import java.util.Comparator;

public interface IArbol<T> {
	void insertar(T dato, Comparator<T> comparador);
	INodo buscar(T dato, Comparator<T> comparador);
    
	void recorridoInorder();
	void recorridoPreorder();
	void recorridoPostorder();
	    
	public void eliminar(T dato, Comparator<T> comparador);
}