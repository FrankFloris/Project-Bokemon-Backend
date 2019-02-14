package com.example.bokemonapp.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

import com.example.bokemonapp.model.*;
import com.example.bokemonapp.services.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class LoginController {
    @Autowired private LoginService loginService;

//    @ResponseBody
//    @RequestMapping(value = "/login-page", method = RequestMethod.POST)
//    public int create(@RequestBody Login login) {
//        return loginService.save(login).getId();
//    }
//
//    @ResponseBody
//    @RequestMapping(value = "/login-page/{id}", method = RequestMethod.PUT)
//    public int updateLogin(@PathVariable int id, @RequestBody Login login){
//        return loginService.save(login).getId();
//    }


//    @ResponseBody
//    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
//    public boolean authenticate(@RequestBody Signup signup) {
//        List<Signup> list = (List<Signup>) loginService.findByUsernameAndPassword(signup.getUsername(), signup.getPassword());
//        return !list.isEmpty();
//    }


    @ResponseBody
    @RequestMapping(value = "/login/{id}", method = RequestMethod.GET)
    public Optional<Signup> loginById(@PathVariable  int id) {
        return loginService.findById(id);
    }















}
