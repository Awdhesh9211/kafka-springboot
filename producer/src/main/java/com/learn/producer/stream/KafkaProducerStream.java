package com.learn.producer.stream;

import com.learn.producer.message.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStream {



    @Bean
    public Supplier<RiderLocation>  sendRiderLocation(){
        return ()->{
            RiderLocation location=new RiderLocation(
                    "rider123",
                    12.343,
                    45.24
            );

            System.out.println("Sending: "+ location.getRiderId());
            return  location;
        };
    }
}
