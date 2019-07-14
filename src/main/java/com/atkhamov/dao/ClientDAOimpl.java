package com.atkhamov.dao;

import com.atkhamov.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDAOimpl implements ClientDAO {

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void addClient(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(client);
    }

    public void updateClient(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(client);
    }

    public void removeClient(int client_id) {
        Session session = this.sessionFactory.getCurrentSession();
        Client client = session.load(Client.class, new Integer(client_id));

        if(client != null){
            session.delete(client);
        }
    }

    public Client getClientByID(int client_id) {
        Session session = this.sessionFactory.getCurrentSession();
        Client client = session.load(Client.class, new Integer(client_id));
        return client;
    }

    @SuppressWarnings("unchecked")
    public List<Client> listClients() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Client> clientList = session.createQuery("from Client").list();

        return clientList;
    }
}
