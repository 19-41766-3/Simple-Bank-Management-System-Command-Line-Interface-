package myPackage.employeeCustomerManagement;

public class Employee
{
	//Attributes
	private String name;
	private String employeeId;
	private double salary;
	
	//Setter
	public void setName(String name)
	{
		this.name=name;
	}
	public void setEmployeeId(String employeeId)
	{
		this.employeeId=employeeId;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}

	//getter
	public String getName()
	{
		return this.name;
	}
	public String getEmployeeId()
	{
		return this.employeeId;
	}
	public double getSalary()
	{
		return this.salary;
	}
}