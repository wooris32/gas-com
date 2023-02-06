package com.gascom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class GasComApplication {

    public static void main(String[] args) {
        SpringApplication.run(GasComApplication.class, args);
    }

}
