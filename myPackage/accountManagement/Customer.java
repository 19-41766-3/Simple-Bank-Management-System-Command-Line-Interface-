package myPackage.accountManagement;
import myPackage.transectionManagement.Account;
import java.io.*;
import java.lang.*;

public class Customer implements AccountOperations
{
	private String name;
	private int nid;
	private Account[] accounts=new Account[3]; //Account creation limit
	static int i=0;
//Setter
	public void setName(String name)
	{
		this.name=name;
	}
	public void setNid(int nid)
	{
		this.nid=nid;
	}
	//Getter
	public String getName()
	{
		return this.name;
	}
	public int getNid()
	{
		return this.nid;
	}
//Whis this method we can create new account
	public void addAccount(Account account)
	{
		try
		{
			accounts[i]=account;
			i++;
			System.out.println("\n[+] Account inserted successfully");
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("\n[x] Account insertion failed\nMaximum "+accounts.length+" accounts can be created");
		}
	}
	//Whis this method we can remove existing account
	public void removeAccount(Account account)
	{
		int count=0;
		if(account!=null)
		{
			for(i=0;i<accounts.length;i++)
			{
				if(accounts[i]==account)
				{
					if(i==(accounts.length-1))
					{
						accounts[i]=null;
						count++;
					}
					else
					{
						for(int k=i;k<(accounts.length-1);k++)
						{
							accounts[k]=accounts[k+1];
							if((k+1)==(accounts.length-1))
							{
								accounts[k+1]=null;
							}
						}
						count++;
						break;			
					}
				}
			}
			if(count==0)
			{
				System.out.println("\n[x] Account number not found");
			}
			else
			{
				System.out.println("\n[+] Account removed successfully");
			}
		}
	}
	//Getting account info
	public Account getAccount(int accountNumber)
	{
		try
		{
			for(i=0;i<accounts.length;i++)
			{
				if(accounts[i].getAccountNumber()==accountNumber)
				{
					return accounts[i];
				}
			}
		}
		catch(NullPointerException ex)
		{
			System.out.println("\n[x] Account number not found");
		}
		return null;
	}






    File folder3;
	File file3;
	private FileWriter writer3;
	private FileReader reader3;
	private BufferedReader buffer3;

	public void createDirectory3() //This method used to create new directory
	{
		try
		{
			folder3=new File("F:/java project/Transection details");
			folder3.mkdir();
		}
		catch(Exception e3)
		{
			e3.printStackTrace() ;
		}
	}
	public void writeInFile3(String s3) //This method used to write in file
	{
		try
		{
			file3 = new File("Transection details/History of Customer Account's.txt");
			file3.createNewFile();
			writer3 = new FileWriter(file3, true);
			writer3.write(s3+"\r\n");
			writer3.flush();
			writer3.close();
		}
		catch(IOException ioe3)
		{
			ioe3.printStackTrace() ;
		}
	}





//This method use to show all account info

	public void showAllAccounts()
	{

                

		for(i=0;i<accounts.length;i++)
		{
			if(accounts[i]!=null)
			{


                //Writing account info in History of Customer Account's.txt file
                writeInFile3("\n\n**************************************************");
				writeInFile3("Details of Account "+(i+1)+":");
				writeInFile3("Account number : "+accounts[i].getAccountNumber());
				writeInFile3("Balance : "+accounts[i].getBalance());
				writeInFile3("**************************************************");







				System.out.println("**************************************************");
				System.out.println("Details of Account "+(i+1)+":");
				System.out.println("Account number : "+accounts[i].getAccountNumber());
				System.out.println("Balance : "+accounts[i].getBalance());
				System.out.println("**************************************************");
			}
			else
			{
				break;
			}
		}
	}
}