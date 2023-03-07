package day14;

public class Program02 {

	public static void main(String[] args) {
		int x1[]= {1101,101,157};
		{	
	for(int i=0;i<x1.length;i++) {
						
						


						int  number =x1[i];
						int decimal = 0;
			            int power = 0;
				while(number>0)
				{
			            
					int digit = number % 10;
					number=number/10;
			        decimal += digit * Math.pow(2, power);
			        power++;
			    	
			        
			        

			            
					}
				System.out.println("Binary " + x1[i] + " = Decimal " + decimal);
			}
		}
		


		
}}
