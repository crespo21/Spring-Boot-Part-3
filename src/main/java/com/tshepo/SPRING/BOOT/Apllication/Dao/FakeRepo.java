package com.tshepo.SPRING.BOOT.Apllication.Dao;
import com.tshepo.SPRING.BOOT.Apllication.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public  class FakeRepo implements FakeRepoInterface{
   public static ArrayList<User> usr = new ArrayList<>();

    public static String insertUser(int userId, String userName, String userSurname) {
        User user = new User(userId,userName,userSurname);
        usr.add(user);
        return userName + " entered";
    }

    @Override
    public  String findUserById(int userId) {
        for (User ignored : usr ) {
            if (User.getUserId() == userId) {
                return "Hello " + User.getUserName();
            }
        }
        return  findUserById(userId);
    }

    @Override
    public String deleteUser(int userId) {
        User user = new User(userId,"","");
        usr.remove(user);
        return User.getUserName() + " removed";
    }
}

