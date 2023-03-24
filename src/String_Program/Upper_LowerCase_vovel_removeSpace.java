package String_Program;

import java.util.Iterator;

public class Upper_LowerCase_vovel_removeSpace {

	public static void main(String[] args) {
		upperCase();
		lowerCase();
		vovel();
		AllCharactor();
		removeSpace();
	}
	
	public static void upperCase() {
		String word = "Hii i am aksIUYYay kumar";
		char[] g = word.toCharArray();
		for (int i = 0; i < g.length; i++) {
			if (g[i] >= 'a' && g[i] <= 'z') {
				g[i]-=32;
			}
			System.out.print(g[i]);
		}
		System.out.println();
	}

	public static void lowerCase() {
		System.err.println("Next...");
		String name = "HII i am akshay KUMAR";
		char[] brk = name.toCharArray();
		for (int i = 0; i < brk.length; i++) {
			if (brk[i] >= 'A' && brk[i] <= 'Z') {
				brk[i]+=32;
			}
			System.out.print(brk[i]);
		}
		System.out.println();
		}
	public static void vovel() {
		System.err.println("Next...");
		String name = "Hii i Am akshay kumar".toLowerCase();
		char[] n = name.toCharArray();
		int count =0;
		System.out.print("number of vovel :");
		for (int i = 0; i < n.length; i++) {
			if (n[i] == 'a' || n[i] == 'e' || n[i] == 'i' || n[i] == 'o' || n[i] == 'u') {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void AllCharactor() {
		System.err.println("Next...");
		String sentence = "ajndw234@#$%56yui".toUpperCase();
		char g[] = sentence.toCharArray();
		for (int i = 0; i < g.length; i++) {
//			if(g[i]>=1||g[i]<=9) {
//				System.out.println("it is number"+g[i]);
//			} 
			if (g[i] >= 65 && g[i] <= 90) {
				System.out.println("char :-" + g[i]);
			} else {
				System.out.println("It is specel  charector" + g[i]);
			}
		}
	}

	public static void removeSpace() {
		String s = "hii i am akshay kumar";
//		char k[]= sentence.toCharArray();
//		String []k=sentence.split(" ");
		String g = "";
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) != ' ') {
//					System.out.println(
				g = g + s.charAt(i);

			}
		}
//		System.out.println(g);
	}
}