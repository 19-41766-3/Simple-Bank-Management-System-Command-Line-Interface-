package myPackage.employeeCustomerManagement;
import myPackage.accountManagement.Customer;

interface CustomerOperations
{
	void addCustomer(Customer customer);
	void removeCustomer(Customer customer);
	Customer getCustomer(int nid);
	void showAllCustomers();
}