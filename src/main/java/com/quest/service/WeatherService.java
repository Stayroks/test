package com.quest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherService {

    @Autowired
    RestTemplate template;

    public void test() {
//        String forObject = template.getForObject(
//                "http://api.openweathermap.org/data/2.5/weather?q=London&appid=e735b6b632e6c008be941b8dbdb346d4",
//                String.class
//        );
//        System.out.println(forObject);
        List<String> cits = new ArrayList<>();

        cits.add("London");
        cits.add("Tel Aviv");
        cits.add("Kyiv");

        for (String city : cits) {

            Thread threads = new WeatherServiceThreads(template, city);
            threads.start();
        }




    }

}
