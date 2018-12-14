package oopconcept;


public class TestClass {

	public static void main(String[] args) {
		
		
		QaClass fall = new QaClass();
		fall.courseDuration = 5;
		fall.classDuration = "5 hrs";
		fall.maxStudent = 60;
		fall.getBatchInfo();
		System.out.println();
		fall.payment();
		System.out.println();
		

		QaClass summer = new QaClass();
		summer.getBatchInfo();
		
		

}}
