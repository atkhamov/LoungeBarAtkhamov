package com.atkhamov.dao;

import com.atkhamov.model.Client;

import java.util.List;

public interface ClientDAO {
    void addClient(Client client);
    void updateClient(Client client);
    void removeClient(int id);
    Client getClientByID(int id);
    List<Client> listClients();
}
