package day14;
public class Program03 {

	public static void main(String[] args) {
		
				int x1[] = { 45};

		        for (int x : x1) {
		            int number = x;
		            int binary[] = new int[32];
		            int i = 0;
		            while (number > 0) {
		                binary[i++] = number % 2;
		                number = number / 2;
		            }
		            System.out.print("Binary of " + x + " = ");
		            for (int j = i - 1; j >= 0; j--) 
		            {
		                System.out.print(binary[j]);
		            }
		            System.out.println();
		        }
		    }
		}
		
