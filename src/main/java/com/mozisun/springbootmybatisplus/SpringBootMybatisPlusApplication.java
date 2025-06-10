package com.mozisun.springbootmybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot 应用启动类
 * <p>
 * 该类标注了 @SpringBootApplication，启用了 Spring Boot 的自动配置和组件扫描功能，
 * 同时通过 @MapperScan 指定了 MyBatis-Plus 的 Mapper 接口包路径，
 * 以便框架自动扫描并生成对应的 Mapper 实现。
 * <p>
 * 这是整个应用的入口，负责启动 Spring 应用上下文。
 */
@SpringBootApplication
@MapperScan("com.mozisun.springbootmybatisplus.mapper")
public class SpringBootMybatisPlusApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringBootMybatisPlusApplication.class, args);
  }
}
