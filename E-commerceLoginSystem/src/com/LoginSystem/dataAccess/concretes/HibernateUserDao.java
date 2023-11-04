package com.LoginSystem.dataAccess.concretes;

import com.LoginSystem.dataAccess.abstracts.UserDao;
import com.LoginSystem.entites.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class HibernateUserDao implements UserDao {

    List<User> users = new ArrayList<>();
    @Override
    public void registerLog(User user) {
        System.out.println("Başarıyla sisteme loglandı. Kullanıcı: " + user.getFirstName());
        users.add(user);
    }
    public List<User> getAll(){
        return this.users;
    }
}
