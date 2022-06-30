package com.denisshkunov.course_work_app.entity;


import javax.persistence.*;

@Entity
@Table(name = "operations")
public class Operation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private String time;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person operationPerson;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "stage_id")
    private Stage stage;

    public Operation() {
    }

    public Operation(String name, String time) {
        this.name = name;
        this.time = time;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Person getOperationPerson() {
        return operationPerson;
    }

    public void setOperationPerson(Person operationPerson) {
        this.operationPerson = operationPerson;
    }

    public Stage getOperationsStage() {
        return stage;
    }

    public void setOperationsStage(Stage stage) {
        this.stage = stage;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", operationPerson=" + operationPerson +
                '}';
    }
}
