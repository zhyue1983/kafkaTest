package com.zhyue.producter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
/**
 * TODO
 * 核心参考文献  https://blog.csdn.net/u012129558/article/details/80065869
 * https://www.cnblogs.com/tysl/p/11170811.html
 * 主要是zk启动 kafka启动
 * @author zhyue
 * @version 1.0
 * @date 2021/2/22 14:10
 */
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
