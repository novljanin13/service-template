package io.mihajlo.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mihajlo on 11/19/16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BankDemoApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(BankDemoApp.class, args);
    }

}
