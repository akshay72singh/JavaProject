package forLoopProgram;

public class For_Loop_Program {
	public static void main(String[] args) {

//	   one_two_hundred();
	   rivers_Word();
	   rivers ();
	   clon();
	   alfabate();
	   special_Symbol() ;
	   test_Question();
	   digital_Sum();
	   palindrom_Number(); 
	   prime_Number();
//		Even_Number();

	}

   public static void one_two_hundred() {
      int m = 10; 
      int p = 1 ;
      int i = 0; 
      for (int j = 1; j <=10;j++  ) {    //It tells us that how many times our program will execute. 
      for ( i = p; i <= m; i++) {        /// It tells us that what will be print .
     	System.out.println(i);
      }
      p=i;                             //It's assigning value of i to p .
      m+=10;                          //It's adding 10 in our previous value of m .
     System.out.println();
      }
     }
     public static void rivers_Word() {
      String b = "akshay";	   
     char j[]= b.toCharArray();	   

    char [] f=j;
	  for (int i = j.length-1; i >=0; i--) {
		System.out.print(j[i]);
   	} System.out.println();
     }
 public static void rivers () {
    String t="hello i am akshay kumar";
    char b[] = t.toCharArray();
    for (int i = b.length-1; i >=0 ; i--) {
  	   //t=t+b.charAt(i);
    	System.out.print(b[i]);
    }
    System.out.println();
 }
    public static void clon() {
   // System.out.println(t);
    String na="hii am akshay";
     String u[]= na.split("");
   for (int i = 0; i < u.length; i++) {
   	System.out.print(u[i]);
    }
   System.out.println();
     }
     public static void alfabate() {
           for(char a=65;a<=90;a++) {
		if (a==70 || a==75 || a==80 || a==85 ||a==90) {                 //    abcd
			System.out.println();
		}
			System.out.print(a);
			}System.out.println();
     System.out.println();      
     }
public static void special_Symbol() {
    int a= 10;
    int b= 11;
    int c= 12;
    System.out.println(~a);
	  System.out.println(~b);
    System.out.println(~c);
    }
public static void test_Question() {
    int x=5;
	   {
		   int y=6;
		   System.out.println(" "+y+x);
	   }
	   System.out.println(" "+x);
}

	   public static void digital_Sum() {
	 int num = 1321;
	 int  sum=0 ;
	 int r;
	 while (num>0) {
		 r= num%10;
		 sum = sum +r;
		 num = num /10;
	 }
	        System.out.println("Digital sum number="+sum);
	   }
	   public static void palindrom_Number() {
     int numb = 423;                                    //**
	 int  summ=0 ;
	 int rr;
	 int temp=numb;
                                                      //**
	while(numb>0) {
		rr=numb%10;                                     //** palindrom number
		summ= (summ*10)+rr;
		numb= numb /10;
	}
	   if(temp==summ) {
		System.out.println("it is palindrom number");   //**
	   } else 
		   System.out.println("it is not palindrom");   //**
	   }
//	   
	   public static void prime_Number() {
		int num []= {1,2,3,4,5,6,7,8,9,10};
//		char h[]=num.
		   for (int i = 0; i <=num.length-1; i++) {
			if(i /1==1) {
				System.out.println("it is prime number" );
				if(i / i==0) {
					System.out.println("it is prime number");
				}
			}else {
		System.out.println("it is not prime number");		
			}
		} 
	   }
	public static void Even_Number() {
        	 for (int a=2;a<=100;a+=+2) {
        		 System.out.println(a);
        	 }
        	
        	

		for (int aa=1;aa<=4;aa++) {
			for (int i= 4;i>=aa;i--) {
				System.out.print(" ");
			}
			for (int j=1;j<=aa;j++) {
				System.out.print(aa+" ");
			}System.out.println();
		}
      int bb =123;
      int e;
      int f=0;
      for(int i =0;bb>0;i++) {
    	  e=bb%10;
    	  f=(f*10)+e;
    	  bb=bb/10;
      }
      System.out.print(f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
         }

}