package com.tshepo.SPRING.BOOT.Apllication.model;

//Creating a table User with column rows
@Entity
public class User {
//    creating a primary on our User table
    @Id
    public static int userId;
    public static String userName;
    public String userSurname;

    // Constructing class User
    public User(int userId, String userName, String userSurname) {
        User.userId = userId;
        User.userName = userName;
        this.userSurname = userSurname;
    }

    public static int getUserId() {
        return  userId;
    }

    public int setUserId(int userId) {
        User.userId = userId;
        return userId;
    }

    public static String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        User.userName = userName;
    }

    public  String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {

        this.userSurname = userSurname;
    }


}
