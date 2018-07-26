package com.dubbo.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * <p>Title:	  dubbo-parent <br/> </p>
 * <p>Description TODO <br/> </p>
 * <p>Company:    http://www.hnxianyi.com  <br/> </p>
 *
 * @Author <a href="liqiaolin333@163.com"/>李巧林</a>  <br/>
 * @Date 2018/7/25 17:56
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo-config.xml"})
public class DubboCustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboCustomerApplication.class, args);
    }
}
