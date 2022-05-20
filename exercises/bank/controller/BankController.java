package controller;

/* This is the controller of the bank repository. It is supposed to handle all
 * the operations with the bank repository. */

public class BankController {
	private ClientRepo clientRepo;
	private AccountRepo accountRepo;

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

	public Account insertAccount(Account account) throws RegisteredAccountException {
		return accountRepo.insertAccount(account);
	}

	public Account queryAccount(String number) throws AccountNotFoundException {
		return accountRepo.queryAccount(number);
	}

	public void removeAccount(Account account) throws AccountNotFoundException {
		if (account.getBalance() == 0) {
			accountRepo.removeAccount(account);
		} else {
			throw new IsufficientBalanceException();
		}
	}

	public void deposit(String number, double amount) throws AccountNotFoundException {
		Account account = accountRepo.queryAccount(number);
		account.deposit(amount);
	}

	public void withdraw(String number, double amount) throws AccountNotFoundException, InsufficientBalanceException {
		Account account = accountRepo.queryAccount(number);
		account.withdraw(amount);
	}

	public void withdraw(String fromAccountNumber, String toAccountNumber, double amount) throws AccountNotFoundException, InsufficientBalanceExcetion {		
		Account account1 = accountRepo.queryAccount(fromAccountNumber);
		Account account2 = accountRepo.queryAccount(toAccountNumber);
		account1.withdraw(amount);
		account2.deposit(amount);
	}

	public List<Account> getAllAccounts() {
		return accountRepo.getAll();
	}

	public List<Account> getAllAccounts(String id) {
		return accountRepo.getAll(id);
	}
}
