package myPackage.transectionManagement;

public class SavingsAccount extends Account
{
	//Attributes
	private double interestRate;
	
	//Setter
	public void setInterestRate(double interestRate)
	{
		this.interestRate=interestRate;
	}

	//Getter
	public double getInterestRate()
	{
		return this.interestRate;
	}

	//Method to show info
	public void showInfo()
	{
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Balance : "+getBalance());
		System.out.println("Interest Rate : "+interestRate);
	}
}