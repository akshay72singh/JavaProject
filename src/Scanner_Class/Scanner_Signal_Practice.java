package Scanner_Class;

import java.util.Scanner;

public class Scanner_Signal_Practice {
public static void main(String[] args) {
	Scanner obj= new Scanner(System.in);
	String c=" ";
	do {  
		System.out.println("please enter any signal light colour");
		String g=obj.next(); 
		 
		if(g.equals("red"))
		System.out.println("it is daanger");
		
		else if (g.equals("green")) 
			System.out.println("you should go");
			else if(g.equals("yellow")) 
				System.out.println("get ready");
			else  {
				System.out.println("wrong input");
			}
			
			System.out.println("do u want to check ....(y/n)");
			c=obj.next();
		
	}  while(c.equalsIgnoreCase("y"));
	System.out.println("thank you");
//    Scanner ak=new Scanner(System.in);
//    String f="";
//     do{
//    	 System.out.println("please enter any signal colour name");
//    	String ff=ak.next();
//    	 if(ff.equals("red"))
//    		System.out.println(it is danger ,please stop !....!!!!!");
//      	
//    	 if(ff.equals("green"))
//    		System.out.println("you should go......");
//    	 
//    	System.out.println("for checking anathor,press..(Y/N)");
//    	 f=ak.next();
//    	 
//     }while(f.equalsIgnoreCase("Y"));
//     System.out.println("thank you");
//     Scanner ear=new Scanner(System.in);
//     String fox ="";
//     do  {
//    	 System.out.println("please enter any signal colour");
//    	 String cat=ear.next();
//    	 if (cat.equals("red"))
//    		 System.out.println("don:t move");
//    	 else if(cat.equals("green"))
//    		 System.out.println("you can go");
//    	 else if(cat.equals("yellow"))
//    	 System.out.println("get ready");
//    	 else {
//    		 System.out.println("wrong input ...please try leter");
//    	 }
//     }while(fox.equalsIgnoreCase("Y"));
//    
//
//     System.out.println("thank you");
	String u="";  
   
	 do  {  Scanner net=new Scanner(System.in); 
	        int  hum=net.nextInt();
	        int  age =2022-hum;
		    String   yar=net.next();
	        System.out.println("please enter your date of year");
    if(age>=18 )
	        if( age<90)
	        	System.out.println("you are eligibal for DL");
	        else if(age>=90) {
	       System.out.println("you are not eligibal for DL");}
	    //   else(yar.equals())
	     //  System.out.println("");
	
	
	



	 }while (u.contains("y"));
	 System.out.println("thank you");
}
}
