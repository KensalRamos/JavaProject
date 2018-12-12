package javaProject;

/**
 * File Name: Application.java Name: Kensal Ramos, Carlos Ortizfigueroa, Jaime
 * Course: COP 2800C at Valencia College Instructor: David Stendel Description:
 * Person class holds the basic information everyone has
 */

public class Person {

	// Fields

	private String SSN, DOB, email, fName, lName, pNumber, address, emerCont,ID;

	//private int ID; was made a string

	public Person() {

	}

	/*
	 * 
	 */

	public Person(String SSN, String DOB, String email, String fName,

			String lName, String pNumber, String address, String emerCont,

			String ID) {

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
	 * 
	 * @return The social security number (SSN)
	 * 
	 */

	public String getSSN() {

		return SSN;

	}

	/**
	 * 
	 * @param SSN
	 *            - The social security number (SSN) to set
	 * 
	 */

	public void setSSN(String SSN) {
		// Validation
		if (!SSN.isEmpty()) {
			this.SSN = SSN;
		} // end if

	}// end setSSN

	/**
	 * 
	 * @return The date of birth (DOB)
	 * 
	 */

	public String getDOB() {

		return DOB;

	}

	/**
	 * 
	 * @param DOB
	 *            - The date of birth (DOB) to set
	 * 
	 */

	public void setDOB(String DOB) {
		// Validation
		if (!DOB.isEmpty()) {
			this.DOB = DOB;
		} // end if
	}// end setDOB

	/**
	 * 
	 * @return The email
	 * 
	 */

	public String getEmail() {

		return email;

	}

	/**
	 * 
	 * @param email
	 *            - The email to set
	 * 
	 */

	public void setEmail(String email) {
		if (!email.isEmpty()) {
			this.email = email;
		} // end if
	}// end setEmail

	/**
	 * 
	 * @return The fName
	 * 
	 */

	public String getfName() {

		return fName;

	}

	/**
	 * 
	 * @param fName
	 *            - The first name (fName) to set
	 * 
	 */

	public void setfName(String fName) {
		if (!fName.isEmpty()) {
			this.fName = fName;
		} // end if
	}// end setfName

	/**
	 * 
	 * @return The lName
	 * 
	 */

	public String getlName() {

		return lName;

	}

	/**
	 * 
	 * @param lName
	 *            - The last name (lName) to set
	 * 
	 */

	public void setlName(String lName) {
		if (!lName.isEmpty()) {
			this.lName = lName;
		} // end if
	}// end setlName

	/**
	 * 
	 * @return The phone number (pNumber)
	 * 
	 */

	public String getpNumber() {

		return pNumber;

	}

	/**
	 * 
	 * @param pNumber
	 *            - The phone number (pNumber) to set
	 * 
	 */

	public void setpNumber(String pNumber) {
		if (!pNumber.isEmpty()) {
			this.pNumber = pNumber;
		} // end if
	}// end setpNumber

	/**
	 * 
	 * @return The address
	 * 
	 */

	public String getAddress() {

		return address;

	}

	/**
	 * 
	 * @param address
	 *            - The address to set
	 * 
	 */

	public void setAddress(String address) {
		if (!address.isEmpty()) {
			this.address = address;
		} // end if
	}// end setAddress

	/**
	 * 
	 * @return The emerCont
	 * 
	 */

	public String getEmerCont() {

		return emerCont;

	}

	/**
	 * 
	 * @param emerCont
	 *            - The emerCont to set
	 * 
	 */

	public void setEmerCont(String emerCont) {
		if (!emerCont.isEmpty()) {
			this.emerCont = emerCont;
		} // end if
	}// end setEmerCont

	/**
	 * 
	 * @return The ID
	 * 
	 */

	public String getID() {//changed to string

		return ID;

	}

	/**
	 * 
	 * @param ID
	 *            - The ID to set
	 * 
	 */

	public void setID(String ID) {// this was changed to a string
		if (!ID.isEmpty()) {
			this.ID = ID;
		} // end if

	}// end setID

}// end person
