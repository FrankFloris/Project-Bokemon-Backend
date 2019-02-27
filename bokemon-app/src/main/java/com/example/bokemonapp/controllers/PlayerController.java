package com.example.bokemonapp.controllers;

import com.example.bokemonapp.model.*;
import com.example.bokemonapp.services.BokemonService;
import org.aspectj.apache.bcel.util.Play;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.example.bokemonapp.services.PlayerService;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class PlayerController {

    @Autowired private PlayerService playerService;
    @Autowired private BokemonService bokemonService;

    @ResponseBody
    @RequestMapping(value = "/player", method = RequestMethod.POST)
    public int create(@RequestBody Player player) {
        player.getBokemons().get(0).setMainBokemon(true);
        bokemonService.save(player.getBokemons().get(0));
        return playerService.save(player).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/player", method = RequestMethod.PATCH)
    public int update (@RequestBody Player player) {
        return playerService.save(player).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/player/{id}", method = RequestMethod.PUT)
    public int updatePlayer(@PathVariable int id, @RequestBody Player player) { return playerService.save(player).getId(); }

    @ResponseBody
    @RequestMapping(value = "/player/{id}", method = RequestMethod.GET)
    public Optional<Player> playerById(@PathVariable int id) { return playerService.findById(id); }

    @ResponseBody
    @RequestMapping(value = "/username/{username}", method = RequestMethod.GET)
    public List<Player> playerByUsername(@PathVariable String username) { return (List<Player>)playerService.findByUsername(username); }

    @ResponseBody
    @RequestMapping(value = "/player", method = RequestMethod.GET)
    public List<Player> findAll() {
        return (List<Player>)playerService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Optional<Player> playerByUsernameAndPassword(@RequestBody LoginForm loginForm) {
        List<Player> list = (List<Player>) playerService.findByUsernameAndPassword(loginForm.getUsername(), loginForm.getPassword());

        if (list.size() > 0) {
            return Optional.of(list.get(0));
        } else {
            return Optional.empty();
        }
    }

    @ResponseBody
    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public boolean authenticate(@RequestBody Player player) {
        List<Player> list = (List<Player>) playerService.findByUsernameAndPassword(player.getUsername(), player.getPassword());
        return !list.isEmpty(); }

}
