package cn.springboot.seed.service.impl;

import cn.springboot.seed.mapper.UserMapper;
import cn.springboot.seed.model.User;
import cn.springboot.seed.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectAllUsers() {
        List<User> users = userMapper.selectAll();
        return users;
    }

    @Override
    public User login(User user) {
        try {
            User loginUser = userMapper.selectOne(user);
            return loginUser;
        } catch (Exception e){
            System.out.println(e);
        }
        return null;
    }
}
