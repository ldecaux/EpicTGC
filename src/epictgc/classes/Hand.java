package epictgc.classes;

import java.util.ArrayList;
import java.util.List;

import epictgc.interfaces.IHand;

public class Hand implements IHand{
	int max;
	List<Carte> cards;
	
	public Hand() 
	{
		new Hand(7);
	}
	public Hand(int max) 
	{
		new Hand(max, new ArrayList<Carte>());
	}
	public Hand(int max, List<Carte> cards) 
	{
		this.max = max;
		this.cards = cards;
	}
	
	/*
	 * méthode d'ajout de carte dans la main
	 * Si le nombre max de carte est atteint on refuse de rajouter
	 * et on préviens avec le return
	 */
	public boolean add(Carte card) {
		if (cards.size() < this.max) {
			cards.add(card);
			return true;
		}
		return false;
	}
	
	/*
	 * duo de méthodes de suppression de carte de la main
	 * possibilité de retirer selon un nombre ou selon un carte spécifique
	 * les deux retournent faux en cas d'echec
	 */
	public boolean remove(int index) {
		if (this.cards.size() > index) {
			this.cards.remove(index);
			return true;
		}
		return false;
	}
	public boolean remove(Carte card) {
		return this.cards.remove(card);
	}
	
	public boolean jouer() //jouer une carte
	{
		return true;
	}
	

	public Carte getCard(int index) {
		return cards.get(index);
	}
	public void setCard(int index, Carte card) {
		cards.set(index, card);
	}
	public List<Carte> getCards(){
		return this.cards;
	}
	public void setCards(List<Carte> cards) {
		this.cards = cards;
	}
	
	public int getMax()
	{
		return this.max;
	}
	
	public void setMax(int max)
	{
		this.max = max;
	}
}
