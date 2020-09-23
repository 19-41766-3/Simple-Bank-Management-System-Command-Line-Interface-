import java.util.Scanner;
import myPackage.accountManagement.*;
import myPackage.employeeCustomerManagement.*;
import myPackage.transectionManagement.*;

public class Start
{
	public static void main(String args[])
	{
		mainMenu(); // It's seperated so that we can go to main menu any time we want
	}
//Code for clear screen
	public static void cls()
{
	try
	{	
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	}catch(Exception E)
		{
			System.out.println(E);
		}
}
//----------------------
	public static void mainMenu()
	{

//Code for clear screen
		    for(int i=1; i<=100; i=i+25)
		{
			System.out.println("Loading... \n\nProgress : "+i+"%");
			cls();
		}  
//----------------------
		   // System.out.println("\nWelcome! (^.^)"); 
   //          System.out.println();	
   //          System.out.println("           ________________________________________________________________________");
			// System.out.println("          |                                                                        |");
			// System.out.println("          |                           Bank Management System                       |");
			// System.out.println("          |________________________________________________________________________|");
			// System.out.println();


System.out.println("\n\t\t\t+-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+ +-+");
System.out.println("\t\t\t|B| |a| |n| |k|   |M| |a| |n| |a| |g| |e| |m| |e| |n| |t|   |S| |y| |s| |t| |e| |m|");
System.out.println("\t\t\t+-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+ +-+   +-+ +-+ +-+ +-+ +-+ +-+");


		try //In this try block we have written the code in order to handle exception
		{
			Bank bank=new Bank(); //Creating object for bank class
			Employee existingEmployee=new Employee(); //Creating object for Employee class to define existing employee
			Customer existingCustomer=new Customer(); //Creating object for Customer class to define existing customer
			Scanner input=new Scanner(System.in); //Defining Scanner class object to take input 
			int option;
			do
			{
				System.out.println("\n\t\t\t\t\t[ Main Menu ]");
				System.out.println("\n\t1. Employee Management\n\t2. Customer Management\n\t3. Customer Account Management\n\t4. Account Transactions\n\t5. Exit");
				System.out.print("\nEnter Command :~> ");
				option=input.nextInt();
				input.nextLine();
				if(option==1) // 1. Employee Management
				{
					String name; //This is from Employee class
					String employeeId; //This is from Employee class
					double salary; //This is from Employee class
					Employee newEmployee=new Employee(); //This is Employee class object to create new employee 
					System.out.println("\t\t\t\t\t[ Employee Management ]");
					System.out.println("\n\t\t1. Add New Employee\n\t\t2. Remove Existing Employee\n\t\t3. Show All Employees\n\t\t4. Back");
					System.out.print("\nEnter Command :~> ");
					option=input.nextInt();
					input.nextLine();
					if(option==1) // 1. Employee Management --> 1. Add New Employee
					{
						
						System.out.print("ENTER NAME OF THE EMPLOYEE  : ");
						name=input.nextLine();
						newEmployee.setName(name); //Passing name from Employee class
						System.out.print("ENTER EMPLOYEE'S ID         : ");
						employeeId=input.nextLine();
						newEmployee.setEmployeeId(employeeId); //Passing employeeId from Employee class in order to add new employee
						System.out.print("ENTER EMPLOYEE'S SALARY     : ");
						salary=input.nextDouble();
						newEmployee.setSalary(salary); //Passing employeeId from Employee class
						bank.addEmployee(newEmployee); //Passing newEmployee object in oeder to add new employee
					}
					else if(option==2) // 1. Employee Management --> 2. Remove Existing Employee
					{
						
						System.out.print("ENTER EMPLOYEE'S ID         : ");
						employeeId=input.nextLine();
						bank.removeEmployee(bank.getEmployee(employeeId)); //Passing employeeId from Employee class in order to remove new employee
					}
					else if(option==3) // 1. Employee Management --> 3. Show All Employees
					{
						
						bank.showAllEmployees(); //Calling showAllEmployees() method from Bank class with bank object
					}
					else if(option==4) // 1. Employee Management --> 4. Back
					{
						mainMenu(); // It used to back to the main menu
					}
					else
					{
						System.out.println("\n[x] No such option\nPlease select another option");
					}
				}
				else if(option==2) // 2. Customer Management 
				{
					String name; //This is from Customer class
					int nid; //This is from Customer class
					Customer newCustomer=new Customer(); //This is Customer class object to create new employee 
					System.out.println("\t\t\t\t\t[ Customer Management ]");
					System.out.println("\n\t\t1. Add New Customer\n\t\t2. Remove Existing Customer\n\t\t3. Show All Customer\n\t\t4. Back");
					System.out.print("\nEnter Command :~> ");
					option=input.nextInt();
					input.nextLine();
					if(option==1) // 2. Customer Management --> 1. Add New Customer
					{   
						
						System.out.print("ENTER THE NAME OF CUSTOMER : ");
						name=input.nextLine();
						newCustomer.setName(name); //Passing name from Customer class
						System.out.print("ENTER CUSTOMER'S NID       : ");
						nid=input.nextInt();
						input.nextLine();
						newCustomer.setNid(nid); //Passing nid from Customer class
						bank.addCustomer(newCustomer); //Passing newCustomer from Customer class in order to add new customer
					}
					else if(option==2) // 2. Customer Management --> 2. Remove Existing Customer
					{
						
						System.out.print("ENTER CUSTOMER'S NID      : ");
						nid=input.nextInt();
						input.nextLine();
						bank.removeCustomer(bank.getCustomer(nid)); //Passing nid from Customer class in order to remove new customer
					}
					else if(option==3)
					{
						
						
						bank.showAllCustomers(); //Calling showAllCustomers() method from Bank class with bank object
						
					}
					else if(option==4){
						mainMenu(); // It used to back to the main menu
					}
					else
					{
						System.out.println("\n[x] No such option\nPlease select another option");
					}
				}
				else if(option==3) // 3. Customer Account Management
				{
					int accountNumber; //Tjis is from Account class
					double balance; //This is from Account class
					double interestRate; //This is from SavingsAccount class
					int tenureYear; //This is from FixedAccount class
					System.out.println("\t\t\t\t\t[ Customer Account Management ]");
					System.out.println("\n\t\t1. Add New Account\n\t\t2. Remove Existing Account\n\t\t3. Show All Accounts\n\t\t4. Back");
					System.out.print("\nEnter Command :~> ");
					option=input.nextInt();
					input.nextLine();
					if(option==1) // 3. Customer Account Management --> 1. Add New Account
					{   
						System.out.println("\nWhat type of account you want to create?");
				        System.out.println();
						System.out.println("\n\t\t\t1. Savings Account\n\t\t\t2. Fixed Account\n\t\t\t3. Back");
						System.out.print("\nEnter Command :~> ");
						option=input.nextInt();
						input.nextLine();
						if(option==1) // 3. Customer Account Management --> 1. Add New Account --> 1. Savings Account
						{
							SavingsAccount savingsAccount=new SavingsAccount(); //Creating savingsAccount object for SavingsAccount class
							System.out.print("ENTER ACCOUNT NUMBER          : ");
							accountNumber=input.nextInt();
							input.nextLine();
							savingsAccount.setAccountNumber(accountNumber); //Passing accountNumber from Account class
							System.out.print("ENTER ACCOUNT'S BALANCE       : ");
							balance=input.nextDouble();
							input.nextLine();
							savingsAccount.setBalance(balance); //Passing balance from Account class
							System.out.print("ENTER ACCOUNT'S INTEREST RATE : ");
							interestRate=input.nextDouble();
							input.nextLine();
							savingsAccount.setInterestRate(interestRate); //Passing interestRate from SavingsAccount class
							existingCustomer.addAccount(savingsAccount); //Passing savingsAccount object in order to add new savings account
						}
						else if(option==2) // 3. Customer Account Management --> 1. Add New Account --> 1. Fixed Account
						{
							FixedAccount fixedAccount=new FixedAccount(); //Creating fixedAccount object for FixedAccount class
							System.out.print("ENTER ACCOUNT NUMBER        : ");
							accountNumber=input.nextInt();
							input.nextLine();
							fixedAccount.setAccountNumber(accountNumber); //Passing accountNumber from Account class
							System.out.print("ENTER ACCOUNT'S BALANCE     : ");
							balance=input.nextDouble();
							input.nextLine();
							fixedAccount.setBalance(balance); //Passing balance from Account class
							System.out.print("ENTER ACCOUNT'S TENURE YEAR : ");
							tenureYear=input.nextInt();
							input.nextLine();
							fixedAccount.setTenureYear(tenureYear); //Passing tenureYear from FixedAccount class
							existingCustomer.addAccount(fixedAccount); //Passing fixedAccount object in order to add new fixed account
						}
					}
					else if(option==2) // 3. Customer Account Management --> 2. Remove Existing Account
					{
						
						System.out.print("ENTER ACCOUNT NUMBER : ");
						accountNumber=input.nextInt();
						input.nextLine();
						existingCustomer.removeAccount(existingCustomer.getAccount(accountNumber)); //Passing accountNumber from Account class in order to remove existing account
					}
					else if(option==3) // 3. Customer Account Management --> 3. Show All Accounts
					{

						existingCustomer.showAllAccounts(); //Calling showAllAccounts() with existingCustomer in order to show all existing customer accounts
					}
					else if(option==4){
						mainMenu(); // It used to back to the main menu
					}
					else
					{
						System.out.println("\n[x] No such option\nPlease select another option");
					}
				}
				else if(option==4) // 4. Transactions Management
				{
					int accountNumber; //This is from Account class
					double amount_of_money; //This is from Account class
					System.out.println("\t\t\t\t\t[ Transactions Management ]");
					System.out.println("\n\t\t1. Deposit Money\n\t\t2. Withdraw Money\n\t\t3. Transfer Money\n\t\t4. Back");
					System.out.print("\nEnter Command :~> ");
					option=input.nextInt();
					input.nextLine();
					if(option==1) // 4. Transactions Management --> 1. Deposit Money
					{
						
						System.out.print("ENTER ACCOUNT NUMBER IN WHICH YOU WANT TO DEPOSIT MONEY : ");
						accountNumber=input.nextInt();
						input.nextLine();
						System.out.print("ENTER AMOUNT OF MONEY TO DEPOSIT                        : ");
						amount_of_money=input.nextDouble();
						input.nextLine();
						(existingCustomer.getAccount(accountNumber)).createDirectory(); //Passing accountNumber from Account class and creating directory to save transaction history
						(existingCustomer.getAccount(accountNumber)).deposit(amount_of_money); //Passing amount_of_money from Account class and depositing money in current account
					}
					else if(option==2)
					{
						
						System.out.print("ENTER ACCOUNT NUMBER IN WHICH YOU WANT TO WITHDRAW MONEY : ");
						accountNumber=input.nextInt();
						input.nextLine();
						System.out.print("ENTER AMOUNT OF MONEY TO WITHDRAW                        : ");
						amount_of_money=input.nextDouble();
						input.nextLine();
						(existingCustomer.getAccount(accountNumber)).createDirectory(); //Passing accountNumber from Account class and creating directory to save transaction history
						(existingCustomer.getAccount(accountNumber)).withdraw(amount_of_money); //Passing amount_of_money from Account class and withdrawing money from current account
					}
					else if(option==3)
					{
						int transferFrom,transferTo;
						System.out.print("ENTER ACCOUNT NUMBER FROM WHICH YOU WANT TO TRANSFER MONEY : ");
						transferFrom=input.nextInt();
						input.nextLine();
						System.out.print("ENTER ACCOUNT NUMBER TO WHICH YOU WANT TO TRANSFER MONEY   : ");
						transferTo=input.nextInt();
						input.nextLine();
						System.out.print("ENTER AMOUNT OF MONEY TO TRANSFER                          : ");
						amount_of_money=input.nextDouble();
						input.nextLine();
						(existingCustomer.getAccount(transferFrom)).createDirectory(); //Passing transferFrom object from Account class and creating directory to save transaction history
						(existingCustomer.getAccount(transferFrom)).transfer(existingCustomer.getAccount(transferTo), amount_of_money); //Passing amount_of_money from Account class and transfering money 
					}
					else if(option==4){
						mainMenu(); // It used to back to the main menu
					}
					else
					{
						System.out.println("\n[x] No such option\nPlease select another option");
					}
				}
				else
				{
					if(option!=5) // 5. Exit
					{
						System.out.println("\n[x] No such option\nPlease select another option");
					}
					else if(option==5) //This is used to exit the program
					{
						System.out.println("\n[x] Program Exited");
						System.out.println("\n\n\t\t\t** Thanks for coming ** ");
						System.out.println();
						System.exit(0); //Stopping execution
					}
					else
					{
						
						mainMenu(); // It used to back to the main menu
					}
				}

			}while(option!=5);
		}
		catch(Exception ex) //Creating Exception object as ex
		{

			System.out.println("\n[x] Wrong input\n\n[x] Program Exited\n\n\t\t\t** Thanks for coming **");

		}
	}
}