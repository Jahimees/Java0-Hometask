package Factories;

import Toys.*;
import Toys.Toy.Size;

public interface ToyFactory {
	Toy createToy(String name, double cost, Size size);
}
