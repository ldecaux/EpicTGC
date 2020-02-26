package epictgc.interfaces;

import java.util.List;

import epictgc.classes.Carte;

public interface IDeck {
	public Carte draw();
	public boolean add(Carte card);
	public boolean addAll(List<Carte> cards);
	
}
