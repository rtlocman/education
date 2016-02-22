import java.io.PrintStream;

public class CheckingAccount extends AbstractAccount {
	float overdraft;
	public CheckingAccount(long ipAccountNumber, String ipCurrency, float ipOverdraft) {
		super(ipAccountNumber, ipCurrency);
		overdraft = ipOverdraft;
	}
	void setOverdraft(float x){
		overdraft = x;
	}
	boolean chkBalance(float x){
		return (curBalance + overdraft + x) >=0;
	} 
	public void getReport(PrintStream ps){
		super.getReport(ps);
		ps.println("Overdraft is:"+overdraft);
	}
}
