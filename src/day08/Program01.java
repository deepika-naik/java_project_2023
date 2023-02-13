package day08;

import java.util.Scanner;

public class Program01 {
	
public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter Int Value of a");
		int a=x.nextInt();
		System.out.println("Enter Int Value of b");
		int b=x.nextInt();
		System.out.println("Enter Int Value of c");
		int c=x.nextInt();
		x.close();
		if(a>b)
		{
			System.out.println("a is greater");
			
		}
		else if(b>c)
		{
			System.out.println(" b is greater");
			
		}
		else
		{
			System.out.println("c is greater");
		}

}
}
