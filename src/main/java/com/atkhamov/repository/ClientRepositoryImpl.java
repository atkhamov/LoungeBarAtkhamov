package com.atkhamov.repository;

import com.atkhamov.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{
    private List<Client> clientDB = new ArrayList<Client>();

    public ClientRepositoryImpl(){
        Client client = new Client();
        client.setId(1);
        client.setName("NameSample");
        client.setPhone(7717212);
        client.setAddress("Altynsarina 7");
        client.setDateOfBirth("22/07/2000");
        client.setDiscountRate(15);
        client.setLastOrderSum(2950);
        client.setFavFood("Lagman");
        client.setFavDrink("Vine Bagizagan");
        clientDB.add(client);
        Client client1 = new Client();
        client.setId(2);
        client.setName("Johnson");
        client.setPhone(1002129);
        client.setAddress("Abay 7");
        client.setDateOfBirth("21/11/1989");
        client.setDiscountRate(25);
        client.setLastOrderSum(7900);
        client.setFavFood("Besbarmaq");
        client.setFavDrink("Vine Altynay");
        clientDB.add(client1);
    }

    public void addClient(Client client) {
        clientDB.add(client);
    }

    public void deleteClient(Client client) {
        clientDB.remove(client);
    }

    public List<Client> getAll() {
        return clientDB;
    }

    public Client getByID(Integer id) {
        return clientDB.get(id);
    }
}
