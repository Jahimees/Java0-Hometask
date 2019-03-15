package Entity.Factories;

import Entity.Toys.*;
import Entity.Toys.Toy.Size;

public interface ToyFactory {
	Toy createToy(String name, double cost, Size size);
}
