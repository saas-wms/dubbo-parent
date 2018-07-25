package com.dubbo.provider.supply.service.impl;

import com.dubbo.user.provider.dto.UserLoginRequestDto;
import com.dubbo.user.provider.dto.UserLoginResponseDto;
import com.dubbo.user.provider.service.UserLoginService;
import org.springframework.stereotype.Service;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 15:22
 */
@Service
public class UserLoginServiceImpl implements UserLoginService {
    @Override
    public UserLoginResponseDto doLogin(UserLoginRequestDto requestDto) {
        System.out.println("调进来啦！！！！！！！！！");
        UserLoginResponseDto userLoginResponseDto = new UserLoginResponseDto();
        userLoginResponseDto.setUserName(requestDto.getUserName());
        return userLoginResponseDto;
    }
}
