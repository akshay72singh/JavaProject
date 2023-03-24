package Scanner_Class;

import java.util.Scanner;

public class Even_Odd_Number_Class {
	public static void main(String[] args) {
		String u=" ";
		int v;
		do {
			Scanner k=new Scanner(System.in);
			System.out.println("do you want to check any number....please enter a number");
		     v=k.nextInt();
			if( v %2==0) {
				System.out.println("it is even number");				
			}
			else if (v % 2==1) {
				System.out.println("it is odd number");
			}
		//	System.out.println("it is wrong ");
			System.out.println("do you want check another number..?../.(y/n)");
			u=k.next();
		    }
		while(u.equalsIgnoreCase("y"));
		System.out.println("thank you");
	}
}
