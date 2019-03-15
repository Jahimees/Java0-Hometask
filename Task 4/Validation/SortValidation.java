package Validation;

import org.apache.log4j.Logger;

import Actions.Sorting;
import Entity.GameRoom;

public class SortValidation {
	
	private static final Logger log = Logger.getLogger(SortValidation.class);
		
	public static void go(GameRoom room) {
		room.showInfo();		  	
		Sorting.sortBySize(room.getToysList());
		room.showInfo(); 			
		Sorting.sortByCost(room.getToysList());
		room.showInfo(); 			
		Sorting.insertSortByName(room.getToysList());	
		room.showInfo();			
		Sorting.sortByName(room.getToysList());
		room.showInfo();			
		
		log.info("Sorting validation ends successful");
	}
}
