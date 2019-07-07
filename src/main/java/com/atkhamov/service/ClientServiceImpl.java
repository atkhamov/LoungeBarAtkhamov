package com.atkhamov.service;

import com.atkhamov.model.Client;
import com.atkhamov.repository.ClientRepository;
import com.atkhamov.repository.ClientRepositoryImpl;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository = new ClientRepositoryImpl();

    public void addClientService(Client client) {
        if(client != null){
            List<Client> clientDB = clientRepository.getAll();
            if(!clientDB.isEmpty()){
                Client lastClient = clientDB.get(clientDB.size() - 1);
                client.setId(lastClient.getId() + 1);
                clientRepository.addClient(client);
            }
        }
    }

    public void deleteClient(Client client) {
        if(client != null){
            clientRepository.deleteClient(client);
        }
    }

    public List<Client> getAll() {
        return clientRepository.getAll();
    }

    public Client getByID(Integer id) {
        if(id != null){
           return clientRepository.getByID(id);
        }
        return null;
    }
}
