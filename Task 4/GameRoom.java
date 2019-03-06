
import java.util.ArrayList;
import java.util.Comparator;

import org.apache.log4j.Logger;

import Toys.*;
import Toys.Toy.Size;
public class GameRoom {
	private static final Logger log = Logger.getLogger(GameRoom.class);
	private ArrayList<Toy> toysList = new ArrayList<Toy>();
	private double balance;	
	
	////////////////////////////ADD TO LIST METHOD///////////////
	public void add(Toy toy) {
		if (balance - toy.getCost() >= 0) {
			toysList.add(toy);
			log.info("Toy "+toy+" was puted to list");
			setBalance(getBalance()-toy.getCost()); //change balance
		} else {	
			log.warn(toy.toString()+" can't be puted to list. Balance is over");
		}
	}
	
	///////////////////////////OUTPUT ALL TOYS//////////////////////
	public void showInfo(){
		for (int i = 0; i < toysList.size(); i++) {		
			System.out.println(toysList.get(i).toString());
		}
		System.out.println("balance: "+balance);
		System.out.println("==============================");
	}	

	////////////////////////////SORT METHODS and COMPARATORS/////////
	Comparator<Toy> comparingByName = (toy1, toy2) -> toy1.getName().compareTo(toy2.getName());
	Comparator<Toy> comparingByCost = (toy1, toy2) -> toy1.getCost().compareTo(toy2.getCost());
	Comparator<Toy> comparingBySize = (toy1, toy2) -> toy1.getSize().compareTo(toy2.getSize());
	//Just by name
	public void sortByName() {
		toysList.sort(comparingByName);
		log.info("successful");
	}
	
	//by Cost → Name
	public void sortByCost() {
		toysList.sort(comparingByCost.thenComparing(comparingByName));
		log.info("successful");
	}
	
	//by Size → Name
	public void sortBySize() {
		toysList.sort(comparingBySize.thenComparing(comparingByName));
		log.info("successful");
	}
	
	public void insertSortByName() {
		for (int i = 1; i < toysList.size(); i++) {
			for (int j = i; j > 0 && comparingByName.compare(toysList.get(j-1), toysList.get(j))>=0; j--) {
					Toy tempToy = toysList.get(j-1);
					toysList.set(j-1, toysList.get(j));
					toysList.set(j, tempToy);
			}
		}
		log.info("successful");
	}
	
	
	///////////////////////////FIND METHODS//////////////////////
	public ArrayList<Toy> findBy(Size size) {
		ArrayList<Toy> returnList = new ArrayList<Toy>();
		for (int i = 0; i < toysList.size(); i++) {			
			if (toysList.get(i).getSize() == size) {
				returnList.add(toysList.get(i));
			}
		}
		log.info("Searching by size was complete successful");
		return returnList;
	}
	
	public ArrayList<Toy> findBy(String name) {
		ArrayList<Toy> returnList = new ArrayList<Toy>();
		for (int i = 0; i < toysList.size(); i++) {			
			if (toysList.get(i).getName() == name) {				
				returnList.add(toysList.get(i));
			}
		}
		log.info("Searching by name was complete successful");
		return returnList;
	}
	
	public ArrayList<Toy> findBy(double cost) {
		ArrayList<Toy> returnList = new ArrayList<Toy>();
		for (int i = 0; i < toysList.size(); i++) {			
			if (toysList.get(i).getCost() == cost) {
				returnList.add(toysList.get(i));				
			}
		}
		log.info("Searching by cost was complete successful");
		return returnList;
	}
	
	///////////////////////////GETTERS AND SETTERS///////////////
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<Toy> getToysList() {
		return toysList;
	}

}
