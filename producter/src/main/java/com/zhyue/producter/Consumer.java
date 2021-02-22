package com.zhyue.producter;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * TODO
 *
 * @author zhyue
 * @version 1.0
 * @date 2021/2/22 14:22
 */
@Component
public class Consumer {
    @KafkaListener(topics = "user")
    public void consumer(ConsumerRecord consumerRecord) {
        Optional<Object> kafkaMassage = Optional.ofNullable(consumerRecord.value());
        if (kafkaMassage.isPresent()) {
            Object o = kafkaMassage.get();
            System.out.println(o);
        }

    }
}
