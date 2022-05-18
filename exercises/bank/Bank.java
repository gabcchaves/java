/* Bank simulator program */
/* This is a similar code to a OOP college project example. 
 * It is in english, differently from the one it is based on, which is in portuguese. */

import java.util.Scanner;

public class Bank {
	static Scanner scn = new Scanner(System.in);

	public static void main(String args[]) {
		String[] menu = {
			"MAIN MENU",
			"==== ====",
			"\n<1> Client management",
			"<2> Account management",
			"<3> Cash machine",
			"<0> Exit",
			"\n> "
		};

		insertTestData();

		// Main menu loop
		do {
			clearStdOut();
			for (String line : menu) {
				System.out.println(line);
			}
			
			// Get option code
			try {
				opCode = Integer.valueOf(scn.nextLine());
			} catch (Exception error) {
				opCode = 0;
			}

			switch (opCode) {
				case 0:
					clearStdOut();
					break;
				case 1:
					manageClients();
					break;
				case 2:
					manageAccounts();
					break;
				case 3:
					cashMachine();
					break;
			}
		} while (opCode != 0);

		constroller.exit();
		System.out.println("Program finished");
	}

	// Initialize some clients and accounts
	private static void insertTestData() {
		try {
			Client client01 = new Client("1", "John", "99135-7951");
			Client client02 = new Client("2", "Jessy", "99246-842");
			controller.insertClient(client01);
			controller.insertClient(client02);

			Account account01 = new Account(client01);
			Account account02 = new Account(client02);
			controller.insertAccount(account01);
			controller.insertAccount(account02);

			// Insert some money on accounts
			try {
				controller.deposit(account01.getID(), 200);
				controller.deposit(account02.getID(), 200);
			} catch (AccountNotFoundException error) {
				System.out.println(error.getMessage());
			}
		} catch (RegisteredIDException | RegisteredAccountException error) {
			System.out.println(error.getMessage());
		}
	}

	/* CLIENT MANAGEMENT METHODS */
	// Print client management menu
	private static void manageClients() {
		String[] menu = {
			"CLIENT MANAGEMENT",
			"====== ==========",
			"\n<1> Insert client",
			"<2> Edit client",
			"<3> Remove client",
			"<4> List clients",
			"<0> Back to main menu\n"
		};

		short opCode;
		do {
			System.out.print();
			for (String lines : menu) {
				System.out.print(lines);
			}

			try {
				opCode = Integer.valueOf(scn.nextLine());
			} catch (Exception error) {
				opCode = 0;
			}

			switch (opCode) {
				case 0:
					clearStdOut();
					break;
				case 1:
					insertClient();
					break;
				case 2:
					editClient();
					break;
				case 3:
					removeClient();
					break;
				case 4:
					listClients();
					break;
			} while (opCode != 0);
		}
	}

	// Insert client
	private static void insertClient() {
		clearStdOut();
		System.out.println("Client Registration");
		System.out.println("===================");

		System.out.println("ID: ");
		String id = scn.nextLine();

		System.out.println("Name: ");
		String name = scn.nextLine();

		System.out.println("Sex: ");
		String name = scn.nextLine();

		System.out.println("Phone: ");
		String phone = scn.nextLine();

		Client client = new Client(id, name, sex, phone);

		try {
			controller.insertClient(client);
			System.out.println("Client successfully registered!");
		} catch (RegisteredClientException error) {
			System.err.println(error.getMessage());
		}

		System.out.println("Press <enter> to return");
		scn.nextLine();
	}

	// Edit a registered client
	private static void editClient() {
		clearStdOut();
		System.out.println("EDIT CLIENT");
		System.out.println("===========");

		System.out.println("Enter client ID: ");
		String id = scn.nextLine();

		try {
			// Try to retrieve client
			Client client = controller.queryClient(id);

			System.out.println("\nNome: " + client.getName());
			System.out.print("Name (<enter> = Do not change): ");
			String name = scn.nextLine();
			if (!name.equals("")) client.setName(name);

			System.out.println("Sex: " + client.getSex());
			System.out.print("Sex: (<enter> = Do not change): ");
			String sex = scn.nextLine();
			if (!sex.equals("")) client.setSex(sex);

			System.out.println("Phone: " + client.getPhone());
			System.out.print("Phone: (<enter> = Do not change)");
			String phone = scn.nextLine();
			if (!phone.equals("")) client.setPhone(phone);

			controller.editClient(client);
			System.out.println("\nClient successfully altered!\n");

		} catch (ClientNotFoundException error) {
			System.err.println(error.getMessage());
		}

		System.out.println("\nPress <enter> to return");
		scn.nextLine();
	}

	// Remove a client
	private static void removeClient() {
		clearStdOut();
		System.out.println("REMOVE CLIENT");
		System.out.println("=============");

		System.out.print("Enter client ID: ");
		String id = scn.nextLine();

		try {
			// Try to retrieve client
			Client client = controller.queryClient(id);
			System.out.println("Name: " + client.getName());
			System.out.println("Sex: " + client.getSex());
			System.out.println("Phone: " + client.getPhone());
			System.out.println();

			System.out.println("Remove this client? [Y/n] ");
			String answer = scn.nextLine();
			
			if (answer.equalsIgnoreCase("y")) {
				controller.removeClient(client);
				System.out.println("Client removed!");
			}
		} catch (ClientNotFoundException | ControllerException error) {
			System.err.println(error.getMessage());
		}

		System.out.println();
		System.out.println("Press <enter> to return");
		scn.nextLine();
	}

	// List clients
	private static void listClients() {
		clearStdOut();
		List<Client> clients = controller.getAllClients();

		System.out.printf("ID      Name         Sex   Phone       ");
		System.out.printf("======= ============ ===== ============");
		for (Client client : clients) {
			System.out.printf("%7s ", client.getID());
			System.out.printf("%-12s ", client.getName());
			System.out.printf("%-5s ", client.getSex());
			System.out.printf("%12s\n", client.getPhone());
		}

		System.out.println();
		System.out.println("Press <enter> to return");
		scn.nextLine();
	}

	/* ACCOUNT MANAGEMENT METHODS */
	private static void insertAccount() {
		clearStdOut();
		System.out.println("NEW ACCOUNT");
		System.out.println("===========");

		try {
			System.out.println("Enter holder's ID: ");
			String id = scn.nextLine();
			Client holder = controller.queryClient(id);

			Account account = new Account(holder);
			controller.insertAccount(account);
			System.out.println("Checking account #" + account.getNumber() + " created!");
		} catch (ClientNotFoundException | RegisteredAccountException error) {
			System.err.println(error.getMessage());
		}

		System.out.println("Press <enter> to return");
		scn.nextLine();
	}

	private static void removeAccount() {
		clearStdOut();
		System.out.println("REMOVE ACCOUNT");
		System.out.println("==============\n");
		System.out.println("Enter account number: ");
		String number = scn.nextLine();

		try {
			Account account = controller.queryAccount(number);
			System.out.println();
			System.out.println("Number: " + account.getNumber());
			System.out.println("Holder: " + account.getHolder());
			System.out.println("Balance: " + account.getBalance());
			System.out.println();

			System.out.println("Remove account? [Y/n] ");
			String answer = scn.nextLine();

			if (answer.equalsIgnoreCase("y")) {
				if (controller.removeAccount(account)) {
					System.out.println("Account removed!");
				} else {
					System.out.println("Account not removed: contains balance.");
				}
			}
		} catch (AccountNotFoundException error) {
			System.err.println(error.getMessage());
		}

		System.out.println("\nPress <enter> to return");
		scn.nextLine();
	}
	private static void queryAccount() {}
	private static void listAccounts() {}
	private static void earnInterest() {}

	/* CASH MACHINE */

	/* Clear standard output */
	private static void clearStdOut() {
		System.out.print("\033[H\033[2J");
	}
}
