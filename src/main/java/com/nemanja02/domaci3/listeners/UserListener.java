package com.nemanja02.domaci3.listeners;

import com.nemanja02.domaci3.models.User;
import jakarta.persistence.PostLoad;
import jakarta.persistence.PostPersist;
import jakarta.persistence.PrePersist;

public class UserListener {
    @PostLoad
    private void setFullName(User user) {
        System.out.println("setFullName: " + user.getUsername());
        user.setFullName(user.getFirstName() + " " + user.getLastName());
    }

    @PrePersist
    private void prePersist(User user)
    {
        System.out.println("User@prePersist");
        this.setFullName(user);
    }

    @PostPersist
    private void postPersist(User user)
    {
        System.out.println("User@postPersist");
    }
}
