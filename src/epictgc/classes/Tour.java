package epictgc.classes;

import epictgc.interfaces.ITour;

public class Tour implements ITour{

	int power;
	
	public Tour() {
		new Tour(2);
	}
	public Tour(int power) {
		this.power = power;
	}
	public boolean poser(Emplacement emplacement, Carte carte, boolean visible) {
		if(carte.getCost() <= power) {
			return carte.poser(emplacement, visible);
		}
		return false;
	}
	
	public int getPower() {
		return this.power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}
