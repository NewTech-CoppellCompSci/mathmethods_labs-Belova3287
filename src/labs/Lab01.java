package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in); 
		System.out.println("Put a positive integer");
		int numEntered = inKey.nextInt();
		System.out.println("Enter another positve integer");
		int numEntered1 = inKey.nextInt();
		
		double num1Pow = Math.pow(numEntered,numEntered1);
		System.out.println(num1Pow + "\n");
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Input a positive number");
		int numEntered = inKey.nextInt();
		double num2 = Math.sqrt(numEntered);
		System.out.println(num2 + "\n");
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("What is the length of side A for the right triangle");
		double sideA = inKey.nextInt();
		System.out.println("What is the length of side B for the right triangle");
		double sideB = inKey.nextInt();
		double hypotenuse = Math.sqrt((sideA*sideA)+(sideB*sideB));
		System.out.println("Hypotenuse = " + hypotenuse);
		
		

	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		int numEntered;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		System.out.print("Enter an integer");
		numEntered = inKey.nextInt();
		while (numEntered > 0)//While 
			{
		System.out.print("Enter an integer");
		numEntered = inKey.nextInt();
		if (numEntered < 0)//if
		{
		System.out.print("Enter an integer");
		numEntered = inKey.nextInt();
		max = Math.max(max, numEntered);
		
		System.out.println(max);
		System.out.println("Max =" + max);
		min = Math.min(min, numEntered);
		System.out.println(min);
		System.out.println("Min =" + min);

		}
	}
	}
	
	
	
	
	
}
