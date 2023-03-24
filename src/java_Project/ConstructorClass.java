package java_Project;

public class ConstructorClass {

	String name ;                                                //  compiler is responcible to generate difault constructor
	int rollNo ;                                                 
	
	ConstructorClass(String name,int rollNo) {
		       name = this.name;
		int Roll_No=this.rollNo=rollNo;
	    System.out.println("Name = "+name+", Roll.No ="+Roll_No);
		}	
public static void main(String[] args) {

	ConstructorClass nam = new ConstructorClass("Akshay",12);
	ConstructorClass name = new ConstructorClass("Abhishek",13);
	ConstructorClass name_ = new ConstructorClass("Bablu",14);
	ConstructorClass name$= new ConstructorClass("Rahul",15);

}
}