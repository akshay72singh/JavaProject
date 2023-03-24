package StringBufferBuilder;

import java.nio.Buffer;
import java.util.Iterator;

public class String_Buffer {
	public static void main(String[] args) {
		buffer();
		indiaRivers();
		indian() ;
		 riversString();
	}
	public static void buffer() {
		String h1 = "you";
		String h2 = " you";

		String h3 = new String("you");
		String h4 = new String("you");
        
		System.out.println(h1+h2);
		
		StringBuffer h5 = new StringBuffer("you");
		StringBuffer h6 = new StringBuffer("you");

		StringBuilder h7 = new StringBuilder("you");

		if (h1.equalsIgnoreCase("you")) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		if (h6 == h5) {
		System.out.println("h5 buffer you ==h6 buffer you");
		}else {
			System.out.println("h5 buffer you is not == h6 buffer you");
	}
	}
		public static void indiaRivers() {
	   String name="I LOVE MY INDIA";
	  char car[]=name.toCharArray();
	   for (int i =car.length-1; i >=0; i--) {
		System.out.print(car[i]);
	   }
		}
		public static void indian() { 
		 String name="I am indian";
		   char car[]=name.toCharArray();
		   for (int j =0; j <name.length(); j++) {
			System.out.println(name);
			
		   String ame="LOVE";
			   char ca[]=ame.toCharArray();
			   for (int k =  ca.length-1; k >=0; k--) {
				System.out.print(ca[k]);}
			   System.out.println();
				
			   String ne="MY";
				   char cr[]=ne.toCharArray();
				   for (int l =0; l >= cr.length; l++) {
					System.out.println(ne);
				   
				   String name_Of="INDIA";
				   char name_Of_car[]=name.toCharArray();
				   for (int a =  car.length-1; a >=0; a--) {
					System.out.print(car[a]);}
				   }
	        String f= "I LOVE MY INDIA";
	       String splt[] = f.split(" ");
	        for (int w = splt.length-1; w <=0; w--) {
			System.out.print(splt[w]);
//	      }
	        }
    String d = "I AM AKSHAY KUMAR";
	//char v[]=d.toCharArray();
    String b[]=d.split(" ");
    for (int o = b.length-1; o >= 0; o--) {
		System.out.print(b[o]);
	}
  //  System.out.println(o[]);
		String k[] =new String [4];
		b[0]="AKSHAY";
		b[1] = "KUMAR";
		b[2] = "YADAV";
		b[3] = "VISHAL";
		for (int p = 0; p < b.length; p++) {
			System.out.println(b[p]);
		}
		int ds []= new int[3];
		ds [0] = 56;
		ds [1] = 60;
	for (int q = 0; q < ds.length; q++) {
			System.out.println("int = "+ds[q]);
		}
	    String t = "MOBILE";  
	    //System.out.println(t.length());
	    char v []= t.toCharArray();
	for (int ii = 0; ii < v.length; ii++) {
		System.out.println("MOBILE = "+v[ii]);
	}
	String z = "YOU*TUBE";
	int g = z.indexOf("O");
	System.out.println(g);
	char r []= z.toCharArray();
	for (int za =0; za < r.length; za++) {
		System.out.println("YOU TUBE = "+r[za]);
	}
	        }
	        
				
				   
				   }
		   
	  public static void riversString() {
		   String a="akshay";
		   String rivers = "";
		   for (int i = a.length()-1; i>=0; i--) {
			rivers=rivers+a.charAt(i);
		}
		   System.out.println(rivers);
	   }
	  }
	  












	

