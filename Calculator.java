package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Please enter the first number");
		Scanner scanner = new Scanner(System.in); //Scanner class is used to get input from the user

    	double num1 = scanner.nextDouble();
		System.out.println(num1);
		
		System.out.println("Please enter the Second number");
		double num2 = scanner.nextDouble();
		System.out.println(num2);
		
		System.out.println("Next Please Choose an Operation");
		System.out.println("1 Addition");
		System.out.println("2 Subtraction");
		System.out.println("3 Multiplication");
		System.out.println("4 Division");
		
		int choice = scanner.nextInt();
		System.out.println(choice);
		
		if (choice==1)
		{ 
			System.out.println("Result: " +(num1 + num2));
		}	
		
		else if (choice==2)
		{
			System.out.println("Result: " +(num1 - num2));
		}
		
		else if (choice==3)
		{
			System.out.println("Result: " +(num1 * num2));
		}
		
		else if (choice==4)
		{
			if (num2 != 0)
			{	
			System.out.println("Result: " +(num1 / num2));
		    }
			else
			{
				System.out.println("Error: Division by zero is not allowed");
			}
		}
			else
			{
				System.out.println("Invalid Choice");
			
			}
		scanner.close();
		} // Closes main method

 
		
	}// Closes class


	
