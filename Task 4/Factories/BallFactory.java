package Factories;

import Toys.*;
import Toys.Toy.Size;

public class BallFactory implements ToyFactory {	
	@Override
	public Toy createToy(String name, double cost, Size size) {
		return new BallToy(name, cost, size);
	}
}
