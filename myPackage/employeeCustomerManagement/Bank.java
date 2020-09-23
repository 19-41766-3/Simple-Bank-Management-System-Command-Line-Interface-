package myPackage.employeeCustomerManagement;
import myPackage.accountManagement.Customer;
import java.io.*;
import java.lang.*;

public class Bank implements CustomerOperations,EmployeeOperations
{
	private Customer[] customers=new Customer[50]; //Customer insertion limit
	private Employee[] employees=new Employee[50]; //Employee insertion limit
	static int i=0,j=0;

	public void addCustomer(Customer customer) //This method inserts customer
	{
		try
		{
			customers[i]=customer;
			i++;
			System.out.println("\n[+] Customer inserted successfully");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n[x] Customer insertion failed\nMaximum "+customers.length+" customers can be inserted");
		}
	}
	public void removeCustomer(Customer customer) //This method removes customer
	{
		int count=0;
		if(customer!=null)
		{		
			for(i=0;i<customers.length;i++)
			{
				if(customers[i]==customer)
				{
					if(i==(customers.length-1))
					{
						customers[i]=null;
						count++;
					}
					else
					{
						for(int k=i;k<(customers.length-1);k++)
							{
								customers[k]=customers[k+1];
								if((k+1)==(customers.length-1))
								{
									customers[k+1]=null;
								}
							}
							count++;
							break;			
					}
				}
			}	
			if(count==0)
			{
				System.out.println("\n[x] NID not found");
			}
			else
			{
				System.out.println("\n[+] Customer removed successfully");
			}
		}
	}

	//Getting customer info
	public Customer getCustomer(int nid)
	{
		try
		{	
			for(i=0;i<customers.length;i++)
			{
				if(customers[i].getNid()==nid)
				{
					return customers[i];
				}
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("\n[x] NID not found");
		}
		return null;
	}






 
    File folder1;
	File file1;
	private FileWriter writer1;
	private FileReader reader1;
	private BufferedReader buffer1;

	public void createDirectory1() //This method used to create new directory
	{
		try
		{
			folder1=new File("F:/java project/Transection details");
			folder1.mkdir();
		}
		catch(Exception e1)
		{
			e1.printStackTrace() ;
		}
	}
	public void writeInFile1(String s1) //This method used to write in file
	{
		try
		{
			file1 = new File("Transection details/History of Created Customer's.txt");
			file1.createNewFile();
			writer1 = new FileWriter(file1, true);
			writer1.write(s1+"\r\n");
			writer1.flush();
			writer1.close();
		}
		catch(IOException ioe1)
		{
			ioe1.printStackTrace() ;
		}
	}







// showung all customer info
	public void showAllCustomers()
	{


		for(i=0;i<customers.length;i++)
		{
			if(customers[i]!=null)
			{



//Writting info in History of Created Customer's.txt file
                writeInFile1("\n\n*************************");
				writeInFile1("Details of Customer "+(i+1)+":");
				writeInFile1("Name : "+customers[i].getName());
				writeInFile1("NID : "+customers[i].getNid());
				writeInFile1("*************************");






				System.out.println("*************************");
				System.out.println("Details of Customer "+(i+1)+":");
				System.out.println("Name : "+customers[i].getName());
				System.out.println("NID : "+customers[i].getNid());
				System.out.println("*************************");	
			}
			else
			{
				break;
			}
		}
	}
//This method inserts employees

	public void addEmployee(Employee employee)
	{
		try
		{
			employees[j]=employee;
			j++;
			System.out.println("\n[+] Employee inserted successfully");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n[x] Employee insertion failed\nMaximum "+employees.length+" employees can be inserted");
		}
	}

//This method removes employees
	public void removeEmployee(Employee employee)
	{
		int count=0;
		if(employee!=null)
		{
			for(j=0;j<employees.length;j++)
			{
				if(employees[j]==employee)
				{
					if(j==(employees.length-1))
					{
						employees[j]=null;
						count++;
					}
					else
					{
						for(int k=j;k<(employees.length-1);k++)
							{
								employees[k]=employees[k+1];
								if((k+1)==(employees.length-1))
								{
									employees[k+1]=null;
								}
							}
							count++;
							break;			
					}
				}
			}
			if(count==0)
			{
				System.out.println("\n[x] Employee's ID not found");
			}
			else
			{
				System.out.println("\n[+] Employee removed successfully");
			}
		}
	}
	//Getting employees info
	public Employee getEmployee(String employeeId)
	{
		try
		{	
			for(j=0;j<employees.length;j++)
			{
				if((employees[j].getEmployeeId()).equals(employeeId)==true)
				{
					return employees[j];
				}
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("\n[x] Employee's ID not found");
		}
		return null;
	}


    File folder2;
	File file2;
	private FileWriter writer2;
	private FileReader reader2;
	private BufferedReader buffer2;

	public void createDirectory2() //This method used to create new directory
	{
		try
		{
			folder2=new File("F:/java project/Transection details/");
			folder2.mkdir();
		}
		catch(Exception e2)
		{
			e2.printStackTrace() ;
		}
	}
	public void writeInFile2(String s2) //This method used to write in file
	{
		try
		{
			file2 = new File("Transection details/History of Created Employee's.txt");
			file2.createNewFile();
			writer2 = new FileWriter(file2, true);
			writer2.write(s2+"\r\n");
			writer2.flush();
			writer2.close();
		}
		catch(IOException ioe2)
		{
			ioe2.printStackTrace() ;
		}
	}







// Showing all employee info

	public void showAllEmployees()
	{
		        

		for(j=0;j<employees.length;j++)
		{
			if(employees[j]!=null)
			{

                //Writting employees info in History of Created Employee's.txt file
                writeInFile2("\n\n**************************************************");
				writeInFile2("Details of Employee "+(j+1)+":");
				writeInFile2("Name : "+employees[j].getName());
				writeInFile2("ID : "+employees[j].getEmployeeId());
				writeInFile2("Salary : "+employees[j].getSalary());
				writeInFile2("**************************************************");







				System.out.println("**************************************************");
				System.out.println("Details of Employee "+(j+1)+":");
				System.out.println("Name : "+employees[j].getName());
				System.out.println("ID : "+employees[j].getEmployeeId());
				System.out.println("Salary : "+employees[j].getSalary());
				System.out.println("**************************************************");	
			}
			else
			{
				break;
			}
		}
	}

}