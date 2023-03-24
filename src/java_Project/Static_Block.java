package java_Project;

public class    Static_Block{                                         
	Static_Block s;
	static int a=10;                                                                                                        
  int b=20;                                                         
  Static_Block(){                                                         
	System.out.println("my first constructor");
	}                                                                      
	Static_Block (int n){
		int c=25;
		System.out.println(c);
		System.out.println(a*n);
	   }
static {
	System.out.println("hi i am constructor");
      }
     {
	System.out.println("my first instance block");
     }
     static void Block (int a) {
 		System.out.println(a);
 		}
 	static int j = 4;
 	static {
 		System.out.println(j);
 	}
 	int l = 90;
	public static void method() {
		Object xyz=new Static_Block();
		Static_Block xy= new Static_Block (1);
		Static_Block x=new Static_Block ();
	Static_Block var = new Static_Block();
		
	}
	void v(boolean b) {
		int v=40;
		System.out.println(v);
}
static int x=20;
    int z=50;
public static void main(String[] args) {
	
	Static_Block r=new Static_Block();
	Static_Block m=new Static_Block();
	Static_Block n =new Static_Block(50);
	System.out.println(x);
	 n.Block();}
	static {
		System.out.println("i am static block first"+x);
	}
	    {  
		System.out.println("i am instance "+z);
		}
	    Static_Block (int a,int b){  
		System.out.println("2nd cunstroctor"+a*b);
	}
	    void Static_Block (){
		System.out.println(a*x);
		}
	    Static_Block(long g){
		System.out.println("3rd block"+x);
	 Block( 300);
	}
	void Block(){
		System.out.println("non static block"+x);
		}
	

	public static void static_Method(String[] args) {
		int e = 4;
		System.out.println(e);
		akshay();
	}
	public static void akshay() {
		Static_Block lg = new Static_Block();
		lg.l = 9;
		System.out.println(lg.l);
		Static_Block yu = new Static_Block();
		lg.l = 60;
		System.out.println(lg.l);
	
	}
	public static void block() {
		Static_Block a = new Static_Block ();
		System.out.println(a.b);
		System.out.println(a.s);
	}

	

	public static Static_Block m1() {
		System.out.println("hii ka ho ....");
		return new Static_Block();
	}

	{
		System.out.println("hero..");
	}

	Static_Block(String e) {
		System.out.println(" I am learn.");
	}

	Static_Block m() {
		System.out.println("coding....");
		return s;
	}

	}
