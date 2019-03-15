package Entity.Factories;

import Entity.Toys.*;
import Entity.Toys.Toy.Size;

public class CubeFactory implements ToyFactory {
	@Override
	public Toy createToy(String name, double cost, Size size) {		
		return new CubeToy(name, cost, size);
	}

}
