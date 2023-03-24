package ArraySenerios;

import java.util.ArrayList;

public class String__Array__Class {

	public static void main(String[] args) {

		String aray [] = new String [5];
		aray[0]="akshay";
		aray[1]="abhishek";
		aray[2]="alok";
		aray[3]="atul";
		aray[4]="mahadev";
	
		for (int i = aray.length-1; i >=0 ; i--) {
			System.out.println(aray[i]);
		}
		System.out.println();
		String simpal = "akshay kumar yadav from bhadohi";
		char a[] = simpal.toCharArray();
		for (int i = 0; i <simpal.length() ; i++) {
			System.out.print(simpal.charAt(i));
		} 
 
		ArrayList u= new ArrayList();
 
		u.add("yadav");
		System.out.println(u);

	}

}
