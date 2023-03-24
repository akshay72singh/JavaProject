package dummy;

import java.util.Iterator;

public class DummyStringClass {

	public static void main1(String[] args) {
//		riversWordItsPlace();
//		countEachCharactor();
//		vovelCount();
		accurence();
	}
	public static void accurence(){
	      String name = "Hii I am akshay kumar".toLowerCase();
	      String split [] = name.split(" ");
	      for(char i= 'a';i<='z';i++){
	            int count = 0;
	            for(int j=0;j<split.length;j++){
	                if(i==name.charAt(i)) {
	            	count ++;
	            }
	            }
	            if(count>0){
	                  System.out.print(count+"aaaaaaaaa");
	            }      
	      }
	      }

	public static void riversWordItsPlace1() {
		String name = "Hii i am akshay";
		String split[] = name.split(" "); // split[] have-Hii i am akshay
		for (int i = 0; i < split.length; i++) { // After for loop split[] have only -Hii
			char arr[] = split[i].toCharArray(); // Now arr[] will break every word in charector ,like(H,i,i),which will
													// be come in case of [i]
			for (int j = split[i].length() - 1; j >= 0; j--) {
				System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
	}

	public static void countEachCharactor() {
		System.out.println();
		String name = "Alok kumar yadav".toLowerCase();
		for (char i = 'a'; i <='z'; i++) {
			int count =0;
			for (int j = 0; j < name.length(); j++) {
				if(i==name.charAt(j)) {
					count++;
				}
			}if (count>0) {
			System.out.println(i+"_"+count);
		}
			}
	}
	public static void vovelCount() {
		String vovel ="akd ay hi";
	        char []i=vovel.toCharArray();
	        for (int j = 0; j < i.length; j++) {
				 if(i[j]>='a'&& i[j]<='z') {
					 i[j]-=32;
				 }
			}
	        System.out.println(i);
			
	}
	public static void main(String[] args) {
		digitalSum();	 
		palindromNum();		
		acurance();
		count_vovel();
		febnaquiSeries();
		riversWord();
		riversWordItsPlace();
		sumofNum();
//		table(8);
//		y1();
		accurence();
	}
	public static void digitalSum() {
		int num = 3456;
		int num1 = 0;
		int sum;
		for (int i = 0; num>0; i++) {
			sum= num%10;               //=6  ,=5  4   3
			num1 = num1+sum;           //=6  ,5   4   3
			num = num/10;              //=345,34  3   0
		}
		System.out.println(num1);

		System.out.println();
	}
		public static void palindromNum() {
//			System.out.println();
			int num = 676;
			int numnum = 0;
			int sum;
			numnum = num; 
			for (int i = 0;num>0; i++) {
			     sum = num%10;
			     numnum = (numnum*10) +sum;
			     num = num/10;
			}
//			System.out.print(numnum);
			if(numnum==numnum) {
				System.out.println("it is palindrom num = 676");
			}else {
				System.out.println("it is not palindrom num");
			}
		}
		public static void acurance() {
			System.out.println();
			String name = "hii i am akshay kumar yadav";
//			char p[]= name.toCharArray();
			char i;
			for ( i = 'a'; i <='z'; i++) {
				int count = 0;
				for (int j = 0; j < name.length(); j++) {
					if(i==name.charAt(j)) {
						count++;
					}
					
				}if(count>0) {
					System.out.println(i+" = "+count);
				}
			}
		}
		
		public static void count_vovel() {
			System.out.println();
			String name = "akshay kumar yadav from U.P. at Bhadohi";
			char a []= name.toCharArray();
			System.out.println(a.length+" = length");
			int count = 0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u') {
					count++;
				}
			}
			
				System.out.println("No of vovel = "+count);
			
		}
		
		public static void febnaquiSeries() {
			System.out.print("Febnaqui series = ");
			int a=0;
			int b=1;
			System.out.print(a+",");
			System.out.print(b+",");
			int c;
			for (int i = 0; i <= 5; i++) {
				c= a+b;
				System.out.print(c+",");
				a=b;
				b=c;
			}System.out.println();
		}
		public static void riversWord() {
			System.out.print("rivers word = ");
			String name = "akshay kumar yadav";
			String n[]= name.split(" ");
			for (int i = n.length-1; i >=0; i--) {
				System.out.print(n[i]);
				System.out.print(" ");
			}
			System.out.println();
		}
		public static void riversWordItsPlace() {
			String name = "akshay kumar yadav from bhaohi";
			String nm[]= name.split(" ");
			for (int i = 0; i < nm.length; i++) {
				char nm1[]= nm[i].toCharArray();
				for (int j = nm1.length-1; j >=0 ; j--) {
					System.out.print(nm1[j]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
		 public static void sumofNum() {
			 System.out.print("Sum of Num = ");
			 int arr[]= {1,2,3,4,5,6,7,8,9};
			 int sum =0;
			 for (int i = 0; i < arr.length; i++) {
				sum= sum+arr[i];
			}
			 System.out.println(sum);
		 }

}


//	public static void main(String[] args) {
//		String name = "Akshay kumar yadav".toLowerCase();
//		char g[] = name.toCharArray();
//		for (char i = 'a'; i < 'z'; i++) {
//			int count = 0;
//			for (int j = 0; j < g.length; j++) {
//				if(i==name.charAt(j)) {
//					count++;
//      			}
//			}
//			if(count>0) {
//				System.out.println(g[i]+"="+count);
//			}
//		}
//	}










