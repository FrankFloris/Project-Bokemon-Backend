package com.example.bokemonapp.controllers;

import com.example.bokemonapp.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.bokemonapp.services.PlayerService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class PlayerController {

    @Autowired private PlayerService playerService;

    @ResponseBody
    @RequestMapping(value = "/player", method = RequestMethod.POST)
    public int create(@RequestBody Player player) { return playerService.save(player).getId(); }

    @ResponseBody
    @RequestMapping(value = "/player/{id}", method = RequestMethod.PUT)
    public int updatePlayer(@PathVariable int id, @RequestBody Player player) { return playerService.save(player).getId(); }

    @ResponseBody
    @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
    public Optional<Player> playerById(@PathVariable int id) { return playerService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public List<Player> findAll() {
        return (List<Player>)playerService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public boolean authenticate(@RequestBody Player player) {
        List<Player> list = (List<Player>) playerService.findByUsernameAndPassword(player.getUsername(), player.getPassword());
        return !list.isEmpty();
    }
}
