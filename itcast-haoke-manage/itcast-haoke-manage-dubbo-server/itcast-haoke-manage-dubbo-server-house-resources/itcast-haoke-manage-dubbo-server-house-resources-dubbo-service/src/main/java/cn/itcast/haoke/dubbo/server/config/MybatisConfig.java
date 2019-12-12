package cn.itcast.haoke.dubbo.server.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@MapperScan("cn.itcast.haoke.dubbo.server.mapper")
@Configuration // 会识别做为springboot的配置类
public class MybatisConfig {

}