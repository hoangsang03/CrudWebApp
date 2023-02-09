package com.mycompany.mywebapp;

import com.mycompany.mywebapp.user.User;
import com.mycompany.mywebapp.user.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)


public class UserRepositoryTest {
    @Autowired
    private UserRepository repo;

    @Test
    public void testAddNew() {
//        User user = new User();
//        user.setEmail("nguyenhoang@gmail.com");
//        user.setPassword("123456");
//        user.setFirstName("Sang");
//        user.setLastName("Nguyen");
//        user.setId(1);
//
//        User savedUser = repo.save(user);
//        Assertions.assertThat(savedUser).isNotNull();
//        Assertions.assertThat(savedUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testListAll() {
//        Iterable<User> users = repo.findAll();
//        Assertions.assertThat(users).hasSizeGreaterThan(0);
//
//        for (User user: users
//             ) {
//            System.out.println(user);
//        }
    }

    @Test
    public void testUpdate() {
//        Integer userId = 1;
//        Optional<User> optionalUser = repo.findById(userId);
//        User user = optionalUser.get();
//        user.setPassword("abc123a");
//        user.setEnabled(true);
//        repo.save(user);
//
//        User updatedUser = repo.findById(userId).get();
//
//        Assertions.assertThat(updatedUser.getPassword()).isEqualTo("abc123a");


    }

//    @Test
//    public void testGet() {
//        Integer userId = 1;
//        Optional<User> optionalUser = repo.findById(userId);
//        Assertions.assertThat(optionalUser).isPresent();
//        Assertions.assertThat(optionalUser.get().getId()).isEqualTo(userId);
//    }

    @Test
    public void testDelete() {
//        Integer userId = 1;
//        repo.deleteById(userId);
//        Optional<User> userOptional = repo.findById(userId);
//
//        Assertions.assertThat(userOptional).isNotPresent();

    }



}
