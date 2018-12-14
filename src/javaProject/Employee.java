package javaProject;

public class Employee extends Person {
	private String gender;//employee gender
	private String education;//highest education obtained or degree
	private String maritalStat;//married,single
	private String hireDate;//date hired
	private String jobTitle;//description of jobTitle
	private double wage;//yearly salary

	//Create Constructs
	public Employee(String SSN,String DOB, String email, String fName, String lName, String pNumber,
			String address, String emerCont, String ID,
			String gender, String education, String maritalStat, String hireDate,String jobTitle, double wage) {
		super(SSN, DOB, email, fName, lName, pNumber, address, emerCont,ID);
		this.gender = gender;
		this.education = education;
		this.maritalStat = maritalStat;
		this.hireDate = hireDate;
		this.jobTitle = jobTitle;
		this.wage = wage;
	}//end Employee
	
	//Create Getters and Setters
	
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		if (!gender.isEmpty()) {
			this.gender = gender;
		}//end if
		else {
			this.gender = "gender not entered";
			System.out.println("\n\tError: Invalid data!\n");
	}//end else
	}//end setGender
	/**
	 * @return the education
	 */
	public String getEducation() {
		return education;
	}

	/**
	 * @param education the education to set
	 */
	public void setEducation(String education) {
		if (!education.isEmpty()) {
			this.education = education;
		}// end if
		else {
			this.education = "education not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}//end else
	}//end setEducation

	/**
	 * @return the maritalStat
	 */
	public String getMaritalStat() {
		return maritalStat;
	}

	/**
	 * @param maritalStat the maritalStat to set
	 */
	public void setMaritalStat(String maritalStat) {
		if (!maritalStat.isEmpty()) {
			this.maritalStat = maritalStat;
		}// end if
		else {
			this.maritalStat = "marital status not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}//end else
	}//end setMaritalStat

	/**
	 * @return the hireDate
	 */
	public String getHireDate() {
		return hireDate;
	}

	/**
	 * @param hireDate the hireDate to set
	 */
	public void setHireDate(String hireDate) {
		if (!hireDate.isEmpty()) {
			this.hireDate = hireDate;
		}// end if
		else {
			this.hireDate = "hireDate not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}//end else
	}//end setHireDate

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		if (!jobTitle.isEmpty()) {
			this.jobTitle = jobTitle;
		}// end if
		else {
			this.jobTitle = "jobTitle not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}//end else
	}//end setJobTitle

	/**
	 * @return the wage
	 */
	public double getWage() {
		return wage;
	}

	/**
	 * @param wage the wage to set
	 */
	public void setWage(double wage) {
		if (wage != 0) {
			this.wage = wage;
		}// end if
		else {
			this.wage = 0.00;
			System.out.println("\n\tError: Invalid data!\n");
		}//end else
	}//end setWage
}//end Employee
