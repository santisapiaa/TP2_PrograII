package interfaces;

public interface IArbol {
	void insertar(IPersona dato);
	INodo buscar(int dato);
    
	void recorridoInorder();
	void recorridoPreorder();
	void recorridoPostorder();
	    
	public void eliminar(int dato);

}
