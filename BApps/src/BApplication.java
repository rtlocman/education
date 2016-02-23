
public class BApplication {

	Account account;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BApplication ba = new BApplication();
		
		ba.account = new CheckingAccount(111,"UA",1000);
//		ba.account = new SavingAccount(111,"UA");
		ba.account.deposit(5000);
		System.out.println("balance = "+ba.account.getBalance());
		ba.account.withdraw(5500);
		System.out.println("balance = "+ba.account.getBalance());
		System.out.println("status of withdraw :"+ba.account.withdraw(1500));
		System.out.println("balance = "+ba.account.getBalance());
		System.out.println(ba.account.toString());
//		ba.account.getReport(System.out);
//*/		
	}
}
