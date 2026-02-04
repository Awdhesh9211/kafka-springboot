package com.learn.consumer.listener;


import com.learn.consumer.message.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {



    @KafkaListener(topics = "my-topic" ,groupId="my-new-group")
    public void listen(RiderLocation location){
        System.out.println("Receieved : "+location.getRiderId());
    }
}
