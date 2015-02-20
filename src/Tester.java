/**
 *@author karan sharma
 *@description: this is the tester class which tests the Hero GiantPlanet and TerrestrialPlanet class
 *@version: 1.5
 */

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// call the the waitForAnyKey here
		waitForAnyKey();
		
		GiantPlanet giantPlanet = new GiantPlanet("Earth", 56, 500, "Gas");
		System.out.println(giantPlanet.toString());
	
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		TerrestrialPlanet terrestrialPlanet = new TerrestrialPlanet("Mars", 57, 800, true);
		System.out.println(terrestrialPlanet.toString());
		
		}
	
	//This method ask user to press the key to continue
	public static void waitForAnyKey() {
		String key;
		
	    System.out.println("Please Enter Any Key To Continue");
	    Scanner input=new Scanner(System.in);
	    key = input.next();
	    
		}

}
