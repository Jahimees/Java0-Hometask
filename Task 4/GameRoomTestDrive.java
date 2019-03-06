
import java.io.IOException;
import java.util.Scanner;

import org.apache.log4j.Logger;

import Toys.Toy.Size;
	public class GameRoomTestDrive {
	private static Logger log = Logger.getLogger(GameRoomTestDrive.class);
	
	public static void main(String[] args) {		
		ReaderFromTxt reader = new ReaderFromTxt();		
		GameRoom room;
		try (Scanner scan = new Scanner(System.in)){
			room = reader.readFromFile(scan.nextLine());
			
			room.showInfo();		  	//test	
			room.sortBySize();			//test
			room.showInfo(); 			//test
			room.sortByCost();			//test
			room.showInfo(); 			//test
			room.insertSortByName();	//test
			room.showInfo();			//test
			room.sortByName();			//test
			room.showInfo();			//test
			
			System.out.println(room.findBy(Size.AVERAGE).toString());
		} catch (IllegalArgumentException | IOException | WrongFactoryException e) {
			System.out.println(e);
			log.error(e);
		}		

		System.out.println("End");
	}
	


}
