package day10;

import java.util.Scanner;

public class Program6 {
	

	public static void name() 
	{ 
		
	
	        System.out.println("lenovo-L1");
	        System.out.println("oppo-O1");
	        System.out.println("galaxy-G1");
	        System.out.println("vivo-V1");
	    }
	    
	    public static void colour() {
	        System.out.println("L1=black" );
	        System.out.println("O1=green");
	        System.out.println("G1=silver");
	        System.out.println("V1=white");
	    }
	    
	    public static void cost() {
	        System.out.println("L1=$ 15,000");
	        System.out.println("O1= $ 25000");
	        System.out.println("G1= $35,000");
	        System.out.println("V1= $ 45,000");
	    }
	    public static void stock() {
	        System.out.println("L1=5");
	        System.out.println("O1=3");
	        System.out.println("G1=2");
	        System.out.println("V1=0");
	    }

	public static void main(String[] args) {
		name();
		colour();
		cost();
		stock();
		Scanner x=new Scanner(System.in);
			System.out.println("enter customer required buzet:");
			int buzet=x.nextInt();
			






	
		
	 if(buzet<=15000)
		{
			System.out.println(" customer can buy Lenovo-L1. Available stock: 5");
		}
			
			
	 
	 

	 
	 else  if( buzet<=25000)
		{

			System.out.println("customer can buy oppo-O1. Available stock:3");
		}
	  
	


			
		
	 else if(  buzet<=35000)
		{
			System.out.println("customer can buy Galaxy-G1. Available stock:2");
		}
		

		
	 else
		{
			System.out.println("customer can buy vivo-V1. Available stock:nill");
		}
		
	


	}

}
