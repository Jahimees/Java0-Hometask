package Factories;

import Toys.*;
import Toys.Toy.Size;

public class CarFactory implements ToyFactory {
	@Override
	public Toy createToy(String name, double cost, Size size) {
		return new CarToy(name, cost, size);
	}
}
