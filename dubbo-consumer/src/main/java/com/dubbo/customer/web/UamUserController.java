package com.dubbo.customer.web;

import com.dubbo.customer.service.UserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 17:51
 */
@RestController
public class UamUserController {

    @Resource
    private UserInfoService userInfoService;

    @RequestMapping("/user")
    public void userInfo(){
        System.out.println("消费方，，，");

        userInfoService.getUserInfo();


    }
}
