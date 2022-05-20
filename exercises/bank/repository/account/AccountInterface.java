package repository.account;

import model.account.Account;
import java.util.List;

public interface AccountInterface {
	Account insertAccount(Account account) throws RegisteredAccountException;
	void editAccount(Account account) throws AccountNotFoundException;
	void removeAccount(Account account) throws AccountNotFoundException;
	Account queryAccount(String number) throws AccountNotFoundException;

	List<Account> getAll();
	List<Account> getAll(String holderId);
}
