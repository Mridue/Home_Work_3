package oopconcept;

public class TestClass2 {

	public static void main(String[] args) {
		StudentClass x = new StudentClass("Mike Tyson");
		x.setSsn(654837654);
		x.setDob("1/1/85");
		x.getSsn();
		x.getDob();
		System.out.println();

		x.location = "New York";
		x.newClassInfo();

		System.out.println();
		x.getBatchInfo("yes");
		System.out.println();

		StudentClass z = new StudentClass("Dave Warner", 100);
		z.setSsn(678208364);
		z.setDob("2/2/1990");
		z.getSsn();
		z.getDob();
	}

}
