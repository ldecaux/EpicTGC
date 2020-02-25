package epictgc.classes;

import epictgc.interfaces.IEmplacement;

public class Emplacement implements IEmplacement{
	boolean estVide;
	public Emplacement() 
	{
		estVide = true;	
	}
	
	public boolean estvide()
	{
		return estVide;
	}
	public void setestVide(boolean b)
	{
		estVide = b;
	}
}
 