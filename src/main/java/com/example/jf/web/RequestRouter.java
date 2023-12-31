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
        registry.addViewController("/home-zh").setViewName("/zh/index-zh");
        registry.addViewController("/about-zh").setViewName("/zh/about-zh");
        registry.addViewController("/contact-zh").setViewName("/zh/contact-zh");
        registry.addViewController("/products-zh").setViewName("/zh/products-zh");
        registry.addViewController("/fragment-zh").setViewName("/fragments/fragment-zh");
        registry.addViewController("/selective").setViewName("/products/selective");
        registry.addViewController("/drivein").setViewName("/products/drivein");
        registry.addViewController("/livestorage").setViewName("/products/livestorage");
        registry.addViewController("/narrowaisle").setViewName("/products/narrowaisle");
        registry.addViewController("/pushback").setViewName("/products/pushback");
        registry.addViewController("/shuttle").setViewName("/products/shuttle");
        registry.addViewController("/doubledeep").setViewName("/products/doubledeep");
        registry.addViewController("/asrs").setViewName("/products/asrs");
        registry.addViewController("/cantilever").setViewName("/products/cantilever");
        registry.addViewController("/mobile").setViewName("/products/mobile");
        registry.addViewController("/mezzanine").setViewName("/products/mezzanine");
        registry.addViewController("/platform").setViewName("/products/platform");
        registry.addViewController("/boltless").setViewName("/products/boltless");
        registry.addViewController("/mobileshelving").setViewName("/products/mobileshelving");
        registry.addViewController("/selective-vn").setViewName("/products-vn/selective-vn");
        registry.addViewController("/drivein-vn").setViewName("/products-vn/drivein-vn");
        registry.addViewController("/livestorage-vn").setViewName("/products-vn/livestorage-vn");
        registry.addViewController("/narrowaisle-vn").setViewName("/products-vn/narrowaisle-vn");
        registry.addViewController("/pushback-vn").setViewName("/products-vn/pushback-vn");
        registry.addViewController("/shuttle-vn").setViewName("/products-vn/shuttle-vn");
        registry.addViewController("/doubledeep-vn").setViewName("/products-vn/doubledeep-vn");
        registry.addViewController("/asrs-vn").setViewName("/products-vn/asrs-vn");
        registry.addViewController("/cantilever-vn").setViewName("/products-vn/cantilever-vn");
        registry.addViewController("/mobile-vn").setViewName("/products-vn/mobile-vn");
        registry.addViewController("/mezzanine-vn").setViewName("/products-vn/mezzanine-vn");
        registry.addViewController("/platform-vn").setViewName("/products-vn/platform-vn");
        registry.addViewController("/boltless-vn").setViewName("/products-vn/boltless-vn");
        registry.addViewController("/mobileshelving-vn").setViewName("/products-vn/mobileshelving-vn");
        registry.addViewController("/selective-zh").setViewName("/products-zh/selective-zh");
        registry.addViewController("/drivein-zh").setViewName("/products-zh/drivein-zh");
        registry.addViewController("/livestorage-zh").setViewName("/products-zh/livestorage-zh");
        registry.addViewController("/narrowaisle-zh").setViewName("/products-zh/narrowaisle-zh");
        registry.addViewController("/pushback-zh").setViewName("/products-zh/pushback-zh");
        registry.addViewController("/shuttle-zh").setViewName("/products-zh/shuttle-zh");
        registry.addViewController("/doubledeep-zh").setViewName("/products-zh/doubledeep-zh");
        registry.addViewController("/asrs-zh").setViewName("/products-zh/asrs-zh");
        registry.addViewController("/cantilever-zh").setViewName("/products-zh/cantilever-zh");
        registry.addViewController("/mobile-zh").setViewName("/products-zh/mobile-zh");
        registry.addViewController("/mezzanine-zh").setViewName("/products-zh/mezzanine-zh");
        registry.addViewController("/platform-zh").setViewName("/products-zh/platform-zh");
        registry.addViewController("/boltless-zh").setViewName("/products-zh/boltless-zh");
        registry.addViewController("/mobileshelving-zh").setViewName("/products-zh/mobileshelving-zh");
    }
}