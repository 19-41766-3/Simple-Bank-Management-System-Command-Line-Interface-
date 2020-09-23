package myPackage.transectionManagement;

public class FixedAccount extends Account
{
	//Attributes
	private int tenureYear;
	
	//Setter
	public void setTenureYear(int tenureYear)
	{
		this.tenureYear=tenureYear;
	}

	//Getter
	public int getTenureYear()
	{
		return this.tenureYear;
	}
	//Method to show info
	public void showInfo()
	{
		System.out.println("Account Number : "+getAccountNumber());
		System.out.println("Balance : "+getBalance());
		System.out.println("Tenure Year : "+tenureYear);
	}
}