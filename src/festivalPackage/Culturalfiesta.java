package festivalPackage;

import eventPackage.Event;
import festivalPackage.Festival;
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

public class Culturalfiesta extends Festival{
	private int spokenLanguages;
	
	public Culturalfiesta() {
		super();
		spokenLanguages = 1;
		System.out.println("The Culturalfiesta default constructor has been triggered...");
	}

	public Culturalfiesta(int year, int month, int numberCities, String name, double ticketPrice, int duration, int spokenLang) {
		super(year, month, numberCities, name, ticketPrice, duration);
		this.spokenLanguages = spokenLang;
		System.out.println("The Culturalfiesta parametrized constructor has been triggered...");
	}
	
	public Culturalfiesta(Culturalfiesta otherCultural) {
		super(otherCultural);
		spokenLanguages = otherCultural.spokenLanguages;
		System.out.println("The Culturalfiesta copy constructor has been triggered...");
	}
	
	public int getSpokenLanguages() {
		return spokenLanguages;
	}
	
	public void setSpokenLanguages(int spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}
	
	//accessing some attributes by name because those attributes are protected in Festival (access rights)
	public String toString(){
		return "This " + this.name + " Culturalfiesta will be held in " + this.getYear() + ", " + this.getMonth() + " in " 
	+ this.getNumberCities() + " cities, for " + this.duration + " days, the ticket will cost " + this.ticketPrice + "$, "
			+ " and has " + this.getSpokenLanguages() + " spoken language";
	}
	
	//The null verification in this case is redundant, because you cannot call this equals() method on a null object. 
	//The code will not compile, because the compiler will refuse to call equals() on null.
	@SuppressWarnings("null")
	public boolean equals(Culturalfiesta otherCultural){
		if(otherCultural == null && otherCultural.getClass() == this.getClass()){
			return false;
		}
		return this.getYear() == otherCultural.getYear() && this.getMonth() == otherCultural.getMonth() && this.getNumberCities() == otherCultural.getNumberCities()
				&& this.getName() == otherCultural.getName() && this.getTicketPrice() == otherCultural.getTicketPrice() && this.getDuration() == otherCultural.getDuration()
				&& this.getSpokenLanguages() == otherCultural.getSpokenLanguages();
	}
}
