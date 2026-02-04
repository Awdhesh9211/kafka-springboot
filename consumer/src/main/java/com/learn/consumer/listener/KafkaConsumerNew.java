package com.learn.consumer.listener;


import com.learn.consumer.message.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;


@Configuration
public class KafkaConsumerNew {



    @Bean
    public Consumer<RiderLocation>  processRiderLocation(){
        return location -> System.out.println(
                "Recieved : "+ location.getRiderId() +
                        "@ "+location.getLatitude() + ", "
                +location.getLongitude()
        );
    }
}
