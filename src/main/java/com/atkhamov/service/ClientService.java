package com.atkhamov.service;

import com.atkhamov.model.Client;

import java.util.List;

public interface ClientService {

    void addClientService(Client client);

    void deleteClient(Client client);

    List<Client> getAll();

    Client getByID(Integer id);
}
