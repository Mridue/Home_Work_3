package oopconcept;

public class StudentClass extends SpecializationClass {
	private int ssn;
	private String dob;
	public String name;
	public int id;

	public StudentClass(String name) {
		this.name = name;
	}

	public StudentClass(String name, int id) {
		this.name = name;
		this.id = id;
	}

	protected int getSsn() {
		System.out.println("Student name is : " + name);
		if (id > 0)

		{
			System.out.println("Student id is : " + id);
		} else if (id == 0) {
			System.out.println("Student id is : " + "trial student");
		}
		System.out.println("His Social Security No : " + ssn);
		return ssn;
	}

	protected void setSsn(int ssn) {
		this.ssn = ssn;
	}

	protected String getDob() {

		System.out.println("His Date of Birth : " + dob);
		return dob;
	}

	protected void setDob(String dob) {
		this.dob = dob;
	}

	public void getNameId(String name, int id) {
		System.out.println(name + " " + id);
	}

}
