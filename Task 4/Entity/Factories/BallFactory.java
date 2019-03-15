package Entity.Factories;

import Entity.Toys.*;
import Entity.Toys.Toy.Size;

public class BallFactory implements ToyFactory {	
	@Override
	public Toy createToy(String name, double cost, Size size) {
		return new BallToy(name, cost, size);
	}
}
