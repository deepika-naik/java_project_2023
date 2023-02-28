package day12;

public class Program04 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			boolean x=true;
			for(int j=1;j<=i;j++)
			{
				if(x)
				{
				System.out.print(i+"\t");
				x=false;
				}
				else
				{
					System.out.print(i*i+"\t");
					x=true;
				}
			}
			System.out.println();
		}

	}

}
