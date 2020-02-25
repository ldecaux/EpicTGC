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
	
	public int getPower() {
		return this.power;
	}
	public void setPower(int power) {
		this.power = power;
	}
}
