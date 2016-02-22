import java.io.PrintStream;

public abstract class AbstractAccount implements Account, Report {
	float curBalance;
	long accountNumber;
	
	String currency;
	boolean  accountIsLocked;
	
	public AbstractAccount(long ipAccountNumber,String ipCurrency){
		accountNumber = ipAccountNumber;
		currency = ipCurrency;
		curBalance = 0;
		accountIsLocked = false;
	}
	
	public void setLockAccount(){
		accountIsLocked = true;
	}
	public void setUnLockAccount(){
		accountIsLocked = false;
	}
	public boolean getLockAccountStatus(){
		return accountIsLocked;
	}
	@Override
	public float getBalance() {
		return curBalance;
	}

	@Override
	public int deposit(float x) {
		int retVal = 0;
		if(checkOperation(x)){
			curBalance += x;
			retVal ++;
		}
		return retVal;
	}

	boolean chkBalance(float x){
		return false;
	} 
	
	boolean checkOperation(float x){
		return (!accountIsLocked && chkBalance(x)); 
	}
	

	@Override
	public int withdraw(float x) {
		int retVal = 0;
		if (checkOperation(-1*x)){
			curBalance -= x;
			retVal ++;
		}
		return retVal;
	}
	
	@Override
	public String toString(){
		
		return "";
	}
	@Override
	public void getReport(PrintStream ps){
		ps.println("Account #"+accountNumber+"  currency is:"+currency +(accountIsLocked?" LOCKED!":""));
		ps.println("Current balance is" + curBalance);
	}
}
