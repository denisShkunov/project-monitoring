package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class PersonDAOimpl implements PersonDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Person> getAllPeople() {
        Session session = sessionFactory.getCurrentSession();
        List<Person> allPeople = session.createQuery("from Person", Person.class)
                .getResultList();
        return allPeople;
    }

    @Override
    public void savePerson(Person person) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(person);
    }

    @Override
    public Person getPerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Person person = session.get(Person.class, id);
        return person;
    }

    @Override
    public void deletePerson(int id) {
        Session session = sessionFactory.getCurrentSession();
        Query<Person> query = session.createQuery("delete from Person where id=:personId");
        query.setParameter("personId", id);
        query.executeUpdate();
    }

    @Override
    public List<Person> getPeopleInBrigade(int id) {
        Session session = sessionFactory.getCurrentSession();
        List<Person> personInBrigade = session.createQuery("from Person p where p.brigade.id = :id", Person.class)
                .setParameter("id", id).getResultList();
        return personInBrigade;
    }


}
