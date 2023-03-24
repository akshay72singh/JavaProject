package this_Super_Keyword;

public abstract class GrandParent {

	public static void main(String[] args) {

	}

	public abstract void m3();

	public GrandParent() {
		System.out.println("i am GrandParent const");
	}

	protected GrandParent(int s) {

		System.out.println("i am protected const GrandParent");
	}

	public void k1() {
		System.out.println("");
	}

	public static void v(int a) {
         System.out.println("i am paramitrize methid");
	}

}
