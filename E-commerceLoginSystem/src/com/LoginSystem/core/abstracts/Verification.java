package com.LoginSystem.core.abstracts;

import com.LoginSystem.entites.concretes.User;

public interface Verification {
    void PushVerification(User user);
    void ClickVerified(User user);
}
