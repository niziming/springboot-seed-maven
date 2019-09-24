package cn.springboot.seed.service.impl;

import cn.springboot.seed.model.User;
import cn.springboot.seed.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {
    @Autowired
    private UserService userService;
    @Test
    public void selectAllUsers() {
        userService.selectAllUsers().forEach( user -> System.out.println(user));
    }

    @Test
    public void login() {
        User user = new User();
        user.setUsername("ziming");
        user.setPassword("ziming");
        System.out.println(user);

        User login = userService.login(user);

        System.out.println(login);
    }
}