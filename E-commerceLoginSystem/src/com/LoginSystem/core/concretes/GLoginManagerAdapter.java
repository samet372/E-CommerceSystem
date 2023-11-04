package com.LoginSystem.core.concretes;

import com.LoginSystem.GoogleLogin.GLoginManager;
import com.LoginSystem.core.abstracts.LoginService;
import com.LoginSystem.entites.concretes.User;

public class GLoginManagerAdapter implements LoginService {

    @Override
    public void LoginService(User user) {
        GLoginManager gLoginManager = new GLoginManager();
        gLoginManager.Login(user);
    }
}
