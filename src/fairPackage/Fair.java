package fairPackage;

import eventPackage.Event;
//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------

/**
 * 
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class Fair extends Event{
	private int exibitors;
	enum type {CAREER, SCIENCE, TRADE, TRAVEL}
	
	
	public int getExibitors() {
		return exibitors;
	}
	
	public void setExibitors(int exibitors) {
		this.exibitors = exibitors;
	}
}
