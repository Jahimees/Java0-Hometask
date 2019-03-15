package Entity.Factories;

import Entity.Toys.*;
import Entity.Toys.Toy.Size;

public class DollFactory implements ToyFactory {
	@Override
	public Toy createToy(String name, double cost, Size size) {
		return new DollToy(name, cost, size);
	}



}
