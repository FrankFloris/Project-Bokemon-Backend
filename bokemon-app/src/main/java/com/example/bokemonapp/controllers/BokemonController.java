package com.example.bokemonapp.controllers;

import com.example.bokemonapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.bokemonapp.services.BokemonService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class BokemonController {

    @Autowired private BokemonService bokemonService;

    @ResponseBody
    @RequestMapping(value = "/bokemon", method = RequestMethod.POST)
    public int create(@RequestBody Bokemon bokemon) { return bokemonService.save(bokemon).getId(); }

    @ResponseBody
    @RequestMapping(value = "/bokemon/{id}", method = RequestMethod.PUT)
    public int updateBokemon(@PathVariable int id, @RequestBody Bokemon bokemon) { return bokemonService.save(bokemon).getId(); }

    @ResponseBody
    @RequestMapping(value = "/bokemon/{id}", method = RequestMethod.GET)
    public Optional<Bokemon> bokemonById(@PathVariable int id) { return bokemonService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/bokemon", method = RequestMethod.GET)
    public List<Bokemon> findAll() {
        return (List<Bokemon>)bokemonService.findAll();
    }













}
