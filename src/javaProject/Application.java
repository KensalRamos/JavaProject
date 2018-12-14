package javaProject;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		final int SIZE = 10;
		
		boolean
			flag = true;
		int
			choice = 0;
		
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
					case 0:
						flag = false;
						clrScreen();
						break;
					case 1:
						clrScreen();
						createMenu();
						createEmpEntry(SIZE, empData);
						break;
					case 2:
						clrScreen();
						retMenu();
						//retEntry();
						break;
					case 3:
						clrScreen();
						updateMenu();
						//updateEntry();
						break;
					case 4:
						clrScreen();
						delMenu();
						//delEntry();
						break;
						
					}
				} while (flag);
				
				flag = true;
				break;
			case 2:				
				clrScreen();
				
				// Client Menu
				do {
					clientMenu();
					
					choice  = scanner.nextInt();
					switch (choice) {
					case 0:
						flag = false;
						clrScreen();
						break;
					case 1:
						clrScreen();
						createMenu();
						createCEntry(SIZE, clientData);
						break;
					case 2:
						clrScreen();
						retMenu();
						//retEntry();
						break;
					case 3:
						clrScreen();
						updateMenu();
						//updateEntry();
						break;
					case 4:
						clrScreen();
						delMenu();
						//delEntry();
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
	 * 
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
				break;
					
				}
				
		}
	}
	
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
					
				printCEntry(i, database);
				break;
					
				}
				
		}
	}
	
	/*
	 * 
	 */
	public static void printEmpEntry(int i, Employee[] database) {
		
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
	
	/*
	 * 
	 */
	public static void printCEntry(int i, Client[] database) {
		
		System.out.println("\nEntry at index: " + i);
		System.out.println("\tName: \n\t  " + database[i].getfName() + " " + database[i].getlName());
		System.out.println("\tSSN:  \n\t  " + database[i].getSSN());
		System.out.println("\tDOB:  \n\t  " + database[i].getDOB());
		System.out.println("\tPhone Number:  \n\t  " + database[i].getpNumber());
		System.out.println("\tEmail: \n\t  " + database[i].getEmail());
		System.out.println("\tAddress: \n\t  " + database[i].getAddress());
		System.out.println();
		
	}
	
	
	
	
	
	
	
	
	
	
}
