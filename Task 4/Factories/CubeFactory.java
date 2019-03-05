package Factories;

import Toys.*;
import Toys.Toy.Size;

public class CubeFactory implements ToyFactory {
	@Override
	public Toy createToy(String name, double cost, Size size) {		
		return new CubeToy(name, cost, size);
	}

}
