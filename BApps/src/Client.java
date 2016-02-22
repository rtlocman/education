import java.io.PrintStream;
import java.util.List;

public class Client implements Report {
	String name;
	List<Account> accounts;
	Account activeAccount;
	float initialOverdraft;
	public Client(){
		initialOverdraft = 0;
	}
	public Client(float initialOverdraft){
		this.initialOverdraft = initialOverdraft;
	}
	public void setActiveAccount(Account a){
		activeAccount = a;
	}
	public float getBalance(){
		float retBalance = 0;
		for(Account a : accounts){
			retBalance += a.getBalance();
		}
		return retBalance;
	}
	public List<Account> getAccounts(){
		return accounts;
	}
	public void deposit(float x){
		activeAccount.deposit(x);
	}
	public void withdraw(float x){
		activeAccount.withdraw(x);
	}
//	createAccount(String accountType): Account
	
	@Override
	public void getReport(PrintStream ps) {
		// TODO Auto-generated method stub

	}

}
