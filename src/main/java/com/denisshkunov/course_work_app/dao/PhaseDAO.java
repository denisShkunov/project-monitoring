package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Phase;

import java.util.List;

public interface PhaseDAO {
    public List<Phase> getPhaseByProjectId(int projectId);
}
