package com.example.Agricultural.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class MyWebMvcConfigurer extends WebMvcConfigurationSupport {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //   访问绝对路径 访问路径和 存放路径可以自定义，建议存放路径放到配置文件中
        registry.addResourceHandler("/assets/**").addResourceLocations("file:/Users/gaoxiang/Desktop/");
        super.addResourceHandlers(registry);
    }
}

