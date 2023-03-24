package forLoopProgram;

public class JointMethod_Chaining {
	static int i = 1;

	public static void main(String[] args) {
	    m();
		m1();
		m2();
		m3();
		m4();
	}

	public static int m() {
		int f;
		for (f = 4; f < 6; f++)
			System.out.println("x=" + f);
		return f;
	}

	public static void m1() {
		for (; i < 5; ++i) {
	}
		System.out.println(m() + m() + "==i m in m1 method ");
	}
	public static int m2() {
		for (; 3 >= i; ++i) {
			for (int j = 1; j <= 3; j++) {
				System.out.print(j + "= j , I m from m2 method ");
				return j;
			}
		}
		return i;
	}

	public static void m3() {

		for (int x = 0; x < 2; x++)
			System.out.println(m());
	}

	public static void m4() {
		System.out.print(m1("ram"));
		// for (int a=1;a<5;a++)
		for (int k = 1; k < 5; k++) {
			System.out.println(k + 2);
			System.out.println(k);
		}
	}

	public static String m1(String s) {
		System.out.println(s);
		return s;
	}
}
