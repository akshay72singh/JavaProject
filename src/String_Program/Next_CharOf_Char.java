package String_Program;

public class Next_CharOf_Char {

	public static void main(String[] args) {
		forwerdChar1();
		forwerdChar2();
		forwerdChar3();
	}
	public static void forwerdChar1() {
	String m= "mohan";
	char[]j=m.toCharArray();
	for (int i = 0; i < j.length; i++) {
		System.out.print(++j[i]);
	}
	System.out.println();
	}
	public static void forwerdChar2() {
		System.err.println("  Next.....");
		String word = "yaduvanshi";
		for (int j = 0; j < word.length(); j++) {
			
				int change = (char)word.charAt(j);
				char rechange = (char) ((int)change+1);
				System.out.print(rechange);
	}
		System.out.println();
}
	public static void forwerdChar3() {
		System.err.println("  Next.....");
		String name ="Akshay".toUpperCase();
		char []num = name.toCharArray();
		char v;
		for (v = 0; v <num.length ;v++) {
			int h=(int)num[v];
			h++;
			System.out.print((char)h+",");
		}
	}
}