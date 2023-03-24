package String_Program;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RiversString {

	public static void main(String[] ars) {
		rivers_Word();
		m1();
	}

	public static void rivers_Word() {
		String sentence = "Hey i am Rohan";
		String charactor[] = sentence.split(" ");
		for (int i = 0; i < charactor.length; i++) {
			char[] f = charactor[i].toCharArray();
			for (int j2 = charactor[i].length() - 1; j2 >= 0; j2--) {
				System.out.print(f[j2]);
			}
			System.out.print(" ");
		}
	}

	public static void m1() {
		System.out.println();
		String sentence1 = "this is akshay kumar";
		String charactor1[] = sentence1.split(" ");
		for (int i = 0; i < charactor1.length; i++) {
			String num = charactor1[i];
			for (int j2 = charactor1[i].length() - 1; j2 >= 0; j2--) {
				System.out.print(num.charAt(j2));
			}
			System.out.print(" ");
		}
	}

}
