package epictgc.classes;

import epictgc.interfaces.ICimetiere;

public class Cimetiere implements ICimetiere{
	int nbCarte;
	Carte carte;
	
	public Cimetiere() 
	{
		nbCarte = 0;
	}	
	
	public boolean ajouter()
	{	
		nbCarte++;
		return true;
	}	
	
	public boolean recuperer()
	{	
		nbCarte--;
		return true;
	}	
	
	public int getNbCarte()
	{
		return this.nbCarte;
	}
	
	public void setNbCarte(int nbCarte) {
		this.nbCarte = nbCarte;
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
