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

    public User getUserById(Integer userId) {
        for (User user: userList
        ) {
            if (user.getId() == userId) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAllUsers() {
        return userList;
    }

    public User deleteUser(Integer userId) {
        for (User user: userList
        ) {
            if (user.getId() == userId) {
                boolean isDeleted = userList.remove(user);
                if(isDeleted) {
                    return user;
                }
                return null;
            }
        }
        return null;
    }

}
