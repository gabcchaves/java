package repository.account;

import java.util.ArrayList;
import java.util.List;
import model.account.Account;

public class AccountRepo implements AccountInterface {
	List<Account> accounts;

	public AccountRepo() {
		accounts = new ArrayList<>();
	}

	@Override
	public Account insertAccount(Account account) throws RegisteredAccountException {
		try {
			queryAccount(account.getNumber());
			throw new RegisteredAccountException();
		} catch (AccountNotFoundException error) {
			accounts.add(account);
		}
		return account;
	}

	@Override
	public editAccount(Account account) {}

	@Override
	public void removeAccount(Account account) throws AccountNotFoundException {
		if (!accounts.remove(account)) {
			throw new AccountNotFoundException();
		}
	}

	@Override
	public Account queryAccount(String number) throws AccountNotFoundException {
		for (Account account : accounts) {
			if (account.getNumber().equals(number)) {
				return account;
			}
		}
		throw new AccountNotFoundException();
	}

	@Override
	public List<Account> getAll() {
		return new ArrayList<>(accounts);
	}

	@Override
	public List<Account> getAll(String holderId) {
		List<Account> accountList = new ArrayList<>();
		for (Account account : accounts) {
			if (account.getHolder().getId().equals(holderId)) {
				accountList.add(account);
			}
		}
		return accountList;
	}
}
