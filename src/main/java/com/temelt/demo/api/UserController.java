package com.temelt.demo.api;

import com.temelt.demo.entity.User;
import com.temelt.demo.repo.UserRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * Created by tanert on 14.03.2018.
 */
@RestController
@CrossOrigin
public class UserController {
    private UserRepository repository;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/adminlist")
    public Collection<User> adminUsers() {
        return repository.findAll().stream().filter(this::isAdmin).collect(Collectors.toList());
    }

    @GetMapping("/users")
    public Collection<User> users() {
        return repository.findAll();
    }

    private boolean isAdmin(User user) {
        return !user.getName().equals("ahmet") && !user.getName().equals("mehmet") && !user.getName().equals("ali") && !user.getName().equals("veli");
    }
}
