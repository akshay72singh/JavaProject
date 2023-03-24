package dummy;

public class JavaProgramming {

	public static void main(String[] args) {
//		febnaquiSeries();
//		upperCase();
//		lowerCase();
//		accurence();
//		primeNumber();
		palindromNum();
//		factorial();
	}
	public static void febnaquiSeries() {
		int a = 0;
		int b = 1;
		int c ; 
		System.out.println(a);
		System.out.println(b);
		
		for (int i = 0; i < 8; i++) {
			c= a+b;
			System.out.println(""+6+7+"h"+6+7);
			a = b;
			b = c;
		}
	}
	public static void upperCase() {
		
		String name = "akshay Kumar yadav";
		char car [] = name.toCharArray();
		for (int i = 0; i < car.length; i++) {
			if(car[i]>='A'& car[i]<='Z') {
				car[i]+=32;
			}
			System.out.print(car[i]);
		}
	}
	public static void lowerCase() {
		
		String name = "Akshay Kumar Yadav";
		char car [] = name.toCharArray();
		for (int i = 0; i < car.length; i++) {
			if(car[i]>='a'& car[i]<='z') {
				car[i]-=32;
			}
			System.out.print(car[i]);
		}
	}
	public static void palindromNum() {
		int num = 7787;
		int num1,num2=0;
		for (int i = 0; num>0 ; i++) {
			num1=num%10;
			num2 = (num2*10)+num1;
			num = num /10;
		}
		System.out.println(num2);
	}
	
	public static void primeNumber() {
		
		for (int i = 0; i <= 50; i+=2) {
			System.out.println(i);
		}
	}

	public static void factorial() {
		int num = 5;
		int num1 = 1;
		for (int i = 1; i <= num; i++) {
			num1=num1*i;
		}
		System.out.println(num1);
}
}