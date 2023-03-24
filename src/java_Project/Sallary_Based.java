package java_Project;

public class Sallary_Based{

	public static void main(String[] args) {
		
		int totalSalary=akshaykumar(500,400,300);
		
		int netsalary=totalSalary*10/100;
		
		System.out.println(netsalary);
		//int taxesSalary=(totalSalary-netsalary);
			//System.out.println(taxesSalary);

		int x = Salary(70000, 5000, 1000);
		int tax = x - (x * 10 / 100);
		System.out.println(" Rakesh after tex= " + tax);

		int y = (int) Salary(80000, 6000, 1500);
		tax = y - (y * 15 / 100);
		System.out.println(" Bablu after tex=" + tax);

		int z = Salary(90000, 6000, 2000);
		tax = z - (z * 15 / 100);
		System.out.println(" Rahul after tex=" + tax);

	}

	public static int Salary(int basic, int hra, int pf) {
		int totalSalary = basic + hra + pf;
		System.out.println("total salary=" + totalSalary);
		return totalSalary;

	}

		
    public static int akshaykumar(int basicsallary,int hra,int pf) {
    	
    int totalSalary= basicsallary + hra + pf ;
   
    System.out.println(totalSalary);	
    return totalSalary;	
    }

}
