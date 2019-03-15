package Entity;
import java.util.ArrayList;
import org.apache.log4j.Logger;
import Entity.Toys.*;

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
