
package com.tshepo.SPRING.BOOT.Apllication.Dao;

public interface FakeRepoInterface {

    static String insertUser(int userId, String userName, String userSurname) {
        return FakeRepo.insertUser(1,"black","boy");
    }

    String findUserById(int userId);
    String deleteUser(int userId);

}