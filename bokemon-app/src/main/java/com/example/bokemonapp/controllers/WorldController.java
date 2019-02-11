package com.example.bokemonapp.controllers;

import com.example.bokemonapp.model.World;
import com.example.bokemonapp.model.WorldMap;
import com.example.bokemonapp.services.WorldMapService;
import com.example.bokemonapp.services.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class WorldController {

    @Autowired
    private WorldService worldService;

    @ResponseBody
    @RequestMapping(value = "/world", method = RequestMethod.POST)
    public int create(@RequestBody World world) { return worldService.save(world).getId(); }

    @ResponseBody
    @RequestMapping(value = "/world/{id}", method = RequestMethod.PUT)
    public int updateWorld(@PathVariable int id, @RequestBody World world) { return worldService.save(world).getId(); }

    @ResponseBody
    @RequestMapping(value = "/world/{id}", method = RequestMethod.GET)
    public Optional<World> worldById(@PathVariable int id) { return worldService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public List<World> findAll() {
        return (List<World>)worldService.findAll();
    }

}
