import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RTO{
	private static long bikeNumSeq;
	
	static{
		System.out.println("class RTO is loaded");

		try{
			DataInputStream dis = new DataInputStream (new FileInputStream ("bikeNumSeq.txt"));
			bikeNumSeq = dis.readLong();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
		System.out.println("bikeNumSeq is initialized with "+bikeNumSeq);
	}

	public void setBikeNum(Bike bike){

		System.out.println("RTO.setBikeNum() execution started");

		bike.setBikeNum("MH 24 RS "+ ++bikeNumSeq);
		System.out.println("Bike number stored in bike object");

		try{
			DataOutputStream dos = new DataOutputStream (new FileOutputStream ("bikeNumSeq.txt"));
			dos.writeLong(bikeNumSeq);
			dos.flush();
			dos.close();
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		System.out.println("setBikeNum() executed successfully");
		System.out.println("Control is return to class customer");
	}
}