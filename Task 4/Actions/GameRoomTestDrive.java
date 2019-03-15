package Actions;

import java.io.IOException;
import java.util.Scanner;
import org.apache.log4j.Logger;
import Entity.GameRoom;
import Validation.SearchValidation;
import Validation.SortValidation;
import Validation.WrongFactoryException;

	public class GameRoomTestDrive {
	private static Logger log = Logger.getLogger(GameRoomTestDrive.class);
	public static void main(String[] args) {		
		ReaderFromTxt reader = new ReaderFromTxt();		
		GameRoom room;
		System.out.println("Input path to txt");
		try (Scanner scan = new Scanner(System.in)){
			room = reader.readFromFile(scan.nextLine());
			SortValidation.go(room);		
			SearchValidation.go(room);			
		} catch (IllegalArgumentException | IOException | WrongFactoryException e) {
			System.out.println(e);
			log.error(e);
		}		

		System.out.println("End");
	}
	


}
