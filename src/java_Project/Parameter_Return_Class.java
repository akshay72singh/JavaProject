package java_Project;

public class Parameter_Return_Class {

	public static void main(String[] args) {

		i(400, 800);
		x('d', 'f');
		r(40.5, 40.5);
	}

	public static void i(int a, int b) {
		int z = a + b;
		System.out.println(z);
	}

	public static void r(double a, double b) {
		double z = a + b;
		System.out.println(z);
	}

	public static void z(float q, float r) {
		float z = q + r;
		System.out.println(z);
	}

	public static void y(boolean k, boolean l) {
		boolean z = k;
		System.out.println(z);
	}

	public static void x(char a, char b) {
		char z = 'h';
		System.out.println(z);

		int wax = sallary_of_tester(6000, 2000, 1000);
		System.out.println(wax);
		int tax = wax * 20 / 100;

		System.out.println(tax);
		boolean r = sallary_of_human(true, true, true);
		System.out.println(r);
	}

	public static int sallary_of_tester(int hra, int pf, int base) {

		int total = hra + pf + base;
		System.out.println(total);
		boolean r = sallary_of_human(true, true, true);
		System.out.println(r);
		return total;
	}

	public static boolean sallary_of_human(boolean jai, boolean shree, boolean ram) {
		boolean total = jai;
		System.out.println(total);
		return total;
	}

	public static void min(String[] args) {
		int eye = sallary(500, 400, 300);
		System.out.println(eye);
		int kol = currency(70, 60);
		System.out.println(kol);
	}

	public static int sallary(int bsc, int hra, int pf) {
		int total = bsc + hra + pf;
		System.out.println("hiiiii");
		if (total > 1000) {
			return hra;
		}
		return total;
	}

	public static int currency(int ass, int rose) {
		int count = ass + rose;
		System.out.println("rrr");
		if (count > 100) {
			return rose;
		}
		System.out.println("tyy");
		return count;
	}

	public static void m_1_2(String[] ars) {
		char b = 98;
		b = (char) +(b - 32);
		System.out.println(b);

		boolean s = man(true);
		System.out.println(s);

		int k = open(100);
		System.out.println(k);

		long h = fish(100000);
		System.out.println(h);

		char o = dog('e');
		System.out.println(o);
	}

	public static int open(int b) {
		return b;
	}

	public static long fish(long w) {
		return w;
	}

	public static boolean man(boolean ear) {
		return ear;
	}

	public static char dog(char b) {
		return b;
	}
}
