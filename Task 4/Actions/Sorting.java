package Actions;

import java.util.ArrayList;
import java.util.Comparator;
import org.apache.log4j.Logger;
import Entity.Toys.Toy;

public class Sorting {
	private static final Logger log = Logger.getLogger(Sorting.class);
	
	////////////////////////////SORT METHODS and COMPARATORS/////////
	static Comparator<Toy> comparingByName = (toy1, toy2) -> toy1.getName().compareTo(toy2.getName());
	static Comparator<Toy> comparingByCost = (toy1, toy2) -> toy1.getCost().compareTo(toy2.getCost());
	static Comparator<Toy> comparingBySize = (toy1, toy2) -> toy1.getSize().compareTo(toy2.getSize());
	//Just by name
	public static void sortByName(ArrayList<Toy> list) {
		list.sort(comparingByName);
		log.info("successful");
	}
	
	//by Cost → Name
	public static void sortByCost(ArrayList<Toy> list) {
		list.sort(comparingByCost.thenComparing(comparingByName));
		log.info("successful");
	}
	
	//by Size → Name
	public static void sortBySize(ArrayList<Toy> list) {
		list.sort(comparingBySize.thenComparing(comparingByName));
		log.info("successful");
	}
	
	public static void insertSortByName(ArrayList<Toy> list) {
		for (int i = 1; i < list.size(); i++) {
			for (int j = i; j > 0 && comparingByName.compare(list.get(j-1), list.get(j))>=0; j--) {
					Toy tempToy = list.get(j-1);
					list.set(j-1, list.get(j));
					list.set(j, tempToy);
			}
		}
		log.info("successful");
	}
	
}
