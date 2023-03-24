package Var_Arg;

public class VarArgs {

	public static void main(String[] args) {

		m1(4);
        m1("akshay");
        m1("ramu");
	}

	public static void m1(int b, int... h) {
		System.out.println("Var arg and simpal mathod");

	}

	public static void m1(int r) {
		System.out.println("Only simple method");
	}

	public static void m1(int... is) {
		System.out.println("Only var arg method");
	}

	public static void m1(String... p) {
		System.out.println("String var arg method");
	}

	public static void m1(Object h, String... p) {
		System.out.println("String var arg and object method");
	}

	public static Object m1(String t, String... p) {
		System.out.println("String var arg and object method");
		return null;
	}
	public static Object m1(String t) {
		System.out.println("String var arg and object method");
		return null;
	}

}