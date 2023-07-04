package com.example.jf.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestRouter implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/about-en").setViewName("about-en");
        registry.addViewController("/contact-en").setViewName("contact-en");
        registry.addViewController("/products-en").setViewName("products-en");
        registry.addViewController("/fragments/fragment").setViewName("fragment");
    }
}