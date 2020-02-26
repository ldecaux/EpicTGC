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
	 * Methode de pioche, on diminue le nombre de carte du deck
	 * et on retire et retourne la premiere carte du deck
	 */
	public Carte draw() {
		nbCard--;
		return this.cards.remove(0);
	}
	
	/*
	 * methode d'ajout d'une carte au deck
	 * retourne faux si ne peut pas rajouter
	 */
	public boolean add(Carte card) {
		if (this.cards.size() < nbMaxCard) {
			this.cards.add(card);
			return true;
		}
		return false;
	}
	
	/*
	 * methode d'ajout de plusieurs cartes dans le deck
	 * retourne vrai tant qu'au moins une carte a ete ajoutee
	 * si aucune carte n'est ajoutee au deck, retourne faux
	 */
	public boolean addAll(List<Carte> cards) {
		if (this.cards.size() + cards.size() <= nbMaxCard) {
			cards.addAll(cards);
			nbCard += cards.size();
			return true;
		}
		else if (this.cards.size() >= this.nbMaxCard){
			return false;
		}
		else {
			for (Carte card : cards) {
				if(this.cards.size() >= this.nbMaxCard) {
					return true;
				}
				this.cards.add(card);
			}
		}
		return true;
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
