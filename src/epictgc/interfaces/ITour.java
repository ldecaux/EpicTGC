package epictgc.interfaces;

import epictgc.classes.Carte;
import epictgc.classes.Emplacement;

public interface ITour {
	public boolean poser(Emplacement emplacement, Carte carte, boolean visible);
	
}
