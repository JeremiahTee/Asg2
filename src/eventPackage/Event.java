package eventPackage;
//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------

/**
 * Event class
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class Event {
	private int year;
	private int month;
	private int numberCities;
	
	public Event(){
		year = 2017;
		month = 12;
		numberCities = 0;
		System.out.println("The Event default constructor has been triggered...");
	}
	
	public Event(int year, int month, int numberCities){
		this.year = year;
		this.month = month;
		this.numberCities = numberCities; 
		System.out.println("The Event parametrized constructor has been triggered...");
	}
	
	public Event(Event otherEvent){
		this.year = otherEvent.year;
		this.month = otherEvent.month;
		this.numberCities = otherEvent.numberCities;
		System.out.println("The Event copy constructor has been triggered...");
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getNumberCities() {
		return numberCities;
	}
	public void setNumberCities(int numberCities) {
		this.numberCities = numberCities;
	}
	
	public String toString(){
		return "This Event will be held in " + this.getYear() + ", " + this.getMonth() + " in " + this.getNumberCities() + " cities";
	}
	
	//The null verification in this case is redundant, because you cannot call this equals() method on a null object. 
	//The code will not compile, because the compiler will refuse to call equals() on null.
	@SuppressWarnings("null")
	public boolean equals(Event otherEvent){
		if(otherEvent == null && otherEvent.getClass() == this.getClass()){
			return false;
		}
		return this.getYear() == otherEvent.getYear() && this.getMonth() == otherEvent.getMonth() && this.getNumberCities() == otherEvent.getNumberCities();
	}
	
	//Create and return a new Event using the copy constructor
	public Event clone() {
		return new Event(this);
	}
}
