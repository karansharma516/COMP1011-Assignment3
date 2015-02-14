/**
 * @author karan sharma
 *@description: this is the tester class which tests the Hero GiantPlanet and TerrestrialPlanet class
 *@version: 1.5
 */
public class Tester {

	public static void main(String[] args) {
		
		GiantPlanet earth = new GiantPlanet("Earth", 56, 500, "Gas");
		System.out.println(earth.toString());
		
		TerrestrialPlanet mars = new TerrestrialPlanet("Mars", 57, 800, true);
		System.out.println(mars.toString());
		
		}

}
