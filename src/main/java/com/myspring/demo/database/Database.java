package com.myspring.demo.database;

import com.myspring.demo.model.ProductModel;
import com.myspring.demo.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
docker run -d --rm --name mysql-spring-demo -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_USER=duynm1997 -e MYSQL_PASSWORD=123456 -e MYSQL_DATABASE=test_db -p 3309:3306 mysql:latest
mysql -h localhost -P 3309 --protocol=tcp -u duynm1997 -p 123456
*/
@Configuration
public class Database {
    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository){
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
            }
        };
    }
}
