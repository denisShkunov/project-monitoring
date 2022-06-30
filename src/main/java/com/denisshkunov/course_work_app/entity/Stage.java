package com.denisshkunov.course_work_app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stages")
public class Stage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private String time;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "phase_id")
    private Phase phase;

    @OneToMany(mappedBy = "stage"
            , cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    private List<Operation> operations;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "brigade_id")
    private Brigade brigade;

    public Stage() {
    }

    public Stage(String name, String time) {
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

    public Phase getPhase() {
        return phase;
    }

    public void setPhase(Phase phase) {
        this.phase = phase;
    }

    public Brigade getBrigade() {
        return brigade;
    }

    public void setBrigade(Brigade brigade) {
        this.brigade = brigade;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time='" + time + '\'' +
                ", phase=" + phase +
                '}';
    }
}
