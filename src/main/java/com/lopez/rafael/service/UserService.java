package com.lopez.rafael.service;

import com.lopez.rafael.config.AdminUserDetailsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private AdminUserDetailsManager adminUserDetailsManager;

    @Autowired
    public UserService(AdminUserDetailsManager adminUserDetailsManager) {
        this.adminUserDetailsManager = adminUserDetailsManager;
    }

    public void changePassword(String username, String password) {
        adminUserDetailsManager.changePassword(username, password);
    }
}
