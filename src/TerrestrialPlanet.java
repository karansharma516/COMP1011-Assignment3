/**
 * 
 * @author karan sharma
 * @description Build the TerrestrialPlanet class which is the sub class of the Planet class
 * and uses the IHasMoons and IHabitable interfaces
 * @version : 1.4
 *
 */
public class TerrestrialPlanet extends Planet implements IHasMoons, IHabitable {

	// PRIVATE VARIABLES +++++++++++++++++++++++++++++++++++++++++++++++++
	private boolean _oxygen;
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public TerrestrialPlanet(String name, double diameter, double mass, boolean oxygen){
		super(name, diameter, mass);
		this._oxygen = oxygen;
	}
	
	// OVERRIDDEN METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public Boolean Habitable() {
		
		return (this._oxygen == true) ? true : false;
	}

	@Override
	public Boolean HasMoons() {
		
		return (this.getMoonCount() > 0) ? true : false;
	}

}
