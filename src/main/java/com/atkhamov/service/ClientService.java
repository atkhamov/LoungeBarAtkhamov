package com.atkhamov.service;

import com.atkhamov.model.Client;

import java.util.List;

public interface ClientService {

    void addClient(Client client);
    void updateClient(Client client);
    void removeClient(int id);
    Client getClientByID(int id);
    List<Client> listClients();
}
