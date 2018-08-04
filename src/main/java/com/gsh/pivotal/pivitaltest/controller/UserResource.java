package com.gsh.pivotal.pivitaltest.controller;

import com.gsh.pivotal.pivitaltest.dao.UsersDao;
import com.gsh.pivotal.pivitaltest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserResource {


    @Autowired
    private UsersDao usersDao;

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return usersDao.findAll();
    }

    @GetMapping("/{name}")
    public List<User> getUser (@PathVariable String name){
        return usersDao.findByName(name);
    }

    @PostMapping("/load")
    public List<User> loadUser(@RequestBody User user){
        usersDao.save(user);
        return usersDao.findByName(user.getName());
    }

}
