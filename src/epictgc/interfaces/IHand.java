package epictgc.interfaces;

import epictgc.classes.Carte;

public interface IHand {
	public boolean add(Carte card);
	public boolean remove(int index);
	public boolean remove(Carte card);
}
