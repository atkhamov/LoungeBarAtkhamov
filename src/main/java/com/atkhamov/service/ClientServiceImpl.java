package com.atkhamov.service;

import com.atkhamov.dao.ClientDAO;
import com.atkhamov.model.Client;
import org.springframework.stereotype.Service;


import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private ClientDAO clientDAO;

    public void setClientDAO(ClientDAO clientDAO) {
        this.clientDAO = clientDAO;
    }

    @Override
    @Transactional
    public void addClient(Client client) {
        this.clientDAO.addClient(client);
    }

    @Override
    @Transactional
    public void updateClient(Client client) {
        this.clientDAO.updateClient(client);
    }

    @Override
    @Transactional
    public void removeClient(int id) {
        this.clientDAO.removeClient(id);
    }

    @Override
    @Transactional
    public Client getClientByID(int id) {
        return this.clientDAO.getClientByID(id);
    }

    @Override
    @Transactional
    public List<Client> listClients() {
        return this.clientDAO.listClients();
    }
}
