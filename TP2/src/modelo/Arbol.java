package modelo;

import interfaces.IArbol;
import interfaces.INodo;
import modelo.Persona;

public class Arbol implements IArbol{
	
	private INodo raiz;

	public Arbol(INodo raiz) {
		super();
		this.raiz = raiz;
	}

	@Override
	public void insertar(Persona dato) {
		raiz = insertarRec(raiz, dato);
	}
	
	private INodo insertarRec(INodo nodoRaiz, Persona dato) {
       if (nodoRaiz == null) {
    	   return new Nodo(dato);
       }
       
       if (dato.getDni() < nodoRaiz.getDato().getDni()) { 
           nodoRaiz.setIzquierdo(insertarRec(nodoRaiz.getIzquierdo(), dato));
           
       } else if (dato.getDni() > nodoRaiz.getDato().getDni()) {
           nodoRaiz.setDerecho(insertarRec(nodoRaiz.getDerecho(), dato));
       }
       return nodoRaiz;
    }

	@Override
	public INodo buscar(int dato) {
		return buscarRec(raiz, dato);
	}
	
	private INodo buscarRec(INodo nodo, int dato) {
		if (nodo == null || nodo.getDato().getDni() == dato) {
			return nodo;
		}
		if (dato < nodo.getDato().getDni()) {
			return buscarRec(nodo.getIzquierdo(), dato);
		} else {
			return buscarRec(nodo.getDerecho(), dato);
		}
		
	}
	
	@Override
	public void eliminar(Persona dato) {
		raiz = eliminarRec(raiz, dato);
	}
	
    private INodo eliminarRec(INodo nodo, Persona dato) {
    	if (nodo == null) return null;
    	
    	if (dato.getDni() < nodo.getDato().getDni()) {
    		nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato));
    	} else if (dato.getDni() > nodo.getDato().getDni()){
    		nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato));
    	} else { 
    		//Sin hijos
    		if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) return null;
    		
    		// 1 hijo
    		if (nodo.getIzquierdo() == null) return nodo.getDerecho();
    		if (nodo.getDerecho() == null) return nodo.getIzquierdo();
    		
    		//2 hijos
    		INodo sucesorDelImperio = encontrarMinimo(nodo.getDerecho());
    		nodo.setDato(sucesorDelImperio.getDato());
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesorDelImperio.getDato()));
    	}
    	return nodo;
    }
    
    private INodo encontrarMinimo(INodo nodo) {
    	while (nodo.getIzquierdo() != null) {
    		nodo = nodo.getIzquierdo();
    	}
    	return nodo;
    }

	@Override
	public void recorridoInorder() {
		inorderRec(raiz);
	}
	
	private void inorderRec(INodo nodo) {
		if (nodo != null) {
			inorderRec(nodo.getIzquierdo());
            System.out.print(nodo.getDato() + " ");
            inorderRec(nodo.getDerecho());
		}
	}

	@Override
	public void recorridoPreorder() {
		preorderRec(raiz);
	}
	
	private void preorderRec(INodo nodo) {
		if (nodo != null) {
            System.out.print(nodo.getDato() + " ");
			preorderRec(nodo.getIzquierdo());
            preorderRec(nodo.getDerecho());
		}
	}

	@Override
	public void recorridoPostorder() {
		postorderRec(raiz);
	}
	
	private void postorderRec(INodo nodo) {
		if (nodo != null) {
			postorderRec(nodo.getIzquierdo());
            postorderRec(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
		}
	}
}
