package day04.test01;

public class Program02 extends Program01 {

	public static void main(String[] args) {
		addMethod(10,10);
		mulMethod(3,2);
		sqrtMethod(10);
		Program01 x=new Program01();
		x.addMethodNonstatic(100,10);
		x.mulMethodNonstatic(30, 20);
		x.sqrtMethodNonstatic(4);

	}

}
