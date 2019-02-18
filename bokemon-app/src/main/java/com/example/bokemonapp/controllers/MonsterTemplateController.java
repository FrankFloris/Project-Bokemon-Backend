package com.example.bokemonapp.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.example.bokemonapp.services.MonsterTemplateService;
import com.example.bokemonapp.model.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class MonsterTemplateController {

    @Autowired private MonsterTemplateService monsterTemplateService;

    @ResponseBody
    @RequestMapping(value = "/monsterTemplate", method =RequestMethod.POST)
    public int create(@RequestBody MonsterTemplate monsterTemplate){
    return monsterTemplateService.save(monsterTemplate).getId(); }

    @ResponseBody
    @RequestMapping(value = "/monsterTemplate/{id}", method = RequestMethod.PUT)
    public int updateMonsterbase(@PathVariable int id, @RequestBody MonsterTemplate monsterTemplate) { return monsterTemplateService.save(monsterTemplate).getId(); }

    @ResponseBody
    @RequestMapping(value = "/monsterTemplate/{id}", method = RequestMethod.GET)
    public Optional<MonsterTemplate> monsterbaseById(@PathVariable int id) { return monsterTemplateService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/monsterTemplate", method = RequestMethod.GET)
    public List<MonsterTemplate> findAll() {
        return (List<MonsterTemplate>) monsterTemplateService.findAll();
    }

}
