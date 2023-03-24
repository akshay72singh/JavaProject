package _2D_Array;

public class Array2D {
public static void main(String[] args) {
	

	String s[][]=new String [][]{{"akshay","abhishek","raju"},{"arnav","pranav"}};
	
	System.out.println(s[1][0].length()+" = Length Of 2D Array's elements");
    System.out.println(s.length+" = Length Of 2D Array");
	for (String[] strng : s) {
		for (String strings : strng) {
			System.out.println(strings);
		}
	}
	System.err.println("Next Program.......");
	
	String h[][]= {{"babli"},{"rohit","abhishek","badsah","ajay"},{"akbar......"}};
	System.out.println(h.length);
	for (String[] str : h) {
		for (String str1 : str) {
			System.out.println(str1);
		}
	}
	System.err.println("Next Program.........");
	
	for (int i = 0; i < h.length; i++) {
		for (int j = 0; j < h[i].length; j++) {
			System.out.println(h[i][j]);
		}
	}
	System.err.println("Next Program..........");
	
	int a[][]= {{1,2},{3,4,5},{6,7,8}};
	System.out.println(a.length+" =it is length");
	for (int[] is : a) {
		for (int is2 : is) {
			System.out.println(is2);
		}
	}
	System.err.println("Next Program.........");
	
	Object u[][]= new String [][] {{null},{null}};
	System.out.println(u.length);
	for (Object[] objects : u) {
		for (Object objects2 : objects) {
			System.out.println(objects2);
		}
	}
	System.err.println("Next Program..........");
	
	for (int i = 0; i < u.length; i++) {
		for (int j = 0; j < u[i].length; j++) {
			System.out.println(u[i][j]);
		}
	}
	System.err.println("Next Program.........");
	
	int w[][]= new int[3][3];
	w[0][0] = 1;
	w[0][1] = 2;
	w[0][2] = 3;
	w[1][0] = 4;
	w[1][1] = 5;
	w[1][2] = 6;
	w[2][0] = 7;
	w[2][1] = 8;
	w[2][2] = 9;
	
	for (int[] is : w) {
		for (int is2 : is) {
		
			System.out.print(is2+" ");
		}
		System.out.println();
	}
	System.err.println("Next Program.........");
	
	for (int[] is : w) {
		for (int is2 : is) {
		if(is2 % 2 == 0) {
               is2=0;			
			System.out.print(is2+" ");
		}else {
		System.out.print(is2+" ");
	}
		}
		System.out.println();
	}
	System.err.println("Next Program..........");
	
	for (int[] is : w) {
		for (int is2 : is) {
			if(is2 % 2!=0) {
				is2=0;
				System.out.print(is2+" ");
			}else {
				System.out.print(is2+" ");
			}
		}System.out.println();
	}
	for (int[] is : w) {
		for (int is2 : is) {
		
			System.out.print(is2+" ");
			System.out.println();
		System.out.println(is2);
		}
	}
}
	public static void nameAge() {
		String d[][] = new String[4][3];
		d[0][0] = "first name";
		d[0][1] = " last name";
		d[0][2] = "   age    ";
		d[1][0] = "   raju   ";
		d[1][1] = "   yadav  ";
		d[1][2] = "   20     ";
		d[2][0] = "   ramu   ";
		d[2][1] = "   yadav  ";
		d[2][2] = "    8     ";
		d[3][0] = "   ram    ";
		d[3][1] = "   yadav  ";
		d[3][2] = "   120    ";
		for (String[] strings : d) {
			for (String strings2 : strings) {
				System.out.print(strings2);
			}
			System.out.println(" ");
		}
	
	}
	
	
	

}
	
	

