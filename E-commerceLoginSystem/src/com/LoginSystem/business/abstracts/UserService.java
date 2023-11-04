package com.LoginSystem.business.abstracts;

import com.LoginSystem.entites.concretes.User;

public interface UserService {
    void register(User user);

    void login(User user);
}
