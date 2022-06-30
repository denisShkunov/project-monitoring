package com.denisshkunov.course_work_app.dao;

import com.denisshkunov.course_work_app.entity.Stage;

import java.util.List;


public interface StageDAO {
    public List<Stage> getStageOfPhaseId(int id);
}
