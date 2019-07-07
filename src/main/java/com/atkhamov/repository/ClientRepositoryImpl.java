package com.atkhamov.repository;

import com.atkhamov.model.Client;

import java.util.ArrayList;
import java.util.List;

public class ClientRepositoryImpl implements ClientRepository{
    private List<Client> clientDB = new ArrayList<Client>();

    public ClientRepositoryImpl(){
        Client client = new Client();
        client.setId(clientDB.size());
        client.setName(client.getName());
        client.setPhone(client.getPhone());
        client.setAddress(client.getAddress());
        client.setDateOfBirth(client.getDateOfBirth());
        client.setDiscountRate(client.getDiscountRate());
        client.setLastOrderSum(client.getLastOrderSum());
        client.setFavFood(client.getFavFood());
        client.setFavDrink(client.getFavDrink());
        clientDB.add(client);

//        Client client = new Client();
//        client.setId(clientDB.size());
//        client.setName("NameSample");
//        client.setPhone(7717212);
//        client.setAddress("Altynsarina 7");
//        client.setDateOfBirth("22/07/2000");
//        client.setDiscountRate(15);
//        client.setLastOrderSum(2950);
//        client.setFavFood("Lagman");
//        client.setFavDrink("Vine Bagizagan");
//        clientDB.add(client);
//        Client client1 = new Client();
//        client1.setId(clientDB.size());
//        client1.setName("Johnson");
//        client1.setPhone(1002129);
//        client1.setAddress("Abay 7");
//        client1.setDateOfBirth("21/11/1989");
//        client1.setDiscountRate(25);
//        client1.setLastOrderSum(7900);
//        client1.setFavFood("Besbarmaq");
//        client1.setFavDrink("Vine Altynay");
//        clientDB.add(client1);
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
