package com.dubbo.provider.service.impl;

import com.dubbo.provider.service.loginService;
import org.springframework.stereotype.Service;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 14:32
 */
@Service
public class loginServiceImpl implements loginService {
    @Override
    public void login() {
        System.out.println("访问到了");
    }
}
