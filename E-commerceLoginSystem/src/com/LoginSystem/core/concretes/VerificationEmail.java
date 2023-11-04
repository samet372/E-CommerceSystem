package com.LoginSystem.core.concretes;

import com.LoginSystem.core.abstracts.Verification;
import com.LoginSystem.entites.concretes.User;

public class VerificationEmail implements Verification {
    @Override
    public void PushVerification(User user) {
        System.out.println(user.geteMail() + " Adresine doğrulama gönderildi ");
    }

    @Override
    public void ClickVerified(User user) {
        System.out.println("E-posta doğrulandı");
    }


}
