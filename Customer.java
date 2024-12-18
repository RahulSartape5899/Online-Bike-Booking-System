import java.lang.Thread;

public class Customer {

	static{
		System.out.println("Customer class loaded");
	}

	public static void main(String[] args) 
	{
		try{
			Thread.sleep(700);
		System.out.println("Customer.main() execution is started");
			Thread.sleep(700);
		System.out.println("\nShowRoom.buy() method is called");
			Thread.sleep(700);
		ShowRoom bajajShowRoom = new ShowRoom();
			Thread.sleep(700);
		Bike bike = bajajShowRoom.buy();
			Thread.sleep(700);
		Bike bike1 = bajajShowRoom.buy();

			Thread.sleep(700);
		System.out.println("Back in Customer.main() method");
			Thread.sleep(700);
		System.out.println("Bike obj is return to customer"+" \nwith engNum, color and ownerName values");
			Thread.sleep(700);
		System.out.println("We must initialize Bike obj with bikeNum");
			Thread.sleep(700);
		System.out.println("RTO.setBikeNum() is called");
	
			Thread.sleep(700);

		RTO lRTO = new RTO();
		lRTO.setBikeNum(bike);

			Thread.sleep(700);
		lRTO.setBikeNum(bike1);
				
				Thread.sleep(700);
		System.out.println("back to Customer.main() method");
				Thread.sleep(700);
		System.out.println("bike obj is fully initialized");
				Thread.sleep(700);
		System.out.println("\nBike obj details");
		
		bike.display();
				Thread.sleep(700);
		bike1.display();
				Thread.sleep(700);	
	
		System.out.println("\n"+bike.getOwnerName()+" performing bike operations");

		bike.start();
		Thread.sleep(700);
		bike.move();
		Thread.sleep(700);
		bike.stop();
		Thread.sleep(700);
		System.out.println("\n");

		bike1.start();
		Thread.sleep(700);
		bike1.move();
		Thread.sleep(700);
		bike1.stop();
		Thread.sleep(700);


		System.out.println("Customer.main() execution is completed");
		}catch(Exception e){
		}
	}
}
