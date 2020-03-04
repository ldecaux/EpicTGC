package epictgc.interfaces;

import epictgc.classes.Carte;

public interface ICimetiere {
	public boolean ajouter(Carte carte);
	public Carte recuperer(Carte carte);
}
