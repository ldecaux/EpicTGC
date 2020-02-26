package epictgc.classes;

import epictgc.interfaces.ICarte;

public class Carte implements ICarte{
	
	int cost;
	public Carte() {
		new Carte(1);
	}
	public Carte(int cost) {
		this.cost = cost;
	}
	
	public boolean poser(Emplacement emplacement, boolean visible)
	{
		if (emplacement.estVide) 
		{
			return emplacement.poser(this, visible);
		}
		return false;
	}
	
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
