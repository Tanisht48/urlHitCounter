package com.Geekster.UrlHItCounterApplication.BeanManager;

import com.Geekster.UrlHItCounterApplication.Controller.UrlHitController;
import com.Geekster.UrlHItCounterApplication.Entity.UrlHitCounter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {

    @Bean
    public List<UrlHitCounter> getUrlHitCounterList(){

        return new ArrayList<>();
    }
}
