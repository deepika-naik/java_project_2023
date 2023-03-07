package day15;

import java.util.Arrays;
import java.util.HashSet;

public class Program03 {

	public static void main(String[] args) {
		HashSet <Integer>x=new HashSet<>();
		x.add(10);
		x.add(30);
		x.add(20);
		x.add(40);
		System.out.println(x);
		x.add(10);
		x.add(30);
		x.add(20);
		x.add(40);
	
		System.out.println(x);
		x.remove(10);
		System.out.println(x);
		Integer[] y= {30,50,60,10,70,90,80,30};
		x.addAll(Arrays.asList(y));
System.out.println(x);

Integer[]z= {30,90,66};
x.removeAll(Arrays.asList(z));
System.out.println(x);
Integer[]a1= {10,20,40};
System.out.println(x.containsAll(Arrays.asList(a1)
		));

Integer[]a2= {10,20,30,40};
System.out.println(x.containsAll(Arrays.asList(a2)));
System.out.println(x);


System.out.println(x.isEmpty());
x.clear();
System.out.println(x);
System.out.println(x.isEmpty());





















}
}