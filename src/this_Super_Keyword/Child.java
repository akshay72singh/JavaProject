package this_Super_Keyword;

 public class Child  extends Parent {
	public static void main(String[] args) {
		Parent b = new Child();
		System.out.println(b.a);
	}

	public void a2() {
		System.out.println("i am non static method");
	}

	public  void m3() {
	    System.out.println("jio");
	}
	Child(int u,boolean d){
		super();
	}
	Child() {
		this(9);
		
		System.out.println("Non-parameterised constructer of child class");
		super.m1();
	}

	public Child(int a) {
		super();
		System.out.println("parameterised constructer of child class");
	}

}
