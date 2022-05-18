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

	private static void clearStdOut() {
		System.out.print("\033[H\033[2J");
	}
}
