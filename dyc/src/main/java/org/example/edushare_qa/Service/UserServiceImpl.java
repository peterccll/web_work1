package org.example.edushare_qa.Service;

import lombok.extern.slf4j.Slf4j;
import org.example.edushare_qa.Mapper.UserMapper;
import org.example.edushare_qa.Pojo.LoginParam;
import org.example.edushare_qa.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public void Register(User user) {
        user.setCreatedAt(LocalDateTime.now());
        userMapper.Register(user);
    }

    @Override
    public User login(LoginParam loginParam) {
        return userMapper.login(loginParam);
    }
}
