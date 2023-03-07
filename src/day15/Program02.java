package day15;

import java.util.ArrayList;
import java.util.Arrays;

public class Program02 {

	public static void main(String[] args) {
		ArrayList<Integer> x=new ArrayList<>();
		x.add(10);
		x.add(30);
		x.add(20);
		x.add(40);
		System.out.println(x);
		System.out.println(x.get(0));
		x.add(10);
		x.add(30);
		x.add(20);
		x.add(40);
		System.out.println(x);

	
	
		
x.remove(7);
System.out.println(x);

x.remove(6);
System.out.println(x);
x.remove(5);
System.out.println(x);


x.remove(4);
System.out.println(x);
System.out.println(x.size());
System.out.println(x.get(0));
x.remove(0);
System.out.println(x.get(0));
Integer[] y= {50,60,10,70,90,80};


x.addAll(Arrays.asList(y));
System.out.println(x);
Integer[]z= {30,90,66};
x.removeAll(Arrays.asList(z));
System.out.println(x);
System.out.println(x);
System.out.println(x.contains(60));
System.out.println(x.contains(600));
Integer[] a1= {10,20,40};
System.out.println(x.containsAll(Arrays.asList(a1)));
Integer[] a2= {10,20,30,40};
System.out.println(x.containsAll(Arrays.asList(a2)));
System.out.println(x);
x.add(2,66);
System.out.println(x);
x.set(2, 666);
System.out.println(x);
System.out.println(x.isEmpty());
x.clear();
System.out.println(x);

System.out.println(x.isEmpty());












	}

}
