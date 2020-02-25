package epictgc.classes;

import epictgc.interfaces.ITerrain;

public class Terrain implements ITerrain{

	Emplacement [] emplacements;
	Deck deck;
	Cimetiere cimetiere;
	Hand hand;
	
	public Terrain() {
		new Terrain(4);
	}
	public Terrain(int nbEmplacement) {
		new Terrain(nbEmplacement, new Deck());
	}
	public Terrain(int nbEmplacement, Deck usedDeck) {
		this.emplacements = new Emplacement[nbEmplacement];
		for (Emplacement emplacement : this.emplacements) {
			emplacement = new Emplacement();
		}
		this.deck = usedDeck;
		this.cimetiere = new Cimetiere();
	}
	
	public boolean drawCard() {
		return false;
	}
	public boolean discard() {
		return false;
	}
	
	
	public Emplacement getEmplacement(int index) {
		return this.emplacements[index];
	}
	public void setEmplacement(int index, Emplacement emplacement) {
		this.emplacements[index] = emplacement;
	}
	public Emplacement[] getEmplacements() {
		return this.emplacements;
	}
	public void setEmplacements(Emplacement[] emplacements) {
		this.emplacements = emplacements;
	}
	public Deck getDeck() {
		return this.deck;
	}
	public void setDeck(Deck deck) {
		this.deck = deck;
	}
	public Cimetiere getCimetiere() {
		return this.cimetiere;
	}
	public void setCimetiere(Cimetiere cimetiere) {
		this.cimetiere = cimetiere;
	}
}
