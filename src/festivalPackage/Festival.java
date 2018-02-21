package festivalPackage;
//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------

import eventPackage.Event;

/**
 * 
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class Festival extends Event{
	//type: Arts, Beer, Comedy, Film, Fire, Folk;
	//We decided to make these attributes private instead of protected to assure the most restrictive rights
	//Some trade-offs:
	//-since attributes are private, they won't have the protected access rights
	//-to access these attributes they have to go through their Father, using getters
	private String name;
	private double ticketPrice;
	private int duration;
	
	public Festival() {
		super();
		name = "Arts";
		ticketPrice = 100.0;
		duration = 1;
		System.out.println("The Festival default constructor has been triggered...");
	}

	public Festival(int year, int month, int numberCities, String name, double ticketPrice, int duration) {
		super(year, month, numberCities);
		this.name = name;
		this.ticketPrice = ticketPrice;
		this.duration = duration;
		System.out.println("The Festival parametrized constructor has been triggered...");
	}

	public Festival(Festival otherFestival){
		this.setYear(otherFestival.getYear());
		this.setMonth(otherFestival.getMonth());
		this.setNumberCities(otherFestival.getNumberCities());
		this.name = otherFestival.name;
		this.ticketPrice = otherFestival.ticketPrice;
		this.duration = otherFestival.duration;
		System.out.println("The Festival copy constructor has been triggered...");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTicketPrice() {
		return ticketPrice;
	}
	
	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public String toString(){
		return "This " + this.getName() + " Festival will be held in " + this.getYear() + ", " + this.getMonth() + " in " 
	+ this.getNumberCities() + " cities, for " + this.getDuration() + " days, the ticket will cost " + this.getTicketPrice() + "$";
	}
	
	//The null verification in this case is redundant, because you cannot call this equals() method on a null object. 
	//The code will not compile, because the compiler will refuse to call equals() on null.
	@SuppressWarnings("null")
	public boolean equals(Festival otherFestival){
		if(otherFestival == null && otherFestival.getClass() == this.getClass()){
			return false;
		}
		return this.getYear() == otherFestival.getYear() && this.getMonth() == otherFestival.getMonth() && this.getNumberCities() == otherFestival.getNumberCities()
				&& this.getName() == otherFestival.getName() && this.getTicketPrice() == otherFestival.getTicketPrice() && this.getDuration() == otherFestival.getDuration();
	}
	
	public Festival clone() {
		return new Festival(this);
	}
}
