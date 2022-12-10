package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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
    }
}
