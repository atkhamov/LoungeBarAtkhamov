package com.atkhamov.repository;

import com.atkhamov.model.Client;

import java.util.List;

public interface ClientRepository {

    void addClient(Client client);

    void deleteClient(Client client);

    List<Client> getAll();

    Client getByID(Integer id);
}
