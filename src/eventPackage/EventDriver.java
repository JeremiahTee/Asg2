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
 * @author Jeremiah Tiongson, Yun Shi Lin
 *
 */

public class EventDriver {

	public static void main(String[] args) {
		seasonName season = null;
		
		Event BladeRunner = new Event(); //default constructor: 2017, 12, 0
		Event BladeRunner2049 = new Event(2049, 12, 10);
		
		Festival JT = new Festival(2018, 7, 1, "Beer", 50.0, 3);
		Festival YunShi = new Festival(2018, 6, 1, "Arts", 100.0 ,1);
		Festival YunShiCopy = new Festival(YunShi);
		
		Culturalfiesta CulturalJT = new Culturalfiesta(2018, 7, 1, "Beer", 70.0, 3, 5);
		
		Musicfiesta OneDirection = new Musicfiesta();
		Musicfiesta Brockhampton = new Musicfiesta(2018, 8, 23, "Brockhampton Debut", 100.0, 5, 1);
		
		SportCompetition Brazil2010 = new SportCompetition(2010, 5, 1, 60, season.SUMMER);
		SportCompetition Sotchi2012 = new SportCompetition(2012, 9, 1, 90, season.WINTER);
		
		Fair ConcordiaFair = new Fair();
		Fair McGillFair = new Fair();
		
		System.out.println(BladeRunner + "\n");
		System.out.println(BladeRunner2049 + "\n");
		System.out.println(JT + "\n");
		System.out.println(YunShi + "\n");
		System.out.println(YunShiCopy + "\n");
		System.out.println(CulturalJT + "\n");
		System.out.println(OneDirection + "\n");
		System.out.println(Brockhampton + "\n");
		System.out.println(Brazil2010 + "\n");
		System.out.println(Sotchi2012 + "\n");
		System.out.println(ConcordiaFair + "\n");
		System.out.println(McGillFair + "\n");
		System.out.println(BladeRunner.equals(BladeRunner2049) + "\n");
		System.out.println(YunShi.equals(YunShiCopy) + "\n");
		System.out.println(Brazil2010.equals(Sotchi2012) + "\n");
		System.out.println(ConcordiaFair.equals(McGillFair) + "\n");
		
	}
}
