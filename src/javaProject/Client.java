package javaProject;

/*
 * File Name: 		Application.java
 * Name:			Kensal Ramos, Carlos, Jaime 
 * Course:			COP 2800C at Valencia College
 * Instructor:		David Stendel
 * Description:		Client class holds the basic information that all clients need.
 */

public class Client extends Person {
	
	private String compName;//company name
	private String compAddress;//company address
	private String contractExp;//contract expiration
	private double compBudget;//company budget
	
	//Create Constructs
	public Client(String SSN,String DOB, String email, String fName, String lName, String pNumber,
			String address, String emerCont, String ID,
			String compName, String compAddress, String contractExp, double compBudget) {
		super(SSN, DOB, email, fName, lName, pNumber, address, emerCont,ID);
		this.compName = compName;
		this.compAddress = compAddress;
		this.contractExp = contractExp;
		this.compBudget = compBudget;		
	}//end Employee

	/**
	 * @return the compName
	 */
	public String getCompName() {
		return compName;
	}

	/**
	 * @param compName the compName to set
	 */
	public void setCompName(String compName) {
		if (!compName.isEmpty()) {
			this.compName = compName;
		}//end if
		else {
			this.compName = "compName not entered";
			System.out.println("\n\tError: Invalid data!\n");
	}//end else
	}

	/**
	 * @return the compAddress
	 */
	public String getCompAddress() {
		return compAddress;
	}

	/**
	 * @param compAddress the compAddress to set
	 */
	public void setCompAddress(String compAddress) {
		if (!compAddress.isEmpty()) {
			this.compAddress = compAddress;
		}//end if
		else {
			this.compAddress = "Company Address not entered";
			System.out.println("\n\tError: Invalid data!\n");
	}//end else
	}

	/**
	 * @return the contractExp
	 */
	public String getContractExp() {
		return contractExp;
	}

	/**
	 * @param contractExp the contractExp to set
	 */
	public void setContractExp(String contractExp) {
		if (!contractExp.isEmpty()) {
			this.contractExp = contractExp;
		}//end if
		else {
			this.contractExp = "gender not entered";
			System.out.println("\n\tError: Invalid data!\n");
	}//end else
	}

	/**
	 * @return the compBudget
	 */
	public double getCompBudget() {
		return compBudget;
	}

	/**
	 * @param compBudget the compBudget to set
	 */
	public void setCompBudget(double compBudget) {
		if (compBudget != 0) {
			this.compBudget = compBudget;
		}//end if
		else {
			this.compBudget = 0.00;
			System.out.println("\n\tError: Invalid data!\n");
	}//end else
	}
	
}//end Client
