package com.LoginSystem.GoogleLogin;

import com.LoginSystem.entites.concretes.User;

public class GLoginManager {
    public void Login(User user){
        System.out.println("Google ile giriş yapıldı kullanıcı: " + user.getFirstName());
    }

}
