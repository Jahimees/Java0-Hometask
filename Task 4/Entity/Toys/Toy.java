package Entity.Toys;

import org.apache.log4j.Logger;

public abstract class Toy {
	private static final Logger log = Logger.getLogger(Toy.class);
	public enum Size {SMALL, AVERAGE, BIG};
	private Size size;
	private String name;
	private double cost;
	
	///////////////////GETTERS&SETTERS////////////////////
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	//
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if (name.equals("")) {
			this.name = "no name";
			log.warn("Input name was empty. Set default: 'no name'");			
		} else {
			this.name = name;
		}
	}
	//
	public Double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		if (cost > 0) {
			this.cost = cost;
		} else {
			this.cost = 100;
			log.warn("Input cost had a negative value. Set default cost = 100");
		}
	}
	
	@Override
	public String toString() {
		return this.getClass().toString()+","+" name: "+name+", cost: "+cost+", size: "+size;		
	}
	
	/////////////////CONSTRUCTORS////////////////////////
	Toy(String name, double cost, Size size) {
		this.setName(name);
		this.setCost(cost);
		this.setSize(size);
		log.info("Toy "+name+" was successful created!");
	}
}
