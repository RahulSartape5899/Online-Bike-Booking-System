import java.io.*;
import java.util.*;

class Bike {
	
		private static String brand;
		private static int wheels;
		private static int count;

		private String engNum;
		private String color;
		private String ownerName;
		private String bikeNum;

		static{
				System.out.println("\nClass Bike is loaded");
			try
			{
				Scanner scn=new Scanner(new File("companydetails.txt"));

				brand=scn.nextLine();
				wheels=scn.nextInt();

				System.out.println("Brand initialized with: "+brand);
				System.out.println("wheels initialized with: "+wheels);
			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
		} //sb close

		{
			count++;
		}//NSB close

		public Bike(String engNum, String color){
			
			if(brand==null){
				throw new RuntimeException("company.txt File not found");
			}
			this.engNum=engNum;
			this.color=color;
			System.out.println("EngNum and color initialized");			
		} //constructor close

		public String getEngNum(){
			return this.engNum;
		}

		public String getColor(){
			return this.color;
		}
		
		public String getOwnerName(){
			return this.ownerName;
		}

		public void setOwnerName(String ownerName){
			this.ownerName=ownerName;

			System.out.println("OwnerName property initialized");
		}

		public void setBikeNum(String bikeNum){
			this.bikeNum=bikeNum;

			System.out.println("BikeName property initialized");
		}

		public static int getCount(){
			return count;
		}

		public void start(){
			System.out.println(this.ownerName+" started bike "+this.bikeNum);
		}
		public void move(){	
			System.out.println(this.ownerName+" moving bike "+this.bikeNum);
		}
		public void stop(){
			System.out.println(this.ownerName+" stopped bike "+this.bikeNum);
		}
		public void display(){

			System.out.println("brand "+this.brand);
			System.out.println("color "+this.color);
			System.out.println("engNum "+this.engNum);
			System.out.println("ownerName "+this.ownerName);
			System.out.println("bikeNum "+this.bikeNum);
		}
}
