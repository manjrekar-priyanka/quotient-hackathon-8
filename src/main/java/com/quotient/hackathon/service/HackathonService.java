package com.quotient.hackathon.service;

import com.quotient.hackathon.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HackathonService {

    private List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public User getUser(String email) {
        for (User user: userList
             ) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }


}
