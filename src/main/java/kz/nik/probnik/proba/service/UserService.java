package kz.nik.probnik.proba.service;

import kz.nik.probnik.proba.model.User;
import kz.nik.probnik.proba.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor


public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        User user = userRepository.findByUsername(username);
        if(user!= null) {
            return user;
        }
        throw new RuntimeException("Not found");
    }

    public User getCurrent(String username){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if(authentication!= null && authentication.getPrincipal() instanceof UserDetails){
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            return userRepository.findByUsername(userDetails.getUsername());
        }
        return null;
    }


    public List<User> getUsers(String username){
         return userRepository.findAll();
    }


    public User getUser(String username){
        return userRepository.findByUsername(username);
    }



}
