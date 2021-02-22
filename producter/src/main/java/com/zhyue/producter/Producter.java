package com.zhyue.producter;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * TODO
 *
 * @author zhyue
 * @version 1.0
 * @date 2021/2/22 14:10
 */
@Component
public class Producter {
    @Autowired
    private KafkaTemplate kafkaTemplate;

    public void send(String name) {
        User u = new User();
        u.setName(name);
        u.setAge(11);

        kafkaTemplate.send("user", JSON.toJSONString(u));
    }
}