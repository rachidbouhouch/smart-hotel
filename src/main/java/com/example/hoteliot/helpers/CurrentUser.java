package com.example.hoteliot.helpers;

import com.example.hoteliot.Models.User;

public class CurrentUser {
    private static User user;

    private CurrentUser() {
    }

    public static User getCurrentUser() {
        return user;
    }

    public static void setCurrentUser(User currentUser) {
        user = currentUser;
    }
}
