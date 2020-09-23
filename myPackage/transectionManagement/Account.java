package myPackage.transectionManagement;

import java.io.*;
import java.lang.*;

public abstract class Account implements AccountTransactions
{
	private int accountNumber;
	private double balance;
	//Setter
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	//Getter
	public int getAccountNumber()
	{
		return this.accountNumber;
	}
	public double getBalance()
	{
		return this.balance;
	}
	abstract public void showInfo(); //Abstract method

	File folder;
	File file;
	private FileWriter writer;
	private FileReader reader;
	private BufferedReader buffer;

	public void createDirectory() //This method used to create new directory
	{
		try
		{
			folder=new File("F:/java project/Transection details");
			folder.mkdir();
		}
		catch(Exception e)
		{
			e.printStackTrace() ;
		}
	}
	public void writeInFile(String s) //This method used to write in file
	{
		try
		{
			file = new File("Transection details/Transections.txt");
			file.createNewFile();
			writer = new FileWriter(file, true);
			writer.write(s+"\r\n");
			writer.flush();
			writer.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace() ;
		}
	}
	//This method use to read data from file
	public void readFromFile() 
	{
		try
		{
			reader = new FileReader(file);
			buffer = new BufferedReader(reader);
			String text="", temp;
			
			while((temp=buffer.readLine())!=null)
			{
				
				text=text+temp+"\r"+"\n";
			}
			System.out.print(text);
			reader.close();
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}	
	}
	//Depositing money
	public void deposit(double amount_of_money)
	{
		writeInFile("**************************************************");
		writeInFile("Before Deposit");
		writeInFile("Balance of Account Number "+accountNumber+" : "+balance);
		this.balance=balance+amount_of_money;
		writeInFile(amount_of_money+" Deposited Successfully");
		writeInFile("New Balance of Account Number "+accountNumber+" : "+balance);
		writeInFile("**************************************************");
		readFromFile();
	}
	//Withdrawing money
	public void withdraw(double amount_of_money)
	{
		if(amount_of_money<=balance)
		{
			writeInFile("**************************************************");
			writeInFile("Before Withdraw");
			writeInFile("Balance of Account Number "+accountNumber+" : "+balance);
			this.balance=balance-amount_of_money;
			writeInFile(amount_of_money+" Withdrawn Successfully");
			writeInFile("New Balance of Account Number "+accountNumber+" : "+balance);
			writeInFile("**************************************************");

			readFromFile();	
		}
		else
		{
			System.out.println("\n[x] Withdraw failed\nThe account has insufficient money to withdraw");
		}
	}
	//Transferring money
	public void transfer(Account account, double amount_of_money)
	{
		if(amount_of_money<=balance)
		{
			writeInFile("**************************************************");
			writeInFile("Before Transfering");
			writeInFile("Balance of Account Number "+accountNumber+" : "+balance);
			writeInFile("Balance of Account Number "+account.accountNumber+" : "+account.balance);
			this.balance=balance-amount_of_money;
			account.balance=account.balance+amount_of_money;
			writeInFile(amount_of_money+" Transfered Successfully From Account Number "+accountNumber+" To "+account.accountNumber);
			writeInFile("New Balance of Account Number "+accountNumber+" : "+balance);
			writeInFile("New Balance of Account Number "+account.accountNumber+" : "+account.balance);
			writeInFile("**************************************************");
			readFromFile();
		}
		else
		{
			System.out.println("\n[x] Transfer failed\nThe account "+accountNumber+" has insuficient money to transfer");
		}
	}
}