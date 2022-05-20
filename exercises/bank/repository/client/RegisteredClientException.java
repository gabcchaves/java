package repository.client;

public class RegisteredClientException extends Exception {
	public RegisteredClientException() {
		super("Client already registered.");
	}
}
