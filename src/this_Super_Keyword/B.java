package this_Super_Keyword;

public class B extends A{
static B b;
static B g;
	public static void main(String[] args) {

		 b = new B();
		 g=b;
		b.aM1();
		b.aM2();
		b.bM1();
		A a= new A();
		A ab = new B();
		
	}
public void bM1() {
	System.out.println("metho of bM1");
}
public void bM2() {
	System.out.println("metho of bM2");

}




}
