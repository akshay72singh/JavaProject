package java_Project;

public class Aadhar_Card_Creat {

	public static void main(String[] args) {
		Aadhar_Card_Creat b = new Aadhar_Card_Creat();
		String x = aadhar_user(" name     = akshay kumar yadav ");
		System.out.println(x);

		String y = Father_name("Father name = Shyam sundar yadav");
		System.out.println(y);

		String z = mother_name("mother name = usha devi");
		System.out.println(z);

		String n = "age = ";
		System.out.println(n + b.Age(20));

		String o = "mobile no = ";
		System.out.println(o + b.Mobile_no(987654321));

		String a = User_vill(" vill = rayan");
		System.out.println(a);

		String c = User_distric("distric = bhadohi");
		System.out.println(c);

		String d = User_state(" state = Uttar pradesh");
		System.out.println(d);

		long k = Aadhar_no(1234567890);
		String l = "aadhar no = ";
		System.out.println(l + k);

	}

	public static String aadhar_user(String a) {
		return a;
	}

	public static long Aadhar_no(long b) {
		return b;
	}

	public static String Father_name(String c) {
		return c;
	}

	public static String mother_name(String d) {
		return d;
	}

	public int Age(int e) {
		return e;
	}

	public static long Mobile_no(long f) {

		return f;
	}

	public static String User_vill(String g) {
		return g;
	}

	public static void User_post(String h) {
		System.out.println(h);
	}

	public static String User_distric(String i) {
		return i;
	}

	public static String User_state(String j) {
		return j;
	}

}
