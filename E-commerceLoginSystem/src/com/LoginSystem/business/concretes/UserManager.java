package com.LoginSystem.business.concretes;

import com.LoginSystem.business.abstracts.UserService;
import com.LoginSystem.core.concretes.GLoginManagerAdapter;
import com.LoginSystem.core.concretes.VerificationEmail;
import com.LoginSystem.dataAccess.concretes.HibernateUserDao;
import com.LoginSystem.entites.concretes.User;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    private HibernateUserDao hibernateUserDao;
    private VerificationEmail verificationEmail;
    private GLoginManagerAdapter gLoginManagerAdapter;

    public UserManager(HibernateUserDao hibernateUserDao, VerificationEmail verificationEmail, GLoginManagerAdapter gLoginManagerAdapter) {
        this.hibernateUserDao = hibernateUserDao;
        this.verificationEmail = verificationEmail;
        this.gLoginManagerAdapter = gLoginManagerAdapter;
    }

    @Override
    public void register(User user) {

        for (User users : hibernateUserDao.getAll()){
            if (users.geteMail() == user.geteMail()){
                System.out.println("kullanıcı zaten kayıtlı ");
                return;
            }
        }

        final String EMAIL_PATTERN = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        final Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(user.geteMail());

        if (matcher.matches()){
            if (user.getPassword().length() >= 6 & user.getFirstName().length() >= 2 & user.getLastName().length() >= 2) {
                System.out.println("kayıt başarılı");
                hibernateUserDao.registerLog(user);
                verificationEmail.PushVerification(user);
                verificationEmail.ClickVerified(user);
                gLoginManagerAdapter.LoginService(user);
            } else {
                System.out.println("Hatalı bilgileri düzeltin!");
            }
        }
        if (!matcher.matches()) {
            System.out.println("Email formatı desteklenmiyor");
        }
    }


    @Override
    public void login(User user) {

    }
}
