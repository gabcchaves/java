package model.account;

import model.client.Client;

public class Account {
	private static int nextNumber = 1;

	private String number;
	private Client holder;
	private double balance;

	public Account(Client holder) {
		this.holder = holder;
		this.number = String.valueOf(Account.nextNumber);
		this.balance = 0;
		nextNumber++;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) throws InsufficientBalanceException {
		if (balance >= amount) {
			this.balance -= amount;
		} else {
			throw new InsufficientBalanceException(this);
		}
	}

	public void transfer(Account toAccount, double amount) throws InsufficientBalanceException {
		this.withdraw(amount);
		toAccount.deposit(amount);
	}

	public void setHolder(Client holder) {
		this.holder = holder;
	}

	public Client getHolder() {
		return this.holder;
	}

	public String getNumber() {
		return this.number;
	}

	public double getBalance() {
		return this.balance;
	}

	public String toString() {
		return "Number...: " + this.getNumber() +
			"\nHolder...: " + this.getHolder() +
			"\nBalance..: " + this.getBalance();
	}
}
