package epictgc.interfaces;

import epictgc.classes.Emplacement;
import epictgc.classes.Tour;

public interface ICarte {
	public boolean poser(Emplacement emplacement , Tour tour);
	public boolean defausse();
	public boolean retourner();
}
