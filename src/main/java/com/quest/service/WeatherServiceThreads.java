package com.quest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//@Component
public class WeatherServiceThreads extends Thread {

//    @Autowired
    RestTemplate template;
    String city;

    public WeatherServiceThreads(RestTemplate template, String city) {
        this.template = template;
        this.city = city;
    }

    @Override
    public void run() {
        String url = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=e735b6b632e6c008be941b8dbdb346d4";
        String forObject = template.getForObject(
                url,
                String.class
        );
        System.out.println(currentThread().getName()
                + forObject
        );
    }
}
