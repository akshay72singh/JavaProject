package String_Program;

public class Accurecce {
	public static void main(String[] args) {
		accurecce();
		naccurence2();
	}

	public static void accurecce() {
		String h = "Akshay Kumar yadav".toLowerCase();
		char bb;
		for (bb = 'a'; bb < 'z'; bb++) {
			int count = 0;
			for (int i = 0; i < h.length(); i++) {
				if (bb == h.charAt(i)) {
					count++;
				}
			}
			if (count > 0) {
				System.out.println(bb + "--" + count);
			}
		}
	}

	public static void naccurence2() {
		System.err.println("Next .....");
		
		String name = "Hii !!! I Am Akshay Kumar".toUpperCase();
		char[] arr = name.toCharArray();
		char ab;
		for (ab = 'A'; ab <= 'Z'; ab++) {
			int count = 0;
			for (int j = 0; j < name.length() - 1; j++) {
				if (ab == name.charAt(j))
					count++;
			}
			if (count > 0) {
				System.out.println(ab + "-" + count);
			}

		}

	}

}
