package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey  = new Scanner(System.in); 
		System.out.print("Enter an integer ");
		double numEntered = inKey.nextInt();
		System.out.print("Enter another integer ");
		double numEntered1 = inKey.nextInt();
		for (int i = 1; i < 11; i++) {
		double scope = numEntered;
		double min = numEntered1;
		int num = (int) (Math.random() * scope + min);
		System.out.println(num);
		
	}}
	
	
	
	
	public static void problem02() { //done
		Scanner inKey  = new Scanner(System.in);
		System.out.print("Enter the radius of the cylinder");
		double radius = inKey.nextDouble();
		System.out.print("Enter the height of the cyclinder");
		double height = inKey.nextDouble();
		double volume=((Math.PI * radius * radius * height));
		System.out.println("The Volume of Cylinder is: " + volume);
		
	}

	
	

	public static void problem03() {
		Scanner inKey  = new Scanner(System.in);
		System.out.println("Enter X1");
		double xOne = inKey.nextDouble();
		System.out.println("Enter Y1");
		double yOne = inKey.nextDouble();
		System.out.println("Enter X2");
		double xTwo = inKey.nextDouble();
		System.out.println("Enter Y2");
		double yTwo = inKey.nextDouble();
		System.out.print("The distance between your coordinates is ");
		System.out.println( ( xTwo - xOne) * 2 + (yTwo - yOne)* 2);
		
	}


	
	
	public static void problem04() {
		Scanner inKey  = new Scanner(System.in);
		System.out.println("Enter a-value ");
		double a = inKey.nextDouble();
		System.out.println("Enter b-value");
		double b = inKey.nextDouble();
		System.out.print("Enter c-value");
		double c = inKey.nextDouble();
		double determinant = (b*b)-(4*a*c);
	     
		double d = b * b - 4.0 * a * c;
		if (d > 0.0) {

			double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
			double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);

		}

	}
	
	

	
}
