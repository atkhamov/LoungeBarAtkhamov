package com.atkhamov.dao;

import com.atkhamov.model.Client;

import java.util.List;

public interface ClientDAO {
    public void addClient(Client client);
    public void updateClient(Client client);
    public void removeClient(int client_id);
    public Client getClientByID(int client_id);
    public List<Client> listClients();
}
