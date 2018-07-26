package com.dubbo.customer.service.impl;

import com.dubbo.customer.service.UserInfoService;
import com.dubbo.user.provider.dto.UserLoginRequestDto;
import com.dubbo.user.provider.dto.UserLoginResponseDto;
import com.dubbo.user.provider.service.UserLoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 17:54
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Resource
    private UserLoginService userLoginService;

    @Override
    public void getUserInfo() {
        System.out.println("user信息");
        UserLoginRequestDto userLoginRequestDto = new UserLoginRequestDto();
        userLoginRequestDto.setPassWord("11111");
        userLoginRequestDto.setUserName("哈哈哈哈哈哈");
        UserLoginResponseDto userLoginResponseDto = userLoginService.doLogin(userLoginRequestDto);
        System.out.println("密码 = "+ userLoginResponseDto.getPassWord() + " 名字 = " + userLoginResponseDto.getUserName());
        System.out.println("反参 = "  + userLoginResponseDto);
    }
}
