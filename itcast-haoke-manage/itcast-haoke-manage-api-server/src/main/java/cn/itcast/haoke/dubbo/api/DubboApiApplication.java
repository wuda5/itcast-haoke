package cn.itcast.haoke.dubbo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// --注意：对外暴露的端口是：18080
@SpringBootApplication
public class DubboApiApplication {

    public static void main(String[] args) {

        
        SpringApplication.run(DubboApiApplication.class, args);
        System.out.println("++++ test tag [api server start ok!]++++");
    }
}