package repository.client;

public class ClientNotFoundException extends Exception {
	public ClientNotFoundException() {
		super("Client not found.");
	}
}
