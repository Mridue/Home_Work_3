package oopconcept;

public class QaClass extends PntClass implements DemoClass {
	int courseDuration=4;
	int maxStudent=50;
	String classDuration="6 hrs";
	
	
	

	public void getBatchInfo() {System.out.println("The Duration of the course is "+courseDuration+ 
			" Months \n"+"Maximum student in a batch is " +maxStudent+ 
			"\n"+"Daily class Duration is "+classDuration); }

	@Override
	public void onCampus() {
		System.out.println("This location offers on Campus facility");

	}

	@Override
	public void isWeekend() {
		System.out.println("This Location Offers Weekend Batch");

	}

	@Override
	public void isWeekday() {

		System.out.println("This Location offers Weekday Batch");
	}

}
