package controller;

/* This is the controller of the bank repository. It is supposed to handle all
 * the operations with the bank repository. */

public class BankController {
	private ClientRepository clientRepo;
	private AccountRepository accountRepo;

	public BankController() {
		clientRepo = new ClientRepository();
		accountRepo = new AccountRepository();
	}
	
	/* Client operations */

	public void insertClient(Client client) throws RegisteredIDException {
		clientRepo.insertClient(client);
	}

	public void editClient(Client client) throws ClientNotFoundException {
		clientRepo.editClient(client);
	}

	public void queryClient(String id) throws ClientNotFoundException {
		return clientRepo.queryClient(id);
	}

	public void removeClient(Client client) throws ControllerException, ClientNotFoundException {
		// Fetches the list of accounts of the given client
		List<Account> clientAccounts = this.getAllAccounts(client.getId());

		// Is it empty?
		if (clientAccounts.isEmpty()) {
			clientRepo.removeAccount(client);
		} else {
			throw new ControllerException("Client with active accounts cannot be removed.");
		}
	}

	public List<Client> getAllClients() {
		return clientRepo.getAll();
	}

	/* Account operations */

	public Account insertAccount(Account account) throws RegisteredAccountException {
		return accountRepo.insertAccount(account);
	}
}
