package Inheritance;
  //    vae arg - method

public class Test {

	public static void main(String[] args) {

		Child a = new Child();
		a.m1(10);
		//a.m1(10,10,10);

		Parent b = new Child();
		b.m1(10);
		
		Parent c= new Parent();
		c.m1(10);
	}

}
