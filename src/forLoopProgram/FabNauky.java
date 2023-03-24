package forLoopProgram;

public class FabNauky {
	public static void main(String[] args) {
		 digital_Sum();
		 febnaqui();
		 riversWord();
		 Average();
		 sumOfNum() ;
		 Right_Revers();
	}
		 public static void febnaqui() {
		 int a = 0;
		int b = 1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 4; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
		 }
		
		 public static void Digital_Num() {

		int e = 67;
		int d = 0;
		int h;
		for (int i = 0; e > 0; i++) {
			h = e % 10;
			d = d + h;
			e = e / 10;
		}
		System.out.println(d);
		 }

		 public static void riversWord() {
		
		String p = "ajay kumar";
		String l[] = p.split(" ");

		for (int i = l.length - 1; i >= 0; i--) {
			System.out.print(l[i] + " ");
		}
		System.out.println();
		 }

		 public static void Average() {

		int q[]= {3,4,7,9,2};
		int u=q.length;
		int sum=0;
		for (int i = 0; i < q.length; i++) {
			sum = sum+q[i];
		}
		System.out.println(sum/u+" = Aaverge");
		
	}
	   
	    public static void sumOfNum() {
	    int hi[]= {0,2,4,5,6};
	    int sum = 0;
	    for (int i = 0; i < hi.length; i++) {
	    	 sum=sum+hi[i];
	    	 System.out.println(sum);
	    }
	    }
	    public static void Right_Revers() {
		String name = "i am going to school with my friends";
		String [] sp = name.split(" ");          //  size =8
		for (int i = 0; i < sp.length; i++) {    //   i  =0
			if(i% 2==0) {                        //  i =0
				String sgl = sp[i];              //sp[i]  =  I ( AM WALA )
				char[]hold=sgl.toCharArray();
			 for (int x=hold.length-1;x>=0;x--) {
				System.out.print(hold[x]); 
			 }
			 System.out.print(" ");
			}
			else
			{
				System.out.print(sp[i]+" ");
			}
		}  int it =5;
		System.out.println(it);
	    String s = new String();	
	    //	System.out.println();
	    	s="jg";
	    	s="nfj";
	    	System.out.println(s);
	}
	    public static void AddNumber() {
	        int hi[]= {0,2,4,5,6};
	        int sum = 0;
	        for (int i = 0; i < hi.length; i++) {
	        	 sum=sum+hi[i];
	    }
	        System.out.println(sum);
	   
	    }
	    public static void digital_Sum() {
			int num = 567;
			int sum = 0;
			int r ;
			for (int i = 0; num > 0; i++) {
				r= num % 10;
				sum = sum + r;
//				num = num / 10;
			}
			System.out.println(sum);

		}

}
