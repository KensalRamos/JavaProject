package javaProject;

/*
 * File Name: 		Application.java
 * Name:			Kensal Ramos, Carlos, Jaime 
 * Course:			COP 2800C at Valencia College
 * Instructor:		David Stendel
 * Description:		Employee class has the information every employee needs
 */

public class Employee extends Person {

	// Fields
	String
		maritalStat,
		qualif;
	
	public Employee() {
		
	}
	
	/*
	 * 
	 */
	public Employee(String maritalStat, String qualif) {
		
		setMaritalStat(maritalStat);
		setAddress(qualif);
		
	}

	/**
	 * @return The marital status(maritalStat)
	 */
	public String getMaritalStat() {
		return maritalStat;
	}

	/**
	 * @param maritalStat - The marital status(maritalStat) to set
	 */
	public void setMaritalStat(String maritalStat) {
		this.maritalStat = maritalStat;
	}

	/**
	 * @return The qualifications (qualif)
	 */
	public String getQualif() {
		return qualif;
	}

	/**
	 * @param qualif - The qualifications(qualif) to set
	 */
	public void setQualif(String qualif) {
		this.qualif = qualif;
	}
	
	
}
