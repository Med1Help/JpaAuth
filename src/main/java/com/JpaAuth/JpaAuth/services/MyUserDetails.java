package com.JpaAuth.JpaAuth.services;

import com.JpaAuth.JpaAuth.model.SecurityUser;
import com.JpaAuth.JpaAuth.model.User;
import com.JpaAuth.JpaAuth.repositories.UserRepo;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class MyUserDetails implements UserDetailsService {
    private UserRepo repo;

    public MyUserDetails(UserRepo repo) {
        this.repo = repo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println(username);
        Optional<User> user = repo.findByEmail(username);
        if(user == null) throw new UsernameNotFoundException("User not found");
        List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority(user.get().getRole().name()));
        System.out.println("user : "+user.get());
        return new org.springframework.security.core.userdetails.User(username, user.get().getPassword(), authorities);
    }
}
