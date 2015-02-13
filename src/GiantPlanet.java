/**
 * 
 * @author karan sharma
 * @description Build the GiantPlanet class which is the sub class of the Planet class
 * and uses the IHasMoons and IHasRings methods
 * @version : 1.2
 *
 */
public class GiantPlanet extends Planet implements IHasMoons, IHasRings {

	// PRIVATE VARIABLES +++++++++++++++++++++++++++++++++++++++++++++++++++
	private String _type;
	
	// PUBLIC PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
	public String getType() {
		return _type;
	}
	
	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++++++++++++++++
	public GiantPlanet(String name, double diameter, double mass, String type){
		super(name, diameter, mass);		
		this._type = type;
	}
	
	// OVERRIDDEN METHODS ++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	@Override
	public Boolean HasRings() {
		
		return (this.getRingCount() > 0) ? true : false;
	}

	@Override
	public Boolean HasMoons() {
		
		return (this.getMoonCount() > 0) ? true : false;
	}

}
