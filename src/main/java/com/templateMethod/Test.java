package com.templateMethod;

public class Test {

	public static void main(String args[]) {
		DataProcessor obj1=new TextFile();
		obj1.dataProcessor();
		
		obj1=new ExcelFile();
		obj1.dataProcessor();
	}
}
