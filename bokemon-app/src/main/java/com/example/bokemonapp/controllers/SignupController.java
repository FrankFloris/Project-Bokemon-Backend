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
public class SignupController {
    @Autowired private SignupService signupService;

//    @ResponseBody
//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    public boolean signup(@RequestBody Signup signup) {
//        List<Signup> list = (List<Signup>) signupService.findByusername(signup.getUsername());
//        return !list.isEmpty();
//    }

//    @ResponseBody
//    @RequestMapping(value = "/signup", method = RequestMethod.POST)
//    public int create(@RequestBody Signup signup) {
//        List<Signup> list = (List<Signup>) signupService.findByusername(signup.getUsername());
//        return !list.isEmpty();
////        return signupService.save(signup).getId();
//    }





    @ResponseBody
    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public int create(@RequestBody Signup signup) {
        return signupService.save(signup).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/signup", method = RequestMethod.PUT)
    public int updateSignup(@PathVariable int id, @RequestBody Signup signup){
        return signupService.save(signup).getId();
    }

    @ResponseBody
    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public List<Signup> findAll() {
        return (List<Signup>)signupService.findAll();
    }


















}
