package com.zhyue.producter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ProducterApplication {

    @Autowired
    private Producter product;

    @PostConstruct
    public void init() {
        for (int i = 0; i < 10; i++) {
            product.send("bbbb" + i);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(ProducterApplication.class, args);
    }

}
