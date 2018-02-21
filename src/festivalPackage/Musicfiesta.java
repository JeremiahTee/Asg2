package festivalPackage;

import festivalPackage.Festival;
//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------

/**
* Musicfiesta class
* @author Jeremiah Tiongson, Yun Shi Lin
*
*/

public class Musicfiesta extends Festival{
	private int numberBands;
	
	public Musicfiesta() {
		super();
		numberBands = 1;
		System.out.println("The Musicfiesta default constructor has been triggered...");
	}

	public Musicfiesta(int year, int month, int numberCities, String name, double ticketPrice, int duration, int bands) {
		super(year, month, numberCities, name, ticketPrice, duration);
		numberBands = bands;
		System.out.println("The Musicfiesta parametrized constructor has been triggered...");
	}
	
	public Musicfiesta(Musicfiesta otherMusicfiesta) {
		super(otherMusicfiesta);
		numberBands = otherMusicfiesta.numberBands;
		System.out.println("The Musicfiesta copy constructor has been triggered...");
	}

	public int getNumberBands() {
		return numberBands;
	}

	public void setNumberBands(int numberBands) {
		this.numberBands = numberBands;
	}
	
	public String toString(){
		return "This " + this.getName() + " Culturalfiesta will be held in " + this.getYear() + ", " + this.getMonth() + " in " 
	+ this.getNumberCities() + " cities, for " + this.getDuration() + " days, the ticket will cost " + this.getTicketPrice() + "$,"
			+ "and has " + this.getNumberBands() + " number of bands";
	}
	
	//The null verification in this case is redundant, because you cannot call this equals() method on a null object. 
	//The code will not compile, because the compiler will refuse to call equals() on null.
	@SuppressWarnings("null")
	public boolean equals(Musicfiesta otherMusicfiesta){
		if(otherMusicfiesta == null && otherMusicfiesta.getClass() == this.getClass()){
			return false;
		}
		return this.getYear() == otherMusicfiesta.getYear() && this.getMonth() == otherMusicfiesta.getMonth() && this.getNumberCities() == otherMusicfiesta.getNumberCities()
				&& this.getName() == otherMusicfiesta.getName() && this.getTicketPrice() == otherMusicfiesta.getTicketPrice() && this.getDuration() == otherMusicfiesta.getDuration()
				&& this.getNumberBands() == otherMusicfiesta.getNumberBands();
	}
	
	public Musicfiesta clone() {
		return new Musicfiesta(this);
	}
}
