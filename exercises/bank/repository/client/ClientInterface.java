package repository.client;

import model.client.Client;
import java.util.List;

public interface ClientInterface {
	void insertClient(Client client) throws RegisteredClientException;
	void editClient(Client client) throws ClientNotFoundException;
	void removeClient(Client client) throws ClientNotFoundException;
	Client queryClient(String clientId) throws ClientNotFoundException;
	List<Client> getAll();
}
