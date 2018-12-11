package javaProject;

/*
 * File Name: 		Application.java
 * Name:			Kensal Ramos, Carlos, Jaime 
 * Course:			COP 2800C at Valencia College
 * Instructor:		David Stendel
 * Description:		Person class holds the basic information everyone has
 */

public class Person {

	// Fields
	private String
		SSN,
		DOB,
		email,
		fName,
		lName,
		pNumber,
		address,
		emerCont;
	private int 
		ID;
	
	public Person() {
		
	}
	
	/*
	 * 
	 */
	public Person(	String SSN, 	String DOB, 	String email, 	String fName,
					String lName, 	String pNumber, String address, String emerCont,
					int ID) {
		
		setSSN(SSN);
		setDOB(DOB);
		setEmail(email);
		setfName(fName);
		setlName(lName);
		setpNumber(pNumber);
		setAddress(address);
		setEmerCont(emerCont);
		setID(ID);
	}
	
	/**
	 * @return The social security number (SSN)
	 */
	public String getSSN() {
		return SSN;
	}
	
	/**
	 * @param SSN - The social security number (SSN) to set
	 */
	public void setSSN(String SSN) {
		this.SSN = SSN;
	}
	
	/**
	 * @return The date of birth (DOB)
	 */
	public String getDOB() {
		return DOB;
	}
	
	/**
	 * @param DOB - The date of birth (DOB) to set
	 */
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	/**
	 * @return The email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email - The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return The fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName - The first name (fName) to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return The lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName - The last name (lName) to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return The phone number (pNumber)
	 */
	public String getpNumber() {
		return pNumber;
	}

	/**
	 * @param pNumber - The phone number (pNumber) to set
	 */
	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	/**
	 * @return The address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address - The address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return The emerCont
	 */
	public String getEmerCont() {
		return emerCont;
	}

	/**
	 * @param emerCont - The emerCont to set
	 */
	public void setEmerCont(String emerCont) {
		this.emerCont = emerCont;
	}

	/**
	 * @return The ID
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param ID - The ID to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
}
