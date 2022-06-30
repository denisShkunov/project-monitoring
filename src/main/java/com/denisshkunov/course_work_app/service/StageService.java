package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.entity.Stage;

import java.util.List;

public interface StageService {

    public List<Stage> getStageByPhaseId(int id);
}
