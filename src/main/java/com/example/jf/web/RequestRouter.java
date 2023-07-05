package com.example.jf.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RequestRouter implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("/en/index-en");
        registry.addViewController("/home-en").setViewName("/en/index-en");
        registry.addViewController("/about-en").setViewName("/en/about-en");
        registry.addViewController("/contact-en").setViewName("/en/contact-en");
        registry.addViewController("/products-en").setViewName("/en/products-en");
        registry.addViewController("/fragment-en").setViewName("/fragments/fragment-en");
        registry.addViewController("/home-vn").setViewName("/vn/index-vn");
        registry.addViewController("/about-vn").setViewName("/vn/about-vn");
        registry.addViewController("/contact-vn").setViewName("/vn/contact-vn");
        registry.addViewController("/products-vn").setViewName("/vn/products-vn");
        registry.addViewController("/fragment-vn").setViewName("/fragments/fragment-vn");
    }
}