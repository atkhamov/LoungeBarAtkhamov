package com.atkhamov.service;

import com.atkhamov.model.Client;

import java.util.List;

public interface ClientService {

    public void addClient(Client client);
    public void updateClient(Client client);
    public void removeClient(Integer client_id);
    public Client getClientByID(Integer client_id);
    public List<Client> listClients();


//    OLD VERSION OF THE CODE
//    void addClientService(Client client);
//
//    void deleteClient(Client client);
//
//    List<Client> getAll();
//
//    Client getByID(Integer id);
}
