package StringBufferBuilder;

public class StringType {
	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("Roshan");
		String str2 = "akshay yadav";
		String str = "Abhishek Kumar Yadav";
//System.out.println(str.compareTo(str2));
//s.append(4);
//System.out.println(s.hashCode());
		String a = str + str2;
		System.out.println(a);
		StringBuffer aa = new StringBuffer(" akshay yadav");
		System.out.println(s.append(aa));
//	System.out.println(str.compareTo(str2));
		// System.out.println(aa.reverse());
//	System.out.println(aa.replace(6, 7,"kumar"));
//	System.out.println(aa.reverse());
//	System.out.println(str2.stripIndent());
//	System.out.println(str.replace('k', 'b'));
//   System.out.println(str.isEmpty());
//     System.out.println(str.hashCode());
//	System.out.println(str.isBlank());	
//	System.out.println(str.isBlank());
//	System.out.println(str.isBlank());
	}
}