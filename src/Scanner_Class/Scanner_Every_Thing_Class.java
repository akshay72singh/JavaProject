package Scanner_Class;
import java.util.Scanner;
public class Scanner_Every_Thing_Class {
public static void main(String[] args) {
//	int table;
//	String Y_N= "";
// 	  Scanner  h=new  Scanner(System.in); 
//     do  {
//  	   System.out.println("if you want print table ..please enter that number");   
//  	   table=h.nextInt();
//  	    TablePrint(table);
//  	    System.out.println("if you want to print any other table please enter that number");
//  	   Y_N=h.next(); 
//     }    while (Y_N.contains("Y"));  
//     	System.out.println(" Thank you......");
//}
//     	public static void TablePrint(int table) {
//    		int x;
//    		for( x=1;x<=10;x++) {
//    			System.out.println(table+"*"+x+"="+table*x);
//    		}
  	   //y++;
//	String h ="";
//	Scanner a=new Scanner(System.in);
//	do   {
//		System.out.println("please enter your date of year");
//	
//	int g=a.nextInt();
//	int n=2022-g;
//	if (n>18)   {
//		System.out.println("you are elegibsl for voating");
//	}
//		else {
//			System.out.println("you are miner");  }
//	
//	   if(n>90) 
//	  {		System.out.println(" but you are to old");
//	  }
//	  System.out.println("do you want too check another person");
//	  h=a.next();
//	}
//		while(h.contains("yes"));{
//		
//		System.out.println("thank you");  }
      // String y_n=" ";			
	//.............................................................................................//
	//.............................................................................................//
     String   b=" ";
     Scanner g=new Scanner(System.in);
    do  {
    	
    	 System.out.println("enter any signal colour name");
     String d=g.next();
     
     if (d.equals("red")) 
    	 System.out.println("it is red signal ...please stop");
    	 
      else if(d.equals("green")) 
    	System.out.println("it is green signal ...you can go "); 
     
      else if (d.equals("yellow")) 
    	  System.out.println("get ready");
     
     System.out.println("do you want to check another signal press( Yes..)");
        b=g.next();
    }while(b.equalsIgnoreCase("yes")) ;
     
   	  System.out.println("thank you");
    //..........................................................................................//
    //..........................................................................................//
 //  String o =" ";
	
	
	
//   	  int table,x=1;
//   	  Scanner  h= new  Scanner(System.in); 
//       do  {
//    	   System.out.println("if you want print table ..please enter that number");
//    	  
//    		   
//	 System.out.println(table+"*"+x+"="+table*x);        	  
//    	   table=h.nextInt();
//    	  // tablePrint(table);
//       }    while  (x>=10);   {
//    	   //y++;
       }
   	public static void table(String[] args) {
//		String c = "";
//		Scanner sc = new Scanner(System.in);
//		//Scanner sc1 = new Scanner(System.in);
//		do {
//			System.out.println(" please enter your date of year = ");
//		int Y_N = sc.nextInt();
//		int    age = 2022 - Y_N;
//		c = sc.next();
//			if ( age >= 18 ) {
//				if (age <= 60) {
//					System.out.println("you are elligible for voating..");
//				}
//				if (age >= 60) {
//					if (age < 100) {
//						System.out.println("you are senior citizen  for voting ..");
//					}
//					if(age >100) {
//						System.out.println("You should death till now..");
//					}					
//				}
//			}
//			else {
//				System.out.println("You are miner/not elligible for voating>>>>SORRY...");
//			}
//			System.out.println("Do you want to cheak another ?");
//			String s = sc1.next();
//		}
//		while ();
//			
//			  do {
//		  System.out.println("do u want to check another person ?");
//			
//		
//			  }
//			  while (c.equals("yes"));
//
//		System.out.println("thank u  !");
	String kl = "";
	do {	Scanner to = new Scanner(System.in);
System.out.println("please enter a num which table do  you want to  print");
	int g=to.nextInt();
	m(g);
	System.out.println("another or not.....(Y_N)");
	kl=to.next();
	}while (kl.contains("y"));
	System.out.println("thank you");                            }
	public static void m(int g) {

		for (int a=1;a<=10;a++) 
			System.out.println(g+"*"+a+"="+g*a);
		}	 	  
}