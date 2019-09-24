package cn.springboot.seed.service;

import cn.springboot.seed.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<User> selectAllUsers();
}
