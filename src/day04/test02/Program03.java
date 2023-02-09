package day04.test02;

import day04.test01.Program01;

public class Program03 extends Program01 {

	public static void main(String[] args) {
		
		addMethod(10,10);
		mulMethod(3,2);
		Program03 x=new Program03();
		x.addMethodNonstatic(100,10);
		x.mulMethodNonstatic(30, 20);
	}

}
