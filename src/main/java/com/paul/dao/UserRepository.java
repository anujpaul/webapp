package com.paul.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.paul.model.User;

import java.util.*;

@Repository
public class UserRepository {// extends JpaRepository<User, Long> {


    public List<User> findUsers(){

        List<User> users = Arrays.asList(
                new User("apaul", "hashed_password_123", "ADMIN"),
                new User("jane_smith", "hashed_password_456", "USER"),
                new User("alice_wonderland", "hashed_password_789", "MODERATOR")



        );
        return users;
    }

}
