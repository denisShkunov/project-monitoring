package com.denisshkunov.course_work_app.entity;


import javax.persistence.*;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private  String surname;

    @Column(name = "qualification_level")
    private String qualificationLevel;

    @Column(name = "level_of_training")
    private String trainingLevel;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brigade_id")
    private Brigade brigade;

    @OneToOne(mappedBy = "operationPerson"
            , cascade = CascadeType.ALL
            , fetch = FetchType.LAZY)
    private Operation personOperation;

    public Person() {
    }

    public Person(String name, String surname, String qualificationLevel, String trainingLevel) {
        this.name = name;
        this.surname = surname;
        this.qualificationLevel = qualificationLevel;
        this.trainingLevel = trainingLevel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getQualificationLevel() {
        return qualificationLevel;
    }

    public void setQualificationLevel(String qualificationLevel) {
        this.qualificationLevel = qualificationLevel;
    }

    public String getTrainingLevel() {
        return trainingLevel;
    }

    public void setTrainingLevel(String trainingLevel) {
        this.trainingLevel = trainingLevel;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", qualificationLevel='" + qualificationLevel + '\'' +
                ", trainingLevel='" + trainingLevel +
                '}';
    }

    public Operation getPersonOperation() {
        return personOperation;
    }

    public void setPersonOperation(Operation personOperation) {
        this.personOperation = personOperation;
    }
}
