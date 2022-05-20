package repository.account;

public class RegisteredAccountException extends Exception {
	public RegisteredAccountException() {
		super("Account already registered.");
	}
}
