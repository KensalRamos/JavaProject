package javaProject;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		boolean
			flag = true;
		int
			choice = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			displayMenu();
			choice = scanner.nextInt();
			
			switch (choice) {
			
			case 0:
				flag = false;
				break;
			case 1:
				viewEmpMenu();
				
				do {
					choice  = scanner.nextInt();
					switch (choice) {
					case 0:
						break;
					case 1:
						break;
					case 2:
						break;
						
					}
				} while (flag);
				
				break;
			case 2:
				viewClientMenu();
				break;
			
			}
			
		} while(flag);
		
		//clrScreen();
		
		
		//clrScreen();
		
		
		//clrScreen();
		
		createMenu();
		//clrScreen();
		
		retMenu();
		//clrScreen();
		
		delMenu();
		//clrScreen();
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
	public static void viewEmpMenu() {
		
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
	public static void viewClientMenu() {
		
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
	protected static void clrScreen() {

		// Clear screen
		for (int i = 0; i < 50; ++i)
			System.out.print("\r\n");
	}
	
}
