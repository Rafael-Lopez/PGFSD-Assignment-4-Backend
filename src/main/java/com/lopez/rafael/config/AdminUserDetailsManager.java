package com.lopez.rafael.config;

import com.lopez.rafael.model.SecurityUser;
import com.lopez.rafael.model.User;
import com.lopez.rafael.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserDetailsManager implements UserDetailsManager {
    private UserRepository userRepository;

    @Autowired
    public AdminUserDetailsManager(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void createUser(UserDetails userDetails) {

    }

    @Override
    public void updateUser(UserDetails userDetails) {

    }

    @Override
    public void deleteUser(String s) {

    }

    @Override
    public void changePassword(String s, String s1) {

    }

    @Override
    public boolean userExists(String username) {
        List<User> users = userRepository.findByUsername(username);
        return users.size() != 0;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<User> users = userRepository.findByUsername(username);

        if(users.isEmpty()) {
            throw  new UsernameNotFoundException("User details not found for username :" + username);
        }
        return new SecurityUser(users.get(0));
    }
}
