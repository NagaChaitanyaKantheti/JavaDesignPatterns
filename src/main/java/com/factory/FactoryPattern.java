package com.factory;

public class FactoryPattern {
	public Calculate performOperation(String type) {
		Calculate obj=null;
		if(type.toLowerCase().equals("add")) {
			return obj=new Add();
		}
		else if(type.toLowerCase().equals("multiply")) {
			return obj=new Multiply();
		}
		else if(type.toLowerCase().equals("divide")) {
			return obj=new Divide();
		}
		else {
			System.out.println("We don't do that");
		}
		return obj;
	}
}
