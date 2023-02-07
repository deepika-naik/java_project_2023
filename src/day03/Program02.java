package day03;

public class Program02 {

	public static void main(String[] args) {
		
		Program02 xyz=new Program02();
		addMethod(10,5);
		xyz.subMethod(10,5);
		xyz.mulMethod(10,6);
		
		
		addMethod(120,230);
		xyz.subMethod(110,15);
		xyz.mulMethod(10,6);
		
			
		}
	public static void addMethod(int a,int b)
	{ 
		System.out.println(a+b);
	}
		public  void subMethod(int a,int b)
			{
				System.out.println(a-b);
			}
			public void mulMethod(int a,int b)
			{
				System.out.println(a*b);
			}
	}