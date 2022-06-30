package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.dao.PersonDAO;
import com.denisshkunov.course_work_app.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;


    @Override
    @Transactional
    public List<Person> getAllPeople() {
        return personDAO.getAllPeople();
    }

    @Override
    @Transactional
    public void savePerson(Person person) {
        personDAO.savePerson(person);
    }

    @Override
    @Transactional
    public Person getPerson(int id) {
        return personDAO.getPerson(id);
    }

    @Override
    @Transactional
    public void deletePerson(int id) {
        personDAO.deletePerson(id);
    }

    @Override
    @Transactional
    public List<Person> getPersonInBrigade(int id) {
        return personDAO.getPeopleInBrigade(id);
    }


}
