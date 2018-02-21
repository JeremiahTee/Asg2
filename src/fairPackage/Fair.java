package fairPackage;

import eventPackage.Event;
//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------
import sportPackage.SportCompetition;

/**
 * 
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class Fair extends Event{
	private int exibitors;
	public enum type {CAREER, SCIENCE, TRADE, TRAVEL}
	type type;
	
	public Fair() {
		super();
		exibitors = 1;
		type = type.SCIENCE;
		System.out.println("The Fair default constructor has been triggered...");
	}

	public Fair(int year, int month, int numberCities, int exibitors, type type) {
		super(year, month, numberCities);
		this.exibitors = exibitors;
		this.type = type;
		System.out.println("The Fair parametrized constructor has been triggered...");
	}
	
	public Fair(Fair otherFair) {
		super(otherFair);
		this.exibitors = otherFair.exibitors;
		this.type = otherFair.type;
		System.out.println("The Fair copy constructor has been triggered...");
	}

	public int getExibitors() {
		return exibitors;
	}
	
	public void setExibitors(int exibitors) {
		this.exibitors = exibitors;
	}
	
	public type getType() {
		return type;
	}

	public void setType(type type) {
		this.type = type;
	}

	
	public String toString(){
		return "This Event will be held in " + this.getYear() + ", " + this.getMonth() + " in " + this.getNumberCities() + " cities"
				+ " and has " + this.getExibitors() + " exibitors" + " and is type " + this.getType();
	}
	
	//The null verification in this case is redundant, because you cannot call this equals() method on a null object. 
	//The code will not compile, because the compiler will refuse to call equals() on null.
	@SuppressWarnings("null")
	public boolean equals(Fair otherFair){
		if(otherFair == null && otherFair.getClass() == this.getClass()){
			return false;
		}
		return this.getYear() == otherFair.getYear() && this.getMonth() == otherFair.getMonth() && this.getNumberCities() == otherFair.getNumberCities()
				&& this.getExibitors() == otherFair.getExibitors() && this.type == otherFair.type;
	}
	
	public Fair clone() {
		return new Fair(this);
	}
}
