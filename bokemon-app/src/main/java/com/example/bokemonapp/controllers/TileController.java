package com.example.bokemonapp.controllers;

import com.example.bokemonapp.model.Tile;
import com.example.bokemonapp.services.TileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class TileController {

    @Autowired
    private TileService tileService;

    @ResponseBody
    @RequestMapping(value = "/tile", method = RequestMethod.POST)
    public int create(@RequestBody Tile tile) { return tileService.save(tile).getId(); }

    @ResponseBody
    @RequestMapping(value = "/tile/{id}", method = RequestMethod.PUT)
    public int updateTile(@PathVariable int id, @RequestBody Tile tile) { return tileService.save(tile).getId(); }

    @ResponseBody
    @RequestMapping(value = "/tile/{id}", method = RequestMethod.GET)
    public Optional<Tile> tileById(@PathVariable int id) { return tileService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/tile", method = RequestMethod.GET)
    public List<Tile> findAll() {
        return (List<Tile>)tileService.findAll();
    }

}
