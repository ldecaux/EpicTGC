package epictgc.classes;

import java.util.ArrayList;
import java.util.List;

import epictgc.interfaces.IDeck;

public class Deck implements IDeck
{
	int nbMaxCard;
	int nbCard;
	List<Carte> cards;
	
	public Deck() {
		new Deck(50);
	}
	public Deck(int nbMaxCard) {
		new Deck(nbMaxCard, new ArrayList<Carte>());
	}
	public Deck(int nbMaxCard, List<Carte> cards) {
		this.nbCard = cards.size();
		this.nbMaxCard = cards.size() > nbMaxCard ? cards.size() : nbMaxCard;
		this.cards = cards;
	}
	
	/*
	 * Méthode de pioche, on diminue le nombre de carte du deck
	 * et on retire et retourne la première carte du deck
	 */
	public Carte draw() {
		nbCard--;
		return this.cards.remove(0);
	}
	
	
	public int getNbMaxCard() {
		return nbMaxCard;
	}
	public void setNbMaxCard(int nbMaxCard) {
		this.nbMaxCard = nbMaxCard;
	}
	public int getNbCard() {
		return nbCard;
	}
	public void setNbCard(int nbCard) {
		this.nbCard = nbCard;
	}
	public List<Carte> getCards() {
		return cards;
	}
	public void setCards(List<Carte> cards) {
		this.cards = cards;
	}
	public Carte getCard(int index) {
		return this.cards.get(index);
	}
	public void setCard(int index, Carte card) {
		this.cards.set(index, card);
	}
}
