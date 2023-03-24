package java_Project;

public class table_Class {

	public static void main(String[] args) {
//int num1=1;
//int num2=2;
//int num3=3;   ///[RECURSION]
//int num4=4;
//int num5=5;
//int num6=6;
//int num7=7;
//int num8=8;
//int num9=9;
//int num10=10;
//
//for (int s =1;s<=10;s++)
//	System.out.println(num2*s+"   "+num3*s+"   "+num4*s+"   "+num5*s+"   "+num6*s+"   "+num7*s+"   "+num8*s+"   "+num9*s+"   "+num10*s );
//	
//	System.out.println();
//	for(int a=1;a<=10;a++) {
//		    for(int b=1;b<=1;b++) {
//			for(int z=2;z<=2;z++) {
//			for(int c=3;c<=3;c++) {
//	    	for(int d=4;d<=4;d++) {
//			for(int e=5;e<=5;e++) {
//			for(int f=6;f<=6;f++) {
//	        for(int g=7;g<=7;g++) {
//	        for(int h=8;h<=8;h++) {
//	        for(int i=9;i<=9;i++) {
//	        for(int j=10;j<=10;j++) {
//	
//	System.out.print(a+"*"+b+"="+a*b+".  ");
//	System.out.print(" "+a+"*"+z+"="+z*a+".  ");
//    System.out.print(" "+a+"*"+c+"="+a*c+".  ");
//	System.out.print(" "+a+"*"+d+"="+d*a+".  ");
//	System.out.print(" "+a+"*"+e+"="+a*e+".  ");
//	System.out.print(" "+a+"*"+f+"="+a*f+".  ");
//	System.out.print(" "+a+"*"+g+"="+a*g+".  "); 
//	System.out.print(" "+a+"*"+h+"="+a*h+".  ");
//	System.out.print(" "+a+"*"+i+"="+a*i+".  ");
//	System.out.println(" "+a+"*"+j+"="+a*j+".  ");
//	
//	
//	}
//	}
//	}
//}}}}
//	}}}}
		String name = "Hii Am Akshay Kumar".toLowerCase();
		char[] arr = name.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] >= arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					System.out.println(temp);
				}
			}
		}
}}
