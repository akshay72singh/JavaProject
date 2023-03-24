package java_Project;

public class Area_Based_Class {

	public static void main(String[] args) {
		   int c = area_of_rectangle(9, 6);
		   System.out.println("area of rectangle = "+c);
		   
		   long t = volume_of_room(8, 6, 4);
		   System.out.println("volume_of_room = "+t);
		   
		   double r = area_of_circle(3.14, 7);
		   System.out.println("area_of_circle = "+r);
		   
		   double j = percentage_of_marks(340, 500);
	       System.out.println(j + " Your Percentage");

		int circel = AreaOfCircel(22 / 7, 50);
		System.out.println("Area Of Circel = " + circel + " metersqure");

		int cubide = volumeOfCuboid(20, 15, 14);
		System.out.println("volume Of Cuboid = " + cubide + " metercube");

		int sphere = volumeOfSphere(22 / 7, 500);
		System.out.println("volume of sphere = " + sphere + " metercube");

		double areaoftriangleValue = areaOftriangle(10, 6);
		System.out.println("area of triangle = " + areaoftriangleValue * 1 / 2);

		double money = ruppes(81);
		System.out.println("Your Doller is   = " + money / 61.06 + " Rs./");

		double Simpleintrest = simpleIntrest(1000, .07, 2);
		System.out.println("Simple intrest is = " + Simpleintrest / 100 + " %");

	}

	public static int area_of_rectangle(int lenth, int wreath) {

		int area = lenth * wreath;
		return area;
	}

	public static long volume_of_room(int lenth, int wreath, int hight) {

		long o = lenth * wreath * hight;
		return o;
	}

	public static double area_of_circle(double pie, int radious) {

		double p = radious * radious * pie;
		return p;
	}

	public static double percentage_of_marks(int obtained_mark, int total_mark) {
		double j = obtained_mark * 100 / total_mark;

		return j;

	}

	public static double ruppes(double ruppess) {

		return ruppess;
	}

	public static double areaOftriangle(double hight, double base) {
		double areaoftriangle = hight * base;
		return areaoftriangle;
	}

	public static int AreaOfCircel(int pai, int radius) {
		int areaofcercle = pai * radius * radius;
		return areaofcercle;
	}

	public static int volumeOfCuboid(int length, int wirth, int height) {
		int volumeOfCuboid = length * wirth * height;
		return volumeOfCuboid;
	}

	public static int volumeOfSphere(int pai, int radius) {
		int VolumeOfGlobe = 4 / 3 * pai * radius * radius * radius;
		return VolumeOfGlobe;
	}

	public static double simpleIntrest(double p, double r, int t) {
		double simpelintrest = p * r * t;
		return simpelintrest;
	}
}
