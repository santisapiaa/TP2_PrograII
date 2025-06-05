package modelo;

import java.util.Comparator;
import interfaces.IPersona;

public class CompararDNI implements Comparator<IPersona>{

	@Override
	public int compare(IPersona p1, IPersona p2) {
		return Integer.compare(Integer.parseInt(p1.getDni()), Integer.parseInt(p2.getDni()));
	}
}