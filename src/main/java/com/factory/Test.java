package com.factory;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first number");
		double num1=scanner.nextDouble();
		
		System.out.println("Enter second number");
		double num2=scanner.nextDouble();
		

		System.out.println("Enter the type(add/divide/multiply");
		//String type=scanner.next();
		
		
		FactoryPattern factoryPattern=new FactoryPattern();
		Calculate obj=factoryPattern.performOperation(scanner.next());
		obj.calculate(num1, num2);

	}

}
