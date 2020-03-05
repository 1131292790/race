package com.fuchuang.race.controller;

import com.fuchuang.race.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    /**
     * 登录
     */
    @RequestMapping("/login")
    public void login(){
        //TODO shiro登录控制
    }

    /**
     * 退出
     * @return
     */
    @RequestMapping("/logout")
    public String logout(){
        //
        return "退出成功";
    }

    /**
     * 修改密码
     * @param pwd
     * @return
     */
    @RequestMapping("/editpwd")
    @ResponseBody
    public String editpwd(String pwd){
        //判断密码和旧密码是否一致
        if(1==1){
            return "新密码不能和旧密码相同";
        }else{
            //TODO 调用修改密码的方法
            return "密码修改成功";
        }
    }
}
