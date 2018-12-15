package javaProject;

/*
 * File Name: Application.java 
 * Name: Kensal Ramos, Carlos Ortizfigueroa, Jaime
 * Course: COP 2800C at Valencia College 
 * Instructor: David Stendel 
 * Description: Person class holds the basic information everyone has.
 */ 

public class Person {

	// Fields

	private String SSN, DOB, email, fName, lName, pNumber, address, emerCont,ID;
	
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
		else {
			this.SSN = "SSN not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}//end else

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
		// addValidation
		if (!DOB.isEmpty()) {
			this.DOB = email;
		}
		else {
			this.DOB = "email not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		} 
		else {
			this.email = "email not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		} 
		else {
			this.fName = "fName not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		} 
		else {
			this.lName = "lName not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		} 
		else {
			this.pNumber = "pNumber not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		} 
		else {
			this.address = "address not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		} 
		else {
			this.emerCont = "emerCont not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

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
		}
		else {
			this.ID = "ID not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
	}
	
	//Utilities not getters and setters but help with work.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((SSN == null) ? 0 :SSN.hashCode());
				return result;
	}
	
	/**
	 * @param
	 * @return
	 * @see
	 */
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		
		if (obj instanceof Person) {
			if(((Person)obj).getSSN() == this.getSSN()){
			flag = true;
			}
		}
		return flag;
	}
	@Override
	public String toString() {
		return "Person [Name= " + getfName() + " " + getlName() + ", Date of Birth= "+ getDOB() + ",SSN= " + getSSN() + "]";
		}
}
