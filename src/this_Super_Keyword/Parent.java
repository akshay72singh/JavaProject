package this_Super_Keyword;

public class Parent extends GrandParent {
	static int a = 109;
	int b;

	public static void main(String[] args) {
		Parent h = new Parent();
		Child obj = new Child();
	}

	public Parent(int b) {
		super();

	}

	public void m1() {
		int a = 10;
		System.out.println(a);
	}

	public Parent() {
		super();
		System.out.println("first constructor");
	}

	protected void m2(boolean a) {
		final boolean r = false;
		System.out.println(this.a);
		this.m2(a);
		System.out.println(this.a);
	}

	public void m3() {
		System.out.println("hiii");
	}
}
