package java_Project;

public class instance_NonStatic_Class {

	static int o = 30;
	int b = 4;
	{
		System.out.println("First Block");
	}
	public static void main(String[] args) {
		Object j = new instance_NonStatic_Class(true);
		instance_NonStatic_Class g = new instance_NonStatic_Class(8);
		System.out.println(g.b);
		System.out.println("n");
	}
	{
		System.out.println("m");
	}
	static {
		System.out.println("ddff");
	}
	int y = 10;
	{
		System.out.println(y + b);
		System.out.println("hhhuhtuh");
	}
	instance_NonStatic_Class(int d) {
		System.out.println("jj");
	}

	instance_NonStatic_Class(boolean y) {
		System.out.println(2 != 3);
	}
	static int str = 200; ////...................1//   [5]....  b=200
	int a = 100; 
	public static void ma(String[] args) {//............2
		instance_NonStatic_Class a=new instance_NonStatic_Class();
		System.out.println("hiii"+a);
		Instance_variable(5000); 
	}
	public static void Instance_variable(int c) {//..................3
		System.out.println("int" + c);
		//System.out.println("nonstatic"  );
		}
	instance_NonStatic_Class() {
		a=90; ///.............[7]  a=90
		System.out.println(a*b);     ///.............[8]    18000  
	}
	static{           //...................4
		instance_NonStatic_Class x=	new instance_NonStatic_Class();   //.........[6]
	x.a=5555;             //...............[9]   a=5555
	System.out.println("sorry");  //..............[10]  sorry
	}

}
