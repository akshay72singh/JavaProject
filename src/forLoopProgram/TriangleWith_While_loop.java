package forLoopProgram;

public class TriangleWith_While_loop {
public static void main(String[] args) {
       
	int i=4;
         while (i>0)   {
	     int j=i;	
	     while   (j>=1) {	    	
		 System.out.print(" *");
		 j--;			}
         i--;
       System.out.println();       }
               int a =1;
                while (a<=5) {                                
            	int b=1;                                      
	            while (b<=a) {	                              
		         System.out.print(" *");                    
		           b++;                                      
	               }                                             
	               ++a;                                         
	              System.out.println();  }                            
                
       int c=8  ;                    
	   while   (c>=1)   {
       int d=1; 
	    while    (d<=c)  {			
		System.out.print(" ");
	    d++;             }
	   
	    int o=8;
	    while   (o>=c) {
	    	System.out.print("*");
	    o--;
	    }
	     c--;              
	     System.out.println();       }
     
	   
         int  s=1;
   while  (s<=8) {
	   int t=1;
	   while  (t<=s) {
		   System.out.print(" ");
		   t++;	   }       
   int k=8;
   while  (k>=s) {
	   System.out.print("*");
	   k--;         }
   System.out.println( );
   s++;
   }

}

}

