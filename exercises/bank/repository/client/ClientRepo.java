package repository.client;

import model.client.Client;
import java.util.ArrayList;
import java.util.List;

public class ClientRepo implements ClientRepo {
	List<Client> clients;

	public ClientRepo() {
		clients = new ArrayList<>();
	}

	@Override
	public void insertClient(Client client) throws RegisteredClientException {
		try {
			queryClient(client.getId());
			throw new RegisteredClientException();
		} catch (ClientNotFoundException error) {
			clients.add(client);
		}
	}

	@Override
	public void editClient(Client client) {}

	@Override
	public void removeClient(Client client) throws ClientNotFoundException {
		if (!clients.remove(client)) {
			throw new ClientNotFoundException();
		}
	}

	@Override
	public Client queryClient(String clientId) throws ClientNotFoundException {
		for (Client client : clients) {
			if (client.getId().equals(clientId)) {
				return client;
			}
		}
		throw new ClientNotFoundException();
	}

	@Override
	public List<Client> getAll() {
		return new ArrayList<>(clients);
	}
}
