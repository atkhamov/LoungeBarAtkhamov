package com.atkhamov.service;

import com.atkhamov.dao.ClientDAO;
import com.atkhamov.model.Client;
//import com.atkhamov.repository.ClientRepository;
//import com.atkhamov.repository.ClientRepositoryImpl;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientDAO clientDAO;

    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Transactional
    public void addClient(Client client) {
        this.clientDAO.addClient(client);
    }

    @Transactional
    public void updateClient(Client client) {
        this.clientDAO.updateClient(client);
    }

    @Transactional
    public void removeClient(Integer client_id) {
        this.clientDAO.removeClient(client_id);
    }

    @Transactional
    public Client getClientByID(Integer client_id) {
        return this.clientDAO.getClientByID(client_id);
    }

    @Transactional
    public List<Client> listClients() {
        return this.clientDAO.listClients();
    }


    //OLD CODE
//    private ClientRepository clientRepository = new ClientRepositoryImpl();
//    List<Client> clientDB = clientRepository.getAll();
//
//    public void addClientService(Client client) {
//        if(client != null){
//
//            if(!clientDB.isEmpty()){
//                Client lastClient = clientDB.get(clientDB.size() - 1);
//                client.setId(lastClient.getId() + 1);
//                //clientDB.add(client);
//                clientRepository.addClient(client);
//            }
//        }
//    }
//
//    public void deleteClient(Client client) {
//        if(client != null){
//            clientRepository.deleteClient(client);
//        }
//    }
//
//    public List<Client> getAll() {
//        return clientRepository.getAll();
//    }
//
//    public Client getByID(Integer id) {
//        if(id != null){
//           return clientRepository.getByID(id);
//        }
//        return null;
//    }
}
