package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Person;

import java.util.List;

public interface PersonDAO {

    public List<Person> getAllPeople();

    public void savePerson(Person person);

    public Person getPerson(int id);

    public void deletePerson(int id);

    public List<Person> getPeopleInBrigade(int id);
}
