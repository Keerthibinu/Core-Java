package com.keerthi;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
    EntityManager em = emf.createEntityManager();

    public void saveUser(Details user) {
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();

    }

    public void deleteUser(int userId) {
        Details user = em.find(Details.class, userId);
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();

    }

    public void updateUser(int id, String name, String username, String password) {
        Details user = em.find(Details.class, id);
        user.setPassword(password);
        user.setName(name);
        user.setUsername(username);
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();

    }

    public List<Details> displayUsers() {
        TypedQuery<Details> query = em.createQuery("select e from Details e", Details.class);
        List<Details> users = query.getResultList();
        return users;
    }
}
