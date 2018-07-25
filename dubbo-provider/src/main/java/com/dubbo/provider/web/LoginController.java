package com.dubbo.provider.web;

import com.dubbo.provider.service.loginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 14:17
 */
@RestController
public class LoginController {
    @Resource
    private loginService loginService;

    @RequestMapping("/login")
    public void login(){
        System.out.println("登陆啦");
        System.out.println("hhhhhhhhhhhh");
        loginService.login();
        System.out.println("hhhhhhhhhhhh");

    }
}
