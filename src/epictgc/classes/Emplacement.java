package epictgc.classes;

import epictgc.interfaces.IEmplacement;

public class Emplacement implements IEmplacement{
	boolean estVide;
	boolean visible;
	Carte carte;
	public Emplacement() 
	{
		estVide = true;	
	}
	public boolean poser(Carte carte, boolean visible) 
	{
		this.carte = carte;
		this.visible = visible;
		this.estVide = false;
		return true;
	}
	
	public boolean Retourner() {
		visible = !visible;
		
		return true;
	}
	
	public boolean getEstVide()
	{
		return estVide;
	}
	public void setEstVide(boolean b)
	{
		estVide = b;
	}
	
	public boolean getVisible()
	{
		return this.visible;
	}
	public void setVisible(boolean visible)
	{
		this.visible = visible;
	}
	
	public Carte getCarte()
	{
		return this.carte;
	}
	public void setCarte(Carte carte)
	{
		this.carte = carte;
	}
}
 