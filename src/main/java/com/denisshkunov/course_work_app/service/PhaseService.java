package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.entity.Phase;

import java.util.List;


public interface PhaseService {
    public List<Phase> getPhaseByProjectId(int projectId);

}
