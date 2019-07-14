package com.atkhamov.dao;

import com.atkhamov.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClientDAOimpl implements ClientDAO {

    private static final Logger logger = LoggerFactory.getLogger(ClientDAOimpl.class);

    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addClient(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(client);
        logger.info("Client added. Client data: " + client);
    }

    @Override
    public void updateClient(Client client) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(client);
        logger.info("Client data updated. Client data: " + client);
    }

    @Override
    public void removeClient(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Client client = session.load(Client.class, new Integer(id));
        if(client != null){
            session.delete(client);
        }
        logger.info("Client removed. Client data: " + client);
    }

    @Override
    public Client getClientByID(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Client client = session.load(Client.class, new Integer(id));
        logger.info("Client loaded. Client data: " + client);
        return client;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Client> listClients() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Client> clientList = session.createQuery("from Client").list();
        for (Client client : clientList){
            logger.info("List of client: " + client);
        }
        return clientList;
    }
}
