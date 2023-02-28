package day13;

public class Program03 {

	public static void main(String[] args) {
		int[] x1= {10,1,20,23,45,65,78,92,100,2};
		for(int x:x1)
		{
		boolean a=true;
		for(int i=2;i<x ;i++)
		{
			
			
				if(x%i==0)
				{
				a=false;
			break;
		}
	}
		
		if(x<=1)
			a=false;
			
if(a)
{ 
	System.out.println(x);
}
}
}
	}