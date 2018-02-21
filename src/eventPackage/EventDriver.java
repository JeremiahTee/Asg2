package eventPackage;

import festivalPackage.*;
import fairPackage.Fair;
import fairPackage.Fair.type;
import sportPackage.SportCompetition;
import sportPackage.SportCompetition.seasonName;

//-----------------------------------------------------
//Assignment #1
//Question: PART 1
//Written by: 
//Jeremiah Tiongson, 40055477
//Yun Shi Lin, 40055867
//-----------------------------------------------------

/**
 * Driver class
 * 
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class EventDriver {
	
	//copyFestival method making use of instaceof and clone() method of each class
	public static Event[] copyFestival(Event[] array) {
		Event[] copyArray = new Event[array.length];
		for(int i = 0; i < copyArray.length; i++) {
			//if it's a Festival class or a child of Festival then copy it
			if(array[i] instanceof Festival) {
				copyArray[i] = array[i].clone();
			}else {
				copyArray[i] = new Fair(); //if it's not a Festival, fill it with a new Fair to avoid null pointer exception
			}
		}
		return copyArray;
	}
	
	//displaArray method to display all the contents of an array
	public static void displayArray(Event[] array) {
		String s;
		System.out.println("\nHere is the information of this array:");
		for (int i = 0; i < array.length; i++)
		{
			// Obtain the class name 
			s = array[i].getClass().toString();
			s = s.substring(s.indexOf('.') + 1); //Take only class name
			System.out.print("\nThis is a " + s + " object.\n" + array[i]);

		}
	}

	public static void main(String[] args) {
		
		//Part 1
		System.out.println("-------------------Output of PART 1 below -------------------------------------------------------");
		seasonName season = null;

		Event BladeRunner = new Event(); // default constructor: 2017, 12, 0
		System.out.println();
		Event BladeRunner2049 = new Event(2049, 12, 10);
		System.out.println(); //Every object creation is seperated with a line, because multiple constructors are triggered

		Festival JT = new Festival(2018, 7, 1, "Beer", 50.0, 3);
		System.out.println();
		Festival YunShi = new Festival(2018, 6, 1, "Arts", 100.0, 1);
		System.out.println();
		Festival YunShiCopy = new Festival(YunShi);
		System.out.println();

		Culturalfiesta CulturalJT = new Culturalfiesta(2018, 7, 1, "Beer", 70.0, 3, 5);
		System.out.println();

		Musicfiesta OneDirection = new Musicfiesta();
		System.out.println();
		Musicfiesta Brockhampton = new Musicfiesta(2015, 8, 23, "Brockhampton Debut", 100.0, 5, 1);
		System.out.println();

		SportCompetition Brazil2010 = new SportCompetition(2010, 5, 1, 60, season.SUMMER);
		System.out.println();
		SportCompetition Sotchi2012 = new SportCompetition(2012, 9, 1, 90, season.WINTER);
		System.out.println();

		Fair ConcordiaFair = new Fair();
		System.out.println();
		Fair McGillFair = new Fair();
		System.out.println();

		System.out.println(BladeRunner);
		System.out.println(BladeRunner2049);
		System.out.println(JT);
		System.out.println(YunShi);
		System.out.println(YunShiCopy);
		System.out.println(CulturalJT);
		System.out.println(OneDirection);
		System.out.println(Brockhampton);
		System.out.println(Brazil2010);
		System.out.println(Sotchi2012);
		System.out.println(ConcordiaFair);
		System.out.println(McGillFair);
		System.out.println("\n\nIs BladerRunner equal to BladeRunner2049? (answer should be false) : "
				+ BladeRunner.equals(BladeRunner2049) + "\n");
		System.out.println("Is YunShi equal to YunShiCopy? (answer should be true) : " + YunShi.equals(YunShiCopy)+ "\n");
		System.out.println(
				"Is Brazil2010 equal to Sotchi2012? (answer should be false) : " + Brazil2010.equals(Sotchi2012) + "\n");
		System.out.println(
				"Is ConcordiaFair equal to McGillFair? (answer should be true) : " + ConcordiaFair.equals(McGillFair)+ "\n");

		// Creation of array of 10 Event objects
		Event[] eventArray = new Event[10];
		eventArray[0] = BladeRunner;
		eventArray[1] = BladeRunner2049;
		eventArray[2] = JT;
		eventArray[3] = YunShi;
		eventArray[4] = YunShiCopy;
		eventArray[5] = CulturalJT;
		eventArray[6] = OneDirection;
		eventArray[7] = Brockhampton;
		eventArray[8] = Brazil2010;
		eventArray[9] = Sotchi2012;

		int indexLeastCities = 0;
		int indexMostCities = 0;

		// Tracing the array
		for (int i = 0; i < eventArray.length - 1; i++) { // no need to go iterate through last element since we will do
															// i + 1
			if (eventArray[i].getNumberCities() < eventArray[i + 1].getNumberCities()) {
				indexLeastCities = i;
			}

			if (eventArray[i].getNumberCities() > eventArray[i + 1].getNumberCities()) {
				indexMostCities = i;
			}
			
			if(eventArray[i].getYear() == eventArray[i+1].getYear()) {
				System.out.println("\n" + eventArray[i]+ "\n and " + eventArray[i + 1] +
						"\n are happening at the same year, their index are " + i + " and " + (i + 1) + "\n");
			}
		}
		
		System.out.println("\nThe event with least number of cities is: " + eventArray[indexLeastCities] 
				+ "\n with an index of " + indexLeastCities);
		System.out.println("\nThe event with most number of cities is: " + eventArray[indexMostCities] 
				+ "\n with an index of " + indexMostCities);
		
		System.out.println("-------------------Output of PART 2 below -------------------------------------------------------");
		//Part 2
		// Creation of array of 12 objects
		Event[] partTwoArray = new Event[12];
		
		//Previous objects will be used, but here are two new festivals
		Festival Tarantino = new Festival(2018, 3, 1, "Film", 5000.0, 3);
		Festival XavierDolan = new Festival(2019, 2, 1, "Film", 1000.0, 2);
		
		//Filling partTwoArray with objects
		partTwoArray[0] = BladeRunner;
		partTwoArray[1] = BladeRunner2049;
		partTwoArray[2] = JT;
		partTwoArray[3] = YunShi;
		partTwoArray[4] = YunShiCopy;
		partTwoArray[5] = CulturalJT;
		partTwoArray[6] = OneDirection;
		partTwoArray[7] = Brockhampton;
		partTwoArray[8] = Brazil2010;
		partTwoArray[9] = Sotchi2012;
		partTwoArray[10] = Tarantino;
		partTwoArray[11] = XavierDolan;
		
		Event[] theCopy = copyFestival(partTwoArray); //method returning an array with copied Festival Values
		
		displayArray(partTwoArray);
		displayArray(theCopy);
		
		System.out.println("\n\n\nAs you can see, all Festivals have been copied. Since both arrays have same length,\n every spot needed to be filled with an object in order to be printed.\n"
				+ "Thus, every object which was not a Festival or a child of Festival, has been replaced with Fair.");
		
	}
}
