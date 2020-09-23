package myPackage.employeeCustomerManagement;

interface EmployeeOperations
{
	void addEmployee(Employee employee);
	void removeEmployee(Employee employee);
	Employee getEmployee(String employeeId);
	void showAllEmployees();
}