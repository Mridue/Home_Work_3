package oopconcept;

import java.util.Scanner;

public class SpecializationClass extends QaClass {
	
	
    String location1="New York";
    String location2="Virginia";
    
	int fee = 2000;
	static int courseDuration = 2;
	static int maxStudent = 30;
	static String classDuration = "8 hrs";

	String tutor1 = "Matt Damon";
	String tutor2 = "Jerry Donovan";

	public void getBatchInfo(String automation) {
		// Scanner input =new Scanner(System.in);
		// System.out.println("Are you doing Automation");String
		// Automation=input.nextLine();
		if (automation == "yes") {
			System.out.println(
					"The Duration of the course is " + courseDuration + " Months \n" + "Maximum student in a batch is "
							+ maxStudent + "\n" + "Daily class Duration is " + classDuration);
		} else if (automation == "no") {
			System.out.println("Please visit our office for furtehr Information");
		}
	}

	public void newClassInfo() {
		 System.out.println("Please choose a location- New York or Virginia");
		Scanner input= new Scanner(System.in);
		 String area=input.nextLine();
		System.out.println("You have selected " + area);
		if (location1.equals(area)) {
			tutor1 = "Matt Damon";
			System.out.println("Instructor for this location is " + tutor1);
			onCampus();
			isWeekend();
			isWeekday();
			System.out.println("The Fee is $" + fee);
		} else if (location2.equals(area)) {
			tutor2 = "Jerry Donovan";
			System.out.println("Instructor for this location is " + tutor2);
			onCampus();
			online();
			isWeekend();
			isWeekday();
			System.out.println("The Fee is $" + fee);
		} else {
			System.out.println("Invalid Selection");
		}
	}

}
