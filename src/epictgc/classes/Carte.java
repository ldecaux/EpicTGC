package epictgc.classes;

import epictgc.interfaces.ICarte;

public class Carte implements ICarte{
	
	public Carte() {
		
	}
	public boolean poser(Emplacement emplacement , Tour tour)
	{
		if (emplacement.estVide) 
		{
			// on pose la carte
			//TODO terrain
		}
		
		return true;
	}
	
	public boolean defausse() {
		// TODO Auto-generated method stub
		return false;
	}
}
