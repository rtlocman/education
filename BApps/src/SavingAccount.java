
public class SavingAccount extends AbstractAccount {
	public SavingAccount(long ipAccountNumber, String ipCurrency) {
		super(ipAccountNumber, ipCurrency);
	}

	boolean chkBalance(float x){
		return (curBalance + x) >=0;
	} 
}
