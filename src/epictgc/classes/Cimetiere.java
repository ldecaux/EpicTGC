package epictgc.classes; 
 
import java.util.ArrayList;
import java.util.List;

import epictgc.interfaces.ICimetiere; 
 
public class Cimetiere implements ICimetiere{ 
	int nbCarte; 
	Carte carte; 
	List<Carte> tuer;
	
	public Cimetiere()
	{ 
		new Cimetiere(0); 
	}	 
	public Cimetiere(int nbCarte) 
	{
		new Cimetiere(nbCarte, new ArrayList<Carte>());
	}
	public Cimetiere(int nbCarte, List<Carte> tuer) 
	{
		this.nbCarte = nbCarte;
		this.tuer= tuer;
	}

	public boolean ajouter(Carte carte) //ajouter une carte au cimetiere
	{	 
		nbCarte++; 
		tuer.add(carte);
		return true; 
	}	 
	 
	public Carte recuperer(Carte carte) // recuperer une carte du cimetiere
	{	 
		if (nbCarte>0) 
		{
			nbCarte--;
			tuer.remove(carte);  // trouver quelque chose au cas ou le cimetiere est vide au moment de récuperer une carte
			
		}
		return carte; 
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
	public List<Carte> getTuer()
	{
		return this.tuer;
	}
	public void setTuer(List<Carte> tuer) 
	{
		this.tuer = tuer;
	}
} 
