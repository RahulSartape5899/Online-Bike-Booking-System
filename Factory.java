import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Thread;
public class Factory 
{
	private static long engNumSeq;

	static{
		System.out.println("\nclass factory is loaded");
		
		try{
			DataInputStream dis = new DataInputStream (new FileInputStream("engNumSeq.txt"));
			engNumSeq = dis.readLong();
			dis.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("engNumSeq is initialized with " +engNumSeq);
	}//sb close

	Bike[] getBikes(int noOfBikes){
		System.out.println("Factory.getBikes() execution started");

		Bike[] bikes = new Bike[noOfBikes];

		for(int i=0; i<noOfBikes; i++){
			String engNum = "ABC123PQ" + ++engNumSeq;
			String color;
			try{
			Thread.sleep(400);
			}catch(Exception e){
			}
			if((engNumSeq%2) == 0){
				color= "RED";
			}
			else{
				color= "YELLOW";
			}
			bikes[i] = new Bike(engNum, color);
		}

		try{
			DataOutputStream dos= new DataOutputStream (new FileOutputStream("engNumSeq.txt"));
			
			dos.writeLong(engNumSeq);
			dos.flush();
			dos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(noOfBikes+" bikes are manufactured");
		System.out.println("Factory.getBikes() execution is completed");
		System.out.println("Bike object returned to Showroom");

		return bikes;
	}	
}