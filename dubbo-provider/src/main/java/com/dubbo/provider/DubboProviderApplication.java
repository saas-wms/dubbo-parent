package com.dubbo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 11:18
 */

@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-config.xml"})
public class DubboProviderApplication {
    public static void main(String[] args) {
       SpringApplication.run(DubboProviderApplication.class,args);
    }
}
