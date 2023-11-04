package com.LoginSystem.dataAccess.abstracts;

import com.LoginSystem.entites.concretes.User;

public interface UserDao {

    void registerLog(User user);
}
