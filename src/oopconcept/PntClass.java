package oopconcept;

public abstract class PntClass {
	final static String CEO="Abu Hanif";    
	static int fee=4000;


	    public abstract void onCampus();

	    public void online() {
	    	System.out.println("Classes are available Online");
	    }
	    public int payment() {
	    	System.out.println("The Entire Course Fee is $"+fee);
	    	return fee;}
	    }
