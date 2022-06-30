package com.denisshkunov.course_work_app.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "scope")
    private String scope;

    @Column(name = "technical_parameters")
    private String technicalParameters;

    @Column(name = "time")
    private String deadline;

    @OneToMany(cascade = CascadeType.ALL
            , mappedBy = "project"
            , fetch = FetchType.LAZY)
    List<Phase> phases;

    public Project() {
    }

    public Project(String name, String scope, String technicalParameters, String deadline) {
        this.name = name;
        this.scope = scope;
        this.technicalParameters = technicalParameters;
        this.deadline = deadline;
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

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getTechnicalParameters() {
        return technicalParameters;
    }

    public void setTechnicalParameters(String technicalParameters) {
        this.technicalParameters = technicalParameters;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public void setPhases(List<Phase> phases) {
        this.phases = phases;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scope='" + scope + '\'' +
                ", technicalParameters='" + technicalParameters + '\'' +
                ", deadline='" + deadline + '\'' +
                ", phases=" + phases +
                '}';
    }
}
