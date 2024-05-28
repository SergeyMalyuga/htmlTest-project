package com.maluga.sergey.htmlTest.configurates;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/simple").setViewName("simple");
        registry.addViewController("/forms").setViewName("forms");
        registry.addViewController("/regist").setViewName("regist");
    }
}
