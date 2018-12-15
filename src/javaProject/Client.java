package javaProject;

/*
 * File Name: 		Application.java
 * Name:			Kensal Ramos, Carlos, Jaime 
 * Course:			COP 2800C at Valencia College
 * Instructor:		David Stendel
 * Description:		Client class holds the basic information that all clients need.
 */

public class Client extends Person {

	private String compName;
	private String compAddress;
	private String contractExp;
	private double compBudget;

	public Client() {

	}

	// Create Constructs
	public Client(String SSN, String DOB, String email, String fName, String lName, String pNumber, String address,
			String emerCont, String ID, String compName, String compAddress, String contractExp, double compBudget) {
		super(SSN, DOB, email, fName, lName, pNumber, address, emerCont, ID);
		setCompName(compName);
		setCompAddress(compAddress);
		setContractExp(contractExp);
		setCompBudget(compBudget);
	}

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
		} else {
			this.compName = "compName not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
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
		} else {
			this.compAddress = "Company Address not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
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
		} else {
			this.contractExp = "gender not entered";
			System.out.println("\n\tError: Invalid data!\n");
		}
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
		} else {
			this.compBudget = 0.00;
			System.out.println("\n\tError: Invalid data!\n");
		}
	}

	/**
	 * @param
	 * @return
	 * @see
	 */
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;

		if (obj instanceof Client) {
			if (((Client) obj).getID() == this.getID()) {
				flag = true;
			}
		}
		return flag;

	}

	@Override
	public String toString() {
		return super.toString() + "Client [ID= " + getID() + ", Company Name= " + getCompName()
				+ "Contract Expiration= " + getContractExp() + "Budget= " + getCompBudget() + "]";
	}
}
