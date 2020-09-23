package myPackage.accountManagement;
import myPackage.transectionManagement.Account;

interface AccountOperations
{
	void addAccount(Account account);
	void removeAccount(Account account);
	Account getAccount(int accountNumber);
	void showAllAccounts();
}