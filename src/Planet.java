/**
 * @author Karan Sharma
 * @Description: Build the abstract class Planet in which describes the properties of planet.
 * @Date: February 13, 2015
 * @version: 1.0
 *
 */

public abstract class Planet {
  
	// PRIVATE VARIABLES +++++++++++++++++++++++++++++++++++++++++++++++++
	private double _diameter;
	private double _mass;
	private int _massCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;
	
	// PUBLIC PROPERTIES ++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public double getDiameter(){
		return this._diameter;
	}
	
	public double getMass(){
		return this._mass;
	}
	
	public int getMoonCount(){
		return this._massCount;
	}
	
	
	public String getName(){
		return this._name;
	}
	
	public double getOrbitalPeriod(){
		return this._orbitalPeriod;
	}
	
	public int getRingCount(){
		return this._ringCount;
	}
	
	
	public double getRotationPeriod(){
		return this._rotationPeriod;
	}
	
	
	// SETTERS +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	public void setMoonCount(int _massCount){
		this._massCount = _massCount;
	}
	
	public void setOrbitalPeriod(double _orbitalPeriod){
		this._orbitalPeriod = _orbitalPeriod;
	}
	
	public void setRingCount(int _ringCount){
		this._ringCount = _ringCount;
	}
	
	public void setRotationPeriod(double _rotationPeriod){
		this._rotationPeriod = _rotationPeriod;
	}
	
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	/**
	 * This constructor set the name, diameter, mass to the instance variable
	 * @param name the name of the planet
	 * @param diameter the diameter of the planet
	 * @param mass the mass of the planet
	 */
	public Planet(String name, double diameter, double mass){
		this._name = name;
		this._diameter = diameter;
		this._mass = mass;
	}
	
	@Override
	public String toString(){
		return "Planet name: " + this._name + "\nDiameter: " + this._diameter + "\nMass: " + this._mass;
	}
	
}
