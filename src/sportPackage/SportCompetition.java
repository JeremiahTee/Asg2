package sportPackage;

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

public class SportCompetition extends Event{
	private int numberActivities;
	enum seasonName {SUMMER, FALL, WINTER, SPRING}
	
	public int getNumberActivities() {
		return numberActivities;
	}
	public void setNumberActivities(int numberActivities) {
		this.numberActivities = numberActivities;
	}
}