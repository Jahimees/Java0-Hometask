package Actions;

import java.util.ArrayList;
import org.apache.log4j.Logger;
import Entity.Toys.Toy;
import Entity.Toys.Toy.Size;

public class Searching {
	private static final Logger log = Logger.getLogger(Searching.class);

	///////////////////////////FIND METHODS//////////////////////
	public static ArrayList<Toy> findBy(Size size, ArrayList<Toy> list) {
		ArrayList<Toy> returnList = new ArrayList<Toy>();
		for (int i = 0; i < list.size(); i++) {			
			if (list.get(i).getSize() == size) {
				returnList.add(list.get(i));
			}
		}
		log.info("Searching by size was complete successful");
		return returnList;
	}

	public static ArrayList<Toy> findBy(String name, ArrayList<Toy> list) {
		ArrayList<Toy> returnList = new ArrayList<Toy>();
		for (int i = 0; i < list.size(); i++) {			
			if (list.get(i).getName().equals(name)) {				
				returnList.add(list.get(i));
			}
		}
		log.info("Searching by name was complete successful");
		return returnList;
	}

	public static ArrayList<Toy> findBy(double cost, ArrayList<Toy> list) {
		ArrayList<Toy> returnList = new ArrayList<Toy>();
		for (int i = 0; i < list.size(); i++) {			
			if (list.get(i).getCost().equals(cost)) {
				returnList.add(list.get(i));				
			}
		}
		log.info("Searching by cost was complete successful");
		return returnList;
	}
	
	
}
