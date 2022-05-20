public class InsufficientBalanceException extends Exception {
	Account account;

	public InsufficientBalanceException(Account account) {
		super("Insufficient balance in account " + account.getNumber());
		this.account = accout;
	}

	public Account getAccount() {
		return this.account;
	}
}
