package String_Program;

import java.util.Iterator;

public class Assending_largestNumProgram {

	public static void main(String[] args) {
				twoTimesNum();
				duplicateNum();
				largestNum1();
				largestNumber2();
				decendingOrder();
				assendingOrder();
		        name();
		 		duplicateChar();
		 		assendingorder();
	}

	public static void twoTimesNum() {

		 int a[] = { 2, 2,2,2, 0, 4, 1, 0, 1 };
		 int temp = 1;
		 for (int i = 0; i < a.length; i++) {
		 for (int j = i + 1; j < a.length; j++) {
		 if (a[i] > a[j]) {
		 temp = a[j];
		 a[j] = a[i];
		 a[i] = temp;
		 }
		 }
		 }
		 for (int i = 0; i < a.length; i++) {
		 int count = 1;
		 for (int j = i + 1; j < a.length; j++) {
		 if (a[i] == a[j]) {
		 i = j;
		 count++;
		 }
		 }
		 if (count>=2) {
		 System.out.println(a[i]);
		 }

		 }

	}

	public static void duplicateNum() {
		System.err.println(" Next program.......");
		System.out.print("duplicate number is - ");
		int arr[] = { 1, 2, 3, 2, 1, 2, 4, 4, 5, 5, 6, 7 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + ",");
				}
			}
		}
		System.out.println();
	}

	public static void largestNum1() {
		System.err.println("next program......");
		int arr[] = { 1, 3, 2, 4, 5, 6 };
		int num = 6;
		for (int i = 0; i < arr.length; i++) {
			if (num > arr[i]) {
			}
		}
		System.out.println("it is largest num = " + num);
	}

	public static void largestNumber2() {
		System.err.println(" Next program .......");
		int arr[] = { 1, 7, 8, 3, 4, 9, 10 };
		int num = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > num) {
				num = arr[i];
			}
		}
		System.out.println("Largest number is = " + num);
	}

	public static void decendingOrder() {
		System.err.println(" Next program .......");
		int arr[] = { 9, 4, 6, 2, 7 };
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}
		System.out.print("num in decending Order =");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void assendingOrder() {
		System.err.println(" Next program .......");
		int arr[] = { 9, 4, 6, 2, 7 };
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					num = arr[i];
					arr[i] = arr[j];
					arr[j] = num;
				}
			}
		}
		System.out.print("num in assending Order =");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void name() {
		System.out.println();
		String name[] = { "Ayush", "Aarush", "AkShaY", "Vivek" };
		String name1;
		String revers;
		int a;
		for (int i = 0; i < name.length; i++) {

			if ("Akshay".equalsIgnoreCase(name[i])) {
				name1 = name[i];

				char h[] = name1.toCharArray();

				for (int j = h.length - 1; j >= 0; j--) {
					if (h[j] >= 'A' && h[j] <= 'Z') {
						h[j] += 32;
						System.out.print(h[j]);
					} else
						System.out.print(h[j]);
				}
			}
		}
        System.out.println();
	}

	public static void duplicateChar() {
		System.err.println(" Next program .......");
		int a[] = { 1, 2, 3, 3, 2 };
		System.out.print("Duplicate num - ");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}
			}
		}
System.out.println();
	}

	public static void assendingorder() {
		System.err.println(" Next program .......");
		int num[] = { 2, 1, 5 };
		int temp;
		System.out.print("assending order - " );
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] >num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.print( num[i]+" ");
		}
//		for (int i = 0; i < num.length; i++) {
//		}
	}

	public static void desending() {
		int num [] = {4,3,5,8,5} ;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length; j++) {
				if(num[i]>num[j]) {
					
				}
			}
		}
	}
}
