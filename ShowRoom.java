import java.util.Scanner;
public class ShowRoom 
{
	private Scanner scn;
	private Factory bajaj;
	private Bike[] bikes;
	private int index;

	static{
		System.out.println("\nClass showroom is loaded");
	}

	public ShowRoom(){

		scn = new Scanner(System.in);
		bajaj = new Factory();
		bikes = bajaj.getBikes(10);
		index = 0;
		
		System.out.println("Bikes are stored in showroom");
		System.out.println("Showroom class object created");
	}

	public Bike buy(){
		System.out.println("Showroom.buy() execution started");

		if((bikes==null) || (index==bikes.length)){
			bikes = bajaj.getBikes(10);
		}

		System.out.println("Customer selecting one Bike");
		
		Bike bike = bikes[index];

		System.out.println("Customer selected one bike");
		System.out.println("Customer registering a bike");
		System.out.print("Enter Owner name: ");

		bike.setOwnerName(scn.nextLine());
		
		System.out.println("Bike is registered on this customer name");
		System.out.println("Removing bike from showroom");

		bikes[index] = null;
		index++;
		System.out.println("Bike has removed from Showroom");
		System.out.println("Customer has taken bike out of showroom");
		System.out.println("ShowRoom.buy() execution completed");
		System.out.println("Bike object returned to customer");

		return bike;
	}
}
