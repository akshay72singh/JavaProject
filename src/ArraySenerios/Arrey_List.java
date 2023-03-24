package ArraySenerios;

import java.awt.Dimension;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Inflater;

public class Arrey_List {
	public static void main(String[] args) {
		firstMethod();
		name();
		name2();
		newRule();
		Array_List();
//		stringprogram();
		stringProgram2();
		program();
		h1();
		arrayListProgram();
	}

	public static void firstMethod() {
		System.err.println("Next Program......");
		Arrey_List array = new Arrey_List();
		Arrey_List array1 = new Arrey_List();

		String hh = "I love my india";
		char j[] = hh.toCharArray();

		for (int i = 0; i < j.length; i++) {
			System.out.print(j[i]);
		}
	}

	public static void name() {
		System.err.println("Next Program......");
		System.out.println();
		List<String> lst = new ArrayList<String>();
		lst.add("SHIVAM");
		lst.add("ABHISHEK");
		lst.add("RAKESH");
		lst.add("VISHAL");
		lst.add("MANGESH");
		System.out.println(lst.add("BABLU"));
		System.out.println(lst);
	}	

	public static void name2() {
		System.err.println("Next Program......");
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("ajay");
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		int a[] = new int[10];
		a[0] = 5;
		System.out.println(a[0]);
		String ar[] = { "hii,10,50,gkj," };
		String str = ar.toString();
		System.out.println(str.length());

	}

	public static void newRule() {
		System.err.println("Next Program......");
		List<String> lst = new ArrayList<>();
		lst.add("manish");
		lst.add("akshay");
		lst.add(2, "nanhku");
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
	}

	public static void Array_List() {
		System.err.println("Next Program......");
		List<String> lst = new ArrayList<>();
		lst.add("manish");
		lst.add("yadav");
		lst.add("akshay");
		int e = 8 / 2;
		System.out.println(e);
		lst.add("alok");
		System.out.println(lst.addAll(lst));
		System.out.println(lst.get(1));
		System.out.println(lst.size());
		System.out.println(lst.indexOf("Satish"));
		for (int i = 0; i <= lst.size() - 1; i += +2) {
			System.out.println(lst.get(i));
		}
	}

	public static void stringprogram() {
		System.err.println("Next Program......");
		String ary = "AKSHAY KUMAR YADAV FROM BHADOHI";
		// char cr []=ary.toCharArray();
		String splt[] = ary.split("");
		for (int i = splt.length - 1; i >= 0; i--) {   
			System.out.print(splt[i]);
			if (i % 2 == 3) {
				System.out.println("ulta ho gaya ho....... ho gaya ");
			} else {
				System.out.println("NAHI HUA BHAI");
			}
			System.out.println();
		}
	}

	public static void stringProgram2() {
		String ay = "ABHISHEK KUMAR YADUVANSHI FROM INDIA ";
		String space[] = ay.split(" ");
		for (int j = 0; j < space.length ; j++) {
			System.out.print(space[j]);
			System.out.print(" ");
		}
				System.out.println();
	}

	public static void program() {
		System.err.println("Next Program......");
		String str = "hii jay";
		char car[] = str.toCharArray();
		for (int i = car.length - 1; i >= 0; i--) {
			System.out.print(car[i]);
			System.out.print(" ");
		}		System.out.println();

	}
		public static void h1(){
			System.err.println("Next Program......");
			List<String> arylst = new ArrayList<String>();
			arylst.add("akshay");
			arylst.add("kumar");
			arylst.add("yadav");
			System.out.println(arylst.add("aryan"));

			List<String> ary = new ArrayList<String>();
			ary.add("8");
			ary.add("4.5");
			ary.add("mangesh");
			ary.add("good");

			System.out.println(ary.addAll(arylst));

			ary.remove(0);
			ary.size();
			ary.get(0);
			ary.hashCode();
			arylst.hashCode();

			System.out.println(ary.containsAll(ary));
			System.out.println(arylst.contains(ary));
			System.out.println(arylst.contains(arylst));
			System.out.println(ary.retainAll(ary));
			System.out.println(ary.retainAll(arylst));
			System.out.println(ary.add("str"));
			ary = arylst;
			arylst.add("titu");

			for (int ii = 0; ii < ary.size(); ii++) {
				System.out.println(ary.get(ii));
			}
			List<Integer> aryn = new ArrayList<Integer>();
			aryn.add(30);
			aryn.add(30);
			aryn.add(30);
			aryn.add(30);
			aryn.add(30);
			System.out.println(aryn.size());
		
		}
	
	public static void reversForword() {
		String ulta = "everything is good in This planet";
		String a[] = ulta.split(" ");

		for (int i = 0; i <a.length                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 ; i++) {
				char[] num = a[i].toCharArray();
				for (int j = num.length - 1; j >= 0; j--) {

					System.out.print(num[j]);
				}
			} 
					}

	public static void arrayListProgram() {
		List<String> aa = new ArrayList<>(5);
		aa.add("hello");
		aa.add("akhilesh");
		aa.add("raju");
		for (int j = 0; j < aa.size(); j++) {
			System.out.println(aa.get(j));
		}
		System.out.println(aa.size());
		String b = "mulayam singh yadav";
		System.out.println(b.charAt(2));

	}
}
