package com.example.shop.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Value("${uploadPath}")
    String uploadPath;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//url이 /images로 시작하는 경우 uploadPath에 설정한 폴더를 파일을 읽어 올 root 경로로 사용함
        registry.addResourceHandler("/images/**")
                .addResourceLocations(uploadPath);
    }
}
