package Encaptulation;

public class setter_Getter{
	
	private static int age = 40;
	public  String name = "akshay";
	
	public  void setage(int age ) {
		this.age=age;

		System.out.println(age);
	}
	
	public  int getage() {
		
	System.out.println(age);
	return age;
	}
	
	public static void main(String[] args) {
		setter_Getter age =new setter_Getter();
		age.setage(90);
		 age.getage();
		 age.getname("ajay");
	}
	public void getname(String name) {
		this.name=name;
		System.out.println(name);
	}
}