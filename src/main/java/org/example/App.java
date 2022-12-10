package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class App 
{
    public static void main( String[] args )
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Hibernate_Try");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Car car = new Car();
        car.setBrand("Audi");
        car.setModel("A8L");
        car.setYear(2016);
        em.persist(car);
        em.getTransaction().commit();

        em.close();
        emf.close();
        Query query = em.createQuery("select brand, model from Car where year > 2011");
        List list = query.getResultList();
    }
}
