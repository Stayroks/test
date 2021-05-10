package com.quest;

import com.quest.service.WeatherService;
import com.quest.service.WeatherServiceThreads;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class WeatherApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(WeatherApplication.class, args);

        WeatherService service = context.getBean(WeatherService.class);
        service.test();
    }

}
