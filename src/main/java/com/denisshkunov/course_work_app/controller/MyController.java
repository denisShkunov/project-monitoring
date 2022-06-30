package com.denisshkunov.course_work_app.controller;

import com.denisshkunov.course_work_app.entity.*;
import com.denisshkunov.course_work_app.service.*;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/course")
public class MyController {

    @Autowired
    private PersonService personService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private PhaseService phaseService;

    @Autowired
    private StageService stageService;

    @Autowired
    private BrigadeService brigadeService;

    @Autowired
    private OperationService operationService;

    @RequestMapping("/employees")
    public String showAllEmployees(Model model) {

        List <Person> allPeople = personService.getAllPeople();
        model.addAttribute("allPeople",
                 personService.getAllPeople());

        System.out.println(allPeople);

        return "all-people";
    }

    @RequestMapping("/addNewEmployee")
    public String addPerson(Model model) {
        Person person = new Person();
        personService.savePerson(person);

        model.addAttribute("person", person);

        return "add-people";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("person") Person person) {
        personService.savePerson(person);

        return "redirect:/course/employees";
    }

    @RequestMapping("/updateEmployee")
    public String updatePerson(@RequestParam("personId") int id, Model model) {

        Person person = personService.getPerson(id);
        model.addAttribute("person", person);

        return "add-people";
    }

    @RequestMapping("/deleteEmployee")
    public String deletePerson(@RequestParam("personId") int id) {
        personService.deletePerson(id);
        return "redirect:/course/employees";
    }

    @RequestMapping("/projects")
    public String showAllProject(Model model) {

        List<Project> allProjects = projectService.getAllProjects();
        model.addAttribute("allProjects", allProjects);

        return "all-project";
    }

    @RequestMapping("/phases")
    public String showPhaseByProjectId(@RequestParam("projectId") int id, Model model) {
        List<Phase> phasesOfProject = phaseService.getPhaseByProjectId(id);
        System.out.println(phasesOfProject);
        model.addAttribute("phaseOfProject", phasesOfProject);

        return "phases-of-project";
    }

    @RequestMapping("/stages")
    public String showStageByPhaseId(@RequestParam("phaseId") int id, Model model) {
        List <Stage> stageOfPhase = stageService.getStageByPhaseId(id);
        model.addAttribute("stageOfPhase", stageOfPhase);
        return "stage-of-phase";

    }

    @RequestMapping("/operations")
    public String showOperationsByStageId(@RequestParam("stageId") int id, Model model){
        List<Operation> operationOfStage = operationService.getOperationByStageId(id);
        model.addAttribute("operationOfStage", operationOfStage);
        return "operation-of-stage";
    }

    @RequestMapping("/brigades")
    public String showAllBrigade(Model model) {
        model.addAttribute("allBrigade", brigadeService.getAllBrigade());
        return "all-brigade";
    }

    @RequestMapping("/peopleInBrigade")
    public String showPeopleInBrigade(@RequestParam("brigadeId") int id, Model model) {
        model.addAttribute("peopleInBrigade", personService.getPersonInBrigade(id));
        return "people-in-brigade";

    }
}
