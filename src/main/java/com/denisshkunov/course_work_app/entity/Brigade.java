package com.denisshkunov.course_work_app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brigades")
public class Brigade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "functional_feature")
    private String functionalFeature;

    @OneToMany(cascade = CascadeType.ALL
            , mappedBy = "brigade"
            , fetch = FetchType.LAZY)
    private List<Person> people;

    public Brigade() {
    }

    public Brigade(String name, String functionalFeature) {
        this.name = name;
        this.functionalFeature = functionalFeature;
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

    public String getFunctionalFeature() {
        return functionalFeature;
    }

    public void setFunctionalFeature(String functionalFeature) {
        this.functionalFeature = functionalFeature;
    }

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "Brigade{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", functionalFeature='" + functionalFeature + '\'' +
                '}';
    }
}
