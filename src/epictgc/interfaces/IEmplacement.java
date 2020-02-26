package epictgc.interfaces;

import epictgc.classes.Carte;

public interface IEmplacement {
	public boolean poser(Carte carte, boolean visible);
	public boolean retourner();
	
}
