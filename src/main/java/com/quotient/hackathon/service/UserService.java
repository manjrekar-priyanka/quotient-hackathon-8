package com.quotient.hackathon.service;

import com.quotient.hackathon.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private List<User> userList = new ArrayList<>();
    private static int userCounter;

    public User addUser(User user) {
        userList.add(user);
        user.setId(++userCounter);
        return user;
    }

    public void deleteUser(User user) {
        userList.remove(user);
    }

    public User getUserByEmail(String email) {
        for (User user: userList
             ) {
            if (user.getEmail().equalsIgnoreCase(email)) {
                return user;
            }
        }
        return null;
    }

    public User getUserById(Integer userId) {
        for (User user: userList
        ) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }


}
