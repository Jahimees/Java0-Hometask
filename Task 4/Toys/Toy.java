package Toys;

public abstract class Toy {
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
			System.out.println("Name can't be empty. Set default: 'no name'");
			this.name = "no name";
		}
		this.name = name;
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
			System.out.println(this.getName()+" has a negative value. Default cost = 100");
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
	}
}
