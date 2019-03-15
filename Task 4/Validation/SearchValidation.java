package Validation;

import org.apache.log4j.Logger;

import Actions.Searching;
import Entity.GameRoom;
import Entity.Toys.Toy.Size;

public class SearchValidation {
	private static final Logger log = Logger.getLogger(SearchValidation.class);
	
	
	public static void go(GameRoom room) {
		System.out.println(Searching.findBy(Size.AVERAGE, room.getToysList()).toString());
		System.out.println(Searching.findBy("Аркадий", room.getToysList()).toString());
		System.out.println(Searching.findBy(123.0, room.getToysList()).toString());
		log.info("Search validation ends successful");
	}
}
