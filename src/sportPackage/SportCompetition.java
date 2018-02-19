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
	
	public SportCompetition() {
		super();
		numberActivities = 3;
		System.out.println("The SportCompetition default constructor has been triggered...");
	}
	
	public SportCompetition(int year, int month, int numberCities, int numberActivities) {
		super(year, month, numberCities);
		this.numberActivities = numberActivities;
		System.out.println("The SportCompetition parametrized constructor has been triggered...");
	}
	
	public SportCompetition(SportCompetition otherSportCompetition) {
		super(otherSportCompetition);
		this.numberActivities = otherSportCompetition.numberActivities;
		System.out.println("The SportCompetition copy constructor has been triggered...");
	}
	public int getNumberActivities() {
		return numberActivities;
	}
	public void setNumberActivities(int numberActivities) {
		this.numberActivities = numberActivities;
	}
	
	public String toString(){
		return "This SportCompetition will be held in " + this.getYear() + ", " + this.getMonth() + " in " + this.getNumberCities() + " cities"
				+ " and has " + this.getNumberActivities() + " activities";
	}
	
	//The null verification in this case is redundant, because you cannot call this equals() method on a null object. 
	//The code will not compile, because the compiler will refuse to call equals() on null.
	@SuppressWarnings("null")
	public boolean equals(SportCompetition otherSportCompetition){
		if(otherSportCompetition == null && otherSportCompetition.getClass() == this.getClass()){
			return false;
		}
		return this.getYear() == otherSportCompetition.getYear() && this.getMonth() == otherSportCompetition.getMonth() && this.getNumberCities() == otherSportCompetition.getNumberCities()
				&& this.getNumberActivities() == otherSportCompetition.getNumberActivities();
	}
}