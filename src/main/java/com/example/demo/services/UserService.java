package com.example.demo.services;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    List<User> list = new ArrayList<>();

    public UserService() {
        list.add(new User("Rishabh", "rish", "rishabh@gmail.com"));
        list.add(new User("Rahul", "rahu", "rahul@gmail.com"));
        list.add(new User("Kamal", "kama", "kamal@gmail.com"));
    }

    // get users list
    public List<User> getAllUsers(){
        return this.list;
    }

    // get single user
    public User getUser(String userName){
        return this.list.stream().filter((user)-> user.getUserName().equals(userName)).findAny().orElse(null);
    }
    // add new user
    public User addUser(User user){
        this.list.add(user);
        return user;
    }
}
