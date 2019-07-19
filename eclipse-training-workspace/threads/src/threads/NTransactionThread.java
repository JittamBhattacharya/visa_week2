package threads;

public class NTransactionThread extends Thread {
	
	
	private TransactionType type;
	private String name;
	private double amt;
	private NAccount NAccount;
	
	
	public NTransactionThread(NAccount account2, TransactionType type, String name, double amt) {
		this.NAccount = account2;
		this.type = type;
		this.name = name;
		this.amt = amt;
	}
	
	@Override
	public void run() {
		if( type == TransactionType.CREDIT) {
			NAccount.deposit(name, amt);
		}else {
			NAccount.withdraw(name, amt);
		}
	}
	


}
