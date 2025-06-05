package modelo;

import java.util.Comparator;
import interfaces.IPersona;

public class CompararNombre implements Comparator<IPersona>{

	@Override
	public int compare(IPersona p1, IPersona p2) {
		return p1.getNombre().compareTo(p2.getNombre());
	}
}