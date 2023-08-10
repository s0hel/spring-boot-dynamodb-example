package com.s0hel.sandbox.dynamodb;

 import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDynamoDBRepositories(basePackages = "com.s0hel.sandbox.dynamodb.repository")
public class SpringBootDynamodbExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDynamodbExampleApplication.class, args);
    }

        @Bean
    public AmazonDynamoDB amazonDynamoDB() {
        return AmazonDynamoDBClientBuilder
                .standard()
                .build();
    }

}
