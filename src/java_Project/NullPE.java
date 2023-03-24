package java_Project;

public class NullPE {
	static NullPE x;
	int f = 44;
       int e;
	public static void main(String[] args) {
		System.out.println(" hello I am main method ....");
		x.Name();
	}

	static void N() { 
		NullPE z = new NullPE();
		System.out.println("hii bablu");
		z.Name();
		System.out.println(z.f);
	}

	void Name() {
		System.out.println("hii");
	}

	{
		System.out.println("hellu");
	}

	NullPE(String r) {
		System.out.println("ka ho,,,,,");
	}
	public static int hi = 5;
	int g = 10;
	{
		System.out.println(g);
	}

	public NullPE() {
		System.out.println(hi);
	}

	public static String abc() {

		return new String("g"); // System.out.println(g.);
	}

    public static void main() {
    	NullPE   b  = new NullPE();
	   System.out.println( b.e);
    }
	public static void main1() {
		NullPE u = new NullPE();
		System.out.println(u.ram());

	}

	{
		int k = 5;
		System.out.println(k);
	}

	public String ram() {
		return new String("hii");

	}

	NullPE avi() {

		return null;
	}
}