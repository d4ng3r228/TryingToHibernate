package org.example;

import com.mysql.cj.Session;
import org.hibernate.Hibernate;
import org.hibernate.jpa.HibernateQuery;

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
        em.merge(car);


        car.setBrand("Mercedes BENZ");
        car.setModel("W 221");
        car.setYear(2011);
        em.merge(car);
        em.getTransaction().commit();

        Query query = em.createQuery("select brand, model from Car where year > 2011");
        List<Car> list = query.getResultList();
        System.out.println(list);
        em.close();
        emf.close();

    }
}
