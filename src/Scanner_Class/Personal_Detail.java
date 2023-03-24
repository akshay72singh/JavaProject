package Scanner_Class;
      import java.util.Scanner;
   public class Personal_Detail {
public static void main(String[] args) {
	
	String d=" ";String name=" ";String mob_no=" ";String address=" ";byte age;
	
	Scanner k=new Scanner(System.in);
	//Scanner l=new Scanner(System.in);
	String Y_N="";
	
	do {		
		System.out.println("please enter your name");
		 name=k.next();
	 System.out.println("Enter your age");
	 age=k.nextByte();
	System.out.println("Enter your mob no");
    mob_no=k.next();
	System.out.println("enter your address");
	 address=k.next();
	 System.out.println("Do you want another Detaile ? (Y/N)");
		Y_N=k.next();
	 System.out.println("name"+"="+name);
	 System.out.println("age"+"="+age);
	 System.out.println("mob_no"+"="+mob_no);
	 System.out.println("address"+"="+address);
	
	}while(Y_N.contains("Y"));
	System.out.println("Thank you.............");
}
	public static void again_Check(String[] args) {
		String obj = "  ";
		do {
			System.out.println("Enter your name ..");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			if (s.equals(s)) {
				System.out.println(" Enter your father name ..");
			}
		 s = sc.next();
			 if (s.equalsIgnoreCase(s)) {

				System.out.println("Enter Your address..");
			 }
			 s = sc.next();
			if (s.equalsIgnoreCase(s)) {
				System.out.println("Enter Your Mobile Number ..");
			}
			 s= sc.next();
			if (s.equalsIgnoreCase(s)) {
				System.out.println("Do You want to see your full data..Press(Y/N)");
			}
			 s = sc.next();
			if (s.equalsIgnoreCase("Y")) {
				System.out.println("My Name is = " + s);
				System.out.println("My Father Name is = " + s);
				System.out.println("My Address is = " + s);
				System.out.println("My Mobile Number is = " + s);
			} else {
				System.out.println(" Ok Koi Baat nahi Brooo..");
			}
			System.out.println("Do you want to cheak another data..Press (Yes/No) ");

			obj = sc.next();
		} while (obj.equalsIgnoreCase("Yes"));

		System.out.println("Thank You ..!!");
	}
}
