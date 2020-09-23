package myPackage.transectionManagement;

interface AccountTransactions
{
	void deposit(double amount_of_money);
	void withdraw(double amount_of_money);
	void transfer(Account account, double amount_of_money);
}