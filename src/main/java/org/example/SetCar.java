package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

public class SetCar {

    @PersistenceContext
    EntityManager entityManager;
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.TryingToHibernate.car_catalog");
    public static EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
