package modelo;
import java.util.Comparator;

import interfaces.IArbol;
import interfaces.INodo;
import interfaces.IPersona;

public class Arbol<T> implements IArbol<T>{
	
	private INodo<T> raiz;

	public Arbol() {
		super();
		this.raiz = raiz;
	}

	@Override
	public void insertar(T dato, Comparator<T> comparador) {
		raiz = insertarRec(raiz, dato, comparador);
	}
	
	private INodo<T> insertarRec(INodo<T> nodoRaiz, T dato, Comparator<T> comparador) {
       if (nodoRaiz == null) {
    	   return new Nodo<>(dato);
       }
     
       if (comparador.compare(dato, nodoRaiz.getDato()) < 0) { 
           nodoRaiz.setIzquierdo(insertarRec(nodoRaiz.getIzquierdo(), dato, comparador));
           
       } else {
           nodoRaiz.setDerecho(insertarRec(nodoRaiz.getDerecho(), dato, comparador));
       }
       return nodoRaiz;
    }

	@Override
	public INodo<T> buscar(T dato, Comparator<T> comparador) {
		return buscarRec(raiz, dato, comparador);
	}
	
	private INodo<T> buscarRec(INodo<T> nodo, T dato, Comparator<T> comparador) {
		if (nodo == null || comparador.compare(dato, nodo.getDato()) == 0) {
			return nodo;
		}
		
		if (comparador.compare(dato, nodo.getDato()) < 0) {
			return buscarRec(nodo.getIzquierdo(), dato, comparador);
		} else {
			return buscarRec(nodo.getDerecho(), dato, comparador);
		}
	}
	
	@Override
	public void eliminar(T dato, Comparator<T> comparador) {
		raiz = eliminarRec(raiz, dato, comparador);
	}
	
    private INodo<T> eliminarRec(INodo<T> nodo, T dato, Comparator<T> comparador) {
    	if (nodo == null) return null;
    	
    	if (comparador.compare(dato, nodo.getDato()) < 0) {
    		nodo.setIzquierdo(eliminarRec(nodo.getIzquierdo(), dato, comparador));
    	} else if (comparador.compare(dato, nodo.getDato()) > 0){
    		nodo.setDerecho(eliminarRec(nodo.getDerecho(), dato, comparador));
    	} else { 
    		//Sin hijos
    		if (nodo.getIzquierdo() == null && nodo.getDerecho() == null) return null;
    		
    		// 1 hijo
    		if (nodo.getIzquierdo() == null) return nodo.getDerecho();
    		if (nodo.getDerecho() == null) return nodo.getIzquierdo();
    		
    		//2 hijos
    		INodo<T> sucesor = encontrarMinimo(nodo.getDerecho());
    		nodo.setDato(sucesor.getDato());
            nodo.setDerecho(eliminarRec(nodo.getDerecho(), sucesor.getDato(), comparador));
    	}
    	return nodo;
    }
    
    private INodo<T> encontrarMinimo(INodo<T> nodo) {
    	while (nodo.getIzquierdo() != null) {
    		nodo = nodo.getIzquierdo();
    	}
    	return nodo;
    }

	@Override
	public void recorridoInorder() {
		inorderRec(raiz);
	}
	
	private void inorderRec(INodo<T> nodo) {
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
	
	private void preorderRec(INodo<T> nodo) {
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
	
	private void postorderRec(INodo<T> nodo) {
		if (nodo != null) {
			postorderRec(nodo.getIzquierdo());
            postorderRec(nodo.getDerecho());
            System.out.print(nodo.getDato() + " ");
		}
	}
}