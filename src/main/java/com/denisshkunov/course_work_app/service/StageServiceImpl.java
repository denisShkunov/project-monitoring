package com.denisshkunov.course_work_app.service;

import com.denisshkunov.course_work_app.dao.StageDAO;
import com.denisshkunov.course_work_app.entity.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StageServiceImpl implements StageService {

    @Autowired
    private StageDAO stageDAO;

    @Override
    @Transactional
    public List<Stage> getStageByPhaseId(int id) {
         return stageDAO.getStageOfPhaseId(id);
    }
}
