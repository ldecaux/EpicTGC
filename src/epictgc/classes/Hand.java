package epictgc.classes;

import epictgc.interfaces.IHand;

public class Hand implements IHand{
	int index; // position de la carte
	int max;  // nombre maximun de carte en main
	
	public Hand() 
	{
		max = 7; // on suppose que le max dans la main est 7
	}
	
	public boolean jouer() //jouer une carte
	{
		return true;
	}
	
	public int getIndex()
	{
		return this.index;
	}
	
	public void setIndex(int index)
	{
		this.index = index;
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
