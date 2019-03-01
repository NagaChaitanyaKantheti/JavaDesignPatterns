package com.templateMethod;

public abstract class DataProcessor {
	public void dataProcessor() {
		readData();
		processData();
		saveToDb();
	}
	
	public abstract void readData();
	
	public abstract void processData();
	
	public void saveToDb() {
		System.out.println("Saving data to db");
	}
	
}
