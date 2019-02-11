package com.example.bokemonapp.controllers;

import com.example.bokemonapp.model.Player;
import com.example.bokemonapp.model.WorldMap;
import com.example.bokemonapp.services.PlayerService;
import com.example.bokemonapp.services.WorldMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class WorldMapController {

    @Autowired
    private WorldMapService worldMapService;

    @ResponseBody
    @RequestMapping(value = "/worldMap", method = RequestMethod.POST)
    public int create(@RequestBody WorldMap worldMap) { return worldMapService.save(worldMap).getId(); }

    @ResponseBody
    @RequestMapping(value = "/worldMap/{id}", method = RequestMethod.PUT)
    public int updateWorldMap(@PathVariable int id, @RequestBody WorldMap worldMap) { return worldMapService.save(worldMap).getId(); }

    @ResponseBody
    @RequestMapping(value = "/worldMap/{id}", method = RequestMethod.GET)
    public Optional<WorldMap> worldMapById(@PathVariable int id) { return worldMapService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/worldMap", method = RequestMethod.GET)
    public List<WorldMap> findAll() {
        return (List<WorldMap>)worldMapService.findAll();
    }

}
