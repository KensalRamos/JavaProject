package javaProject;

/*
 * File Name: 		Application.java
 * Name:			Kensal Ramos, Carlos, Jaime 
 * Course:			COP 2800C at Valencia College
 * Instructor:		David Stendel
 * Description:		Final project for java course...
 * 
 * Team members:	Kensal J. Ramos, Jaime, Carlos
 * Date:			5 December 2018	-	Main class created
 * 
 */

//Imports
import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		final int SIZE = 10;
		
		boolean
			flag = true;
		int
			choice = 0,
			temp = 0;
		
		// Database
		Employee[] empData = new Employee[10];
		Client[] clientData = new Client[10];
		
		
		Scanner scanner = new Scanner(System.in);
		
		// Main Menu
		do {
			displayMenu();
			choice = scanner.nextInt();
			
			switch (choice) {
			
			case 0:
				flag = false;
				break;
			case 1:
				clrScreen();
				
				// Employee Menu
				do {				
					empMenu();
					
					choice  = scanner.nextInt();
					switch (choice) {
					// Exit menu
					case 0:
						flag = false;
						clrScreen();
						break;
					// Create an entry
					case 1:
						clrScreen();
						createMenu();
						createEmpEntry(SIZE, empData);
						break;
					// Retrieve an entry
					case 2:
						clrScreen();
						retMenu();
						temp = retEntry(empData, SIZE);
						if (empData[temp] != null) {
							printEmpEntry(temp, empData);
						}
						else
							System.out.println("Entry not found.");
						break;
					// Update an entry
					case 3:
						clrScreen();
						updateMenu();
						updateEmpEntry(retEntry(empData, SIZE), empData);
						break;
					// Delete an entry
					case 4:
						clrScreen();
						delMenu();
						delEntry(retEntry(empData, SIZE), empData);
						break;
						
					}
				} while (flag);
				
				flag = true;
				break;
			case 2:				
				clrScreen();
				
				// Client menu
				do {
					clientMenu();
					
					choice  = scanner.nextInt();
					switch (choice) {
					// Exit menu
					case 0:
						flag = false;
						clrScreen();
						break;
					// Create new entry 
					case 1:
						clrScreen();
						createMenu();
						createCEntry(SIZE, clientData);
						break;
					// Retrieve an entry
					case 2:
						clrScreen();
						retMenu();
						temp = retEntry(clientData, SIZE);
						if (clientData[temp] != null) {
							printCEntry(temp, clientData);
						}
						else
							System.out.println("Entry not found.");
						break;
					// Update an entry
					case 3:
						clrScreen();
						updateMenu();
						updateCEntry(retEntry(clientData, SIZE), clientData);
						break;
					// Delete an entry
					case 4:
						clrScreen();
						delMenu();
						delEntry(retEntry(clientData, SIZE), clientData);
						break;
						
					}
				} while (flag);
				
				break;
			
			}
			
		} while(flag);
		
		scanner.close();
		
	}
	
	/*
	 * Name: 			displayCMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description: 	Prints main menu
	 */
	public static void displayMenu() {
		System.out.println("\t---------------------------------");
		System.out.println("\t|\t   -Client Menu-\t|");
		System.out.println("\t---------------------------------");
		System.out.println("\t|\t0) Exit \t\t|");
		System.out.println("\t|\t1) Employee Menu \t|");
		System.out.println("\t|\t2) Client Menu \t\t|");
		System.out.println("\t---------------------------------");
	}
	
	/*
	 * Name: 			viewEmpMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Display employee menu.
	 */
	public static void empMenu() {
		
		System.out.println("\t---------------------------------");
		System.out.println("\t|     -Employee Information-  \t|");
		System.out.println("\t---------------------------------");
		System.out.println("\t|\t0) Previous Menu\t|");
		System.out.println("\t|\t1) Create Employee\t|");
		System.out.println("\t|\t2) Retrieve Employee\t|");
		System.out.println("\t|\t3) Update Employee\t|");
		System.out.println("\t|\t4) Delete Employee\t|");
		System.out.println("\t---------------------------------");
		
	}
	
	/*
	 * Name: 			viewClientMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Display client menu.
	 */
	public static void clientMenu() {
		
		System.out.println("\t---------------------------------");
		System.out.println("\t|     -Client Information-  \t|");
		System.out.println("\t---------------------------------");
		System.out.println("\t|\t0) Previous Menu\t|");
		System.out.println("\t|\t1) Create Client\t|");
		System.out.println("\t|\t2) Retrieve Client\t|");
		System.out.println("\t|\t3) Update Client\t|");
		System.out.println("\t|\t4) Delete Client\t|");
		System.out.println("\t---------------------------------");
		
	}
	
	/*
	 * Name: 			createMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Display create menu.
	 */
	public static void createMenu() {
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t|\t\t -Create Entry- \t\t|");
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t| Enter each piece of information as it comes up|\n"
						 + "\t| If you would like that piece of information to|\n "
						 + "\t| remain empty enter 0.\t\t\t\t|");
		System.out.println("\t-------------------------------------------------");
	}
	
	/*
	 * Name: 			retMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Display retrieve menu.
	 */
	public static void retMenu() {
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t|\t\t -Retrieve Entry- \t\t|");
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t| Enter the desired entry's last name.\t\t|");
		System.out.println("\t-------------------------------------------------");
	}
	
	/*
	 * Name: 			updateMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Display update menu.
	 */
	public static void updateMenu() {
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t|\t\t -Update Entry- \t\t|");
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t| Enter the desired entry's last name.\t\t|");
		System.out.println("\t-------------------------------------------------");
	}
	
	/*
	 * Name: 			delMenu()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Display delete menu.
	 */
	public static void delMenu() {
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t|\t\t -Delete Entry- \t\t|");
		System.out.println("\t-------------------------------------------------");
		System.out.println("\t| Enter the desired entry's last name.\t\t|");
		System.out.println("\t-------------------------------------------------");
	}
	
	/*
	 * Name: 			clrScreen()
	 * Parameters: 		None
	 * Return Value: 	None
	 * Description:		Clear screen.
	 */
	public static void clrScreen() {

		// Clear screen
		for (int i = 0; i < 50; ++i)
			System.out.print("\r\n");
	}
	
	/*
	 * Name: 			createEmpEntry()
	 * Parameters: 		int SIZE				- Size of the database array
	 * 					Employee[] database		- Array of employee objects
	 * Return Value: 	None
	 * Description:		Create a new employee entry
	 */
	public static void createEmpEntry(int SIZE, Employee[] database) {
		
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < SIZE; i++) {
			// If SSN is empty...
			if(database[i] == null) {
				
				database[i] = new Employee();
				
				// Get SSN
				System.out.print("Please enter a Social Security Number: ");
				database[i].setSSN(scanner.nextLine());
				System.out.println("You entered: " + database[i].getSSN());

				// Get last name
				System.out.print("Please enter a last name: ");
				database[i].setlName(scanner.nextLine());
				System.out.println("You entered: " + database[i].getlName());
				
				// Get first name
				System.out.print("Please enter a first name: ");
				database[i].setfName(scanner.nextLine());
				System.out.println("You entered: " + database[i].getfName());
				
				// Get DOB
				System.out.print("Please enter a date of birth: ");
				database[i].setDOB(scanner.nextLine());
				System.out.println("You entered: " + database[i].getDOB());
				
				// Get pNumber
				System.out.print("Please enter a phone number: ");
				database[i].setpNumber(scanner.nextLine());
				System.out.println("You entered: " + database[i].getpNumber());
				
				// Get email
				System.out.print("Please enter an email: ");
				database[i].setEmail(scanner.nextLine());
				System.out.println("You entered: " + database[i].getEmail());
				
				// Get address
				System.out.print("Please enter an address: ");
				database[i].setAddress(scanner.nextLine());
				System.out.println("You entered: " + database[i].getAddress());
				
				// Employee-only information:
				
				// Get gender
				System.out.print("Please enter gender: ");
				database[i].setGender(scanner.nextLine());
				System.out.println("You entered: " + database[i].getGender());
				
				// Get education
				System.out.print("Please enter education: ");
				database[i].setEducation(scanner.nextLine());
				System.out.println("You entered: " + database[i].getEducation());
				
				// Get MaritalStat
				System.out.print("Please enter a marital status: ");
				database[i].setMaritalStat(scanner.nextLine());
				System.out.println("You entered: " + database[i].getMaritalStat());
				
				// Get hire date
				System.out.print("Please enter the date of employment: ");
				database[i].setHireDate(scanner.nextLine());
				System.out.println("You entered: " + database[i].getHireDate());
				
				// Get job title
				System.out.print("Please enter the job title: ");
				database[i].setJobTitle(scanner.nextLine());
				System.out.println("You entered: " + database[i].getJobTitle());
				
				// Get wage
				System.out.print("Please enter wage: ");
				database[i].setWage(scanner.nextDouble());
				System.out.println("You entered: " + database[i].getWage());
					
				printEmpEntry(i, database);
				//delEmpEntry(i, database);
				break;
					
				}
				
		}
		
	}
	
	/*
	 * Name: 			createCEntry()
	 * Parameters: 		int SIZE				- Size of the database array
	 * 					Employee[] database		- Array of employee objects
	 * Return Value: 	None
	 * Description:		Create a new employee entry
	 */
	public static void createCEntry(int SIZE, Client[] database) {
		
		Scanner scanner = new Scanner(System.in);

		for(int i = 0; i < SIZE; i++) {
			// If SSN is empty...
			if(database[i] == null) {
				
				database[i] = new Client();
				
				// Get SSN
				System.out.print("Please enter a Social Security Number: ");
				database[i].setSSN(scanner.nextLine());
				System.out.println("You entered: " + database[i].getSSN());

				// Get last name
				System.out.print("Please enter a last name: ");
				database[i].setlName(scanner.nextLine());
				System.out.println("You entered: " + database[i].getlName());
				
				// Get first name
				System.out.print("Please enter a first name: ");
				database[i].setfName(scanner.nextLine());
				System.out.println("You entered: " + database[i].getfName());
				
				// Get DOB
				System.out.print("Please enter a date of birth: ");
				database[i].setDOB(scanner.nextLine());
				System.out.println("You entered: " + database[i].getDOB());
				
				// Get pNumber
				System.out.print("Please enter a phone number: ");
				database[i].setpNumber(scanner.nextLine());
				System.out.println("You entered: " + database[i].getpNumber());
				
				// Get email
				System.out.print("Please enter an email: ");
				database[i].setEmail(scanner.nextLine());
				System.out.println("You entered: " + database[i].getEmail());
				
				// Get address
				System.out.print("Please enter an address: ");
				database[i].setAddress(scanner.nextLine());
				System.out.println("You entered: " + database[i].getAddress());
				
				// Client-only information
				
				// Get company name
				System.out.print("Please enter a company name: ");
				database[i].setCompName(scanner.nextLine());
				System.out.println("You entered: " + database[i].getCompName());
				
				// Get company address
				System.out.print("Please enter a company address: ");
				database[i].setCompAddress(scanner.nextLine());
				System.out.println("You entered: " + database[i].getCompAddress());
				
				// Get contract expiration date
				System.out.print("Please enter a contract expiration date: ");
				database[i].setContractExp(scanner.nextLine());
				System.out.println("You entered: " + database[i].getContractExp());
				
				// Get company budget
				System.out.print("Please enter a company budget: ");
				database[i].setCompBudget(scanner.nextDouble());
				System.out.println("You entered: " + database[i].getCompBudget());
				
				printCEntry(i, database);
				break;
					
				}
			
			
				
		}
		
		
	}
	
	/*
	 * Name: 			printEmpEntry()
	 * Parameters: 		int i					- Index of desired object
	 * 					Employee[] database		- Array of employees
	 * Return Value: 	None
	 * Description:		Print desired employee object
	 */
	public static void printEmpEntry(int i, Employee[] database) {
		
		if (database != null) {
			System.out.println("\nEntry at index: " + i);
			System.out.println("\tName: \n\t  " + database[i].getfName() + " " + database[i].getlName());
			System.out.println("\tSSN:  \n\t  " + database[i].getSSN());
			System.out.println("\tDOB:  \n\t  " + database[i].getDOB());
			System.out.println("\tPhone Number:  \n\t  " + database[i].getpNumber());
			System.out.println("\tEmail: \n\t  " + database[i].getEmail());
			System.out.println("\tAddress: \n\t  " + database[i].getAddress());
			System.out.println("\tGender: \n\t  " + database[i].getGender());
			System.out.println("\tEducaton: \n\t  " + database[i].getEducation());
			System.out.println("\tMarital Stat: \n\t  " + database[i].getMaritalStat());
			System.out.println("\tHire Date: \n\t  " + database[i].getHireDate());
			System.out.println("\tJob Title: \n\t  " + database[i].getJobTitle());
			System.out.println("\tWage: \n\t  " + database[i].getWage());
			System.out.println();
		}
		else {
			System.out.println("Printing failed.");
		}
		
	}
	
	/*
	 * Name: 			printCEntry()
	 * Parameters: 		int i					- Index of desired object
	 * 					Client[] database		- Array of clients
	 * Return Value: 	None
	 * Description:		Print desired client object
	 */
	public static void printCEntry(int i, Client[] database) {
		
		if (database != null) {
			System.out.println("\nEntry at index: " + i);
			System.out.println("\tName: \n\t  " + database[i].getfName() + " " + database[i].getlName());
			System.out.println("\tSSN:  \n\t  " + database[i].getSSN());
			System.out.println("\tDOB:  \n\t  " + database[i].getDOB());
			System.out.println("\tPhone Number:  \n\t  " + database[i].getpNumber());
			System.out.println("\tEmail: \n\t  " + database[i].getEmail());
			System.out.println("\tAddress: \n\t  " + database[i].getAddress());
			System.out.println("\tCompany Name: \n\t  " + database[i].getCompName());
			System.out.println("\tCompany Address \n\t  " + database[i].getCompAddress());
			System.out.println("\tContract Expiration: \n\t  " + database[i].getContractExp());
			System.out.println("\tCompany Budget: \n\t  " + database[i].getAddress());
			System.out.println();
		}
		else {
			System.out.println("Printing failed.");
		}
		
	}
	
	/*
	 * Name: 			retEntry()
	 * Parameters: 		Person[] database	- Array of clients/employees
	 * 					int SIZE			- Size of the array 
	 * Return Value: 	None
	 * Description:		Retrieve desired entry
	 */
	public static int retEntry(Person[] database, int SIZE) {
		
		String temp;
		int index = 0;
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Please enter the last name of the desired entry: ");
		temp = scanner.nextLine();
		
		for (int i = 0; i < SIZE; i++) {
			
			// If it is not empty...
			if (database[i] != null) {
		
				// Test each char individually
				if (database[i].getlName().equals(temp)) {
					index  = i;
					System.out.println("Found matching entry successfully");
					break;
				}
				
			}
		}
		
		
		return index;
	}
	
	/*
	 * Name: 			delEntry()
	 * Parameters: 		int i				- Index of desired object
	 * 					Person[] database	- Array of employee/client objects
	 * Return Value: 	None
	 * Description:		Delete desired entry
	 */
	public static void delEntry(int i, Person[] database) {
		database[i] = null;
	}
	
	/*
	 * Name: 			updateEmpEntry()
	 * Parameters: 		int i				- Index of desired object
	 * 					Person[] database	- Array of employee objects
	 * Return Value: 	None
	 * Description:		Update desired object. Prompts the user if they want to update particular portions
	 */
	public static void updateEmpEntry(int i, Employee[] database) {
		
		int
			num = 0;
		String
			choice = "";
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Entry found was: ");
		printEmpEntry(i, database);
		
		if (database[i] != null) {
			
			// SSN
			do {
				
				System.out.println("Would you like to update the Social Security Number? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired SSN: ");
					database[i].setSSN(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Last name
			do {
				
				System.out.println("Would you like to update the last name? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired last name: ");
					database[i].setlName(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// First name 
			do {
				
				System.out.println("Would you like to update the first name? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired first name: ");
					database[i].setfName(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Date of birth
			do {
				
				System.out.println("Would you like to update the DOB? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired DOB: ");
					database[i].setDOB(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Phone number
			do {
				
				System.out.println("Would you like to update the phone number? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired phone number: ");
					database[i].setpNumber(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Email
			do {
				
				System.out.println("Would you like to update the email? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired email: ");
					database[i].setEmail(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Address
			do {
				
				System.out.println("Would you like to update the address? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired address: ");
					database[i].setAddress(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Gender
			do {
				
				System.out.println("Would you like to update the gender? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired gender: ");
					database[i].setGender(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Education
			do {
				
				System.out.println("Would you like to update the education? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired education: ");
					database[i].setEducation(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Marital status
			do {
				
				System.out.println("Would you like to update the marital status? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired marital status: ");
					database[i].setMaritalStat(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Date of employment
			do {
				
				System.out.println("Would you like to update the date of employment? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired date of employment: ");
					database[i].setHireDate(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Job title
			do {
				
				System.out.println("Would you like to update the job title? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired job title: ");
					database[i].setJobTitle(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Wage
			do {
				
				System.out.println("Would you like to update the wage? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired wage: ");
					database[i].setWage(scanner.nextDouble());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
		}
		
		
	}
	
	
	/*
	 * Name: 			updateCEntry()
	 * Parameters: 		int i				- Index of desired object
	 * 					Person[] database	- Array of client objects
	 * Return Value: 	None
	 * Description:		Update desired object. Prompts the user if they want to update particular portions
	 */
	public static void updateCEntry(int i, Client[] database) {
		
		int
			num = 0;
		String
			choice = "";
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Entry found was: ");
		printCEntry(i, database);
		
		if (database[i] != null) {
			
			// SSN
			do {
				
				System.out.println("Would you like to update the Social Security Number? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired SSN: ");
					database[i].setSSN(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Last name
			do {
				
				System.out.println("Would you like to update the last name? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired last name: ");
					database[i].setlName(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// First name 
			do {
				
				System.out.println("Would you like to update the first name? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired first name: ");
					database[i].setfName(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Date of birth
			do {
				
				System.out.println("Would you like to update the DOB? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired DOB: ");
					database[i].setDOB(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Phone number
			do {
				
				System.out.println("Would you like to update the phone number? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired phone number: ");
					database[i].setpNumber(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Email
			do {
				
				System.out.println("Would you like to update the email? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired email: ");
					database[i].setEmail(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Address
			do {
				
				System.out.println("Would you like to update the address? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired address: ");
					database[i].setAddress(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Company name
			do {
				
				System.out.println("Would you like to update the company name? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired company name: ");
					database[i].setCompName(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Company address
			do {
				
				System.out.println("Would you like to update the company address? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired company address: ");
					database[i].setCompAddress(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Contract expiration
			do {
				
				System.out.println("Would you like to update the contract expiration date? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired contract expiration date: ");
					database[i].setContractExp(scanner.nextLine());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
			
			// Company budget
			do {
				
				System.out.println("Would you like to update the company budget? (y or n)");
				choice = scanner.nextLine();
				
				if (choice.equals("y") || choice.equals("Y")) {
					
					System.out.println("Please enter desired company budget: ");
					database[i].setCompBudget(scanner.nextDouble());
					
					System.out.println("Entry has been modified.");
					num = 0;
				}
				else if (choice.equals("n") || choice.equals("N")) {
					
					System.out.println("No changes made.");
					num = 0;
				}
				else {
					
					System.out.println("Invalid choice entered!");
					num = 1;
				}
				
			} while (num == 1);
		}
		
		
	}
	
}
