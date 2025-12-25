package org.example.edushare_qa.Controller;

import lombok.extern.slf4j.Slf4j;
import org.example.edushare_qa.Pojo.LoginParam;
import org.example.edushare_qa.Pojo.Result;
import org.example.edushare_qa.Pojo.User;
import org.example.edushare_qa.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param user
     * @return
     */
    @PostMapping("/Register")
    public Result UserRegister(@RequestBody User user){
        userService.Register(user);
        return Result.success();
    }
    /**
     * 用户登录
     * @param loginParam
     * @return
     */
    @PostMapping("/login")
    public Result  login(@RequestBody LoginParam loginParam) {
        log.info("用户登录：{}", loginParam);
        User info=userService.login(loginParam);
        if(info!=null)
            return Result.success(info);
        return Result.error("用户名或密码错误");
    }
}
