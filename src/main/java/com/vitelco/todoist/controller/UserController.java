package com.vitelco.todoist.controller;

import com.vitelco.todoist.exception.NotFoundException;
import com.vitelco.todoist.model.User;
import com.vitelco.todoist.service.UserService;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    @ResponseBody
    public List<User> findAll(){
        return userService.findALL();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return userService.findById(id).orElseThrow(NotFoundException::new);
    }

    @GetMapping("/email/{email}")
    public User findByEmail(@PathVariable String email){
        return userService.findByEmail(email).orElseThrow(NotFoundException::new);
    }

    @PostMapping
    @ResponseBody
    public User createUser(@RequestBody User user){
        return userService.save(user);
    }
}
