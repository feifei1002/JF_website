package com.example.jf.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestRouter implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index-en");
        registry.addViewController("/home-en").setViewName("index-en");
        registry.addViewController("/about-en").setViewName("about-en");
        registry.addViewController("/contact-en").setViewName("contact-en");
        registry.addViewController("/products-en").setViewName("products-en");
        registry.addViewController("/fragments/fragment-en").setViewName("fragment-en");
        registry.addViewController("/home-vn").setViewName("index-vn");
        registry.addViewController("/about-vn").setViewName("about-vn");
        registry.addViewController("/contact-vn").setViewName("contact-vn");
        registry.addViewController("/products-vn").setViewName("products-vn");
        registry.addViewController("/fragments/fragment-vn").setViewName("fragment-vn");
    }
}