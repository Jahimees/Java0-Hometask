import java.io.*;

import org.apache.log4j.Logger;

import Factories.*;
import Toys.Toy.Size;

public class ReaderFromTxt {
	private BufferedReader reader;
	private static final Logger log = Logger.getLogger(ReaderFromTxt.class);
	
	public GameRoom readFromFile(String path) throws IOException, IllegalArgumentException, WrongFactoryException {		
		log.info("Trying connect to file...");
		reader = new BufferedReader(new FileReader(path));	
		
		String nextLine;
		GameRoom gameRoom = new GameRoom();
		
		while (reader.ready()) {
			nextLine = reader.readLine();
			if (nextLine.split("!").length >= 3) {
				nextLine = deleteExtraTokens(nextLine);		
				String[] literals = new String[4];
				literals = nextLine.split("!", 4);				
				
				//[0] - type; [1] - name; [2] - cost; [3] - size;
				Size size = Size.valueOf(literals[3].toUpperCase());
				gameRoom.add(whatFactory(literals[0]).createToy(literals[1], Double.parseDouble(literals[2]), size));				
			} else {
				if (nextLine.split(":")[0].equals("balance")) {
					gameRoom.setBalance(Double.parseDouble(nextLine.split(":")[1]));		
				}
			}
		}	
		
		reader.close();
		return gameRoom;		
	}
	
	//delete '!' that stay before all values. Input value can't be empty. 
	//Ex: !!!type!name!cost!size!!!! -> type!name!cost!size
	public String deleteExtraTokens(String sickString) {
		while (sickString.toCharArray()[0] == '!') {
			sickString = sickString.substring(1);
		}
		while (sickString.charAt(sickString.length()-1)=='!') {
			sickString = sickString.substring(0, sickString.length()-1);
		}		
		log.info("Extra tokens was deleted");
		return sickString;
	}
		
	public ToyFactory whatFactory(String typeFactory) throws WrongFactoryException {		
		switch (typeFactory.toLowerCase()) {
			case "doll": return new DollFactory();
			case "ball": return new BallFactory();
			case "cube": return new CubeFactory();
			case "car": return new CarFactory();
			default: {
				log.error("factory "+typeFactory+" doesn't exist");	
				throw new WrongFactoryException(typeFactory); 			
			}
		}
	}

}
