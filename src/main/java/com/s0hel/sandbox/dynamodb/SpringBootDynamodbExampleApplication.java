package com.s0hel.sandbox.dynamodb;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
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

//    @Bean
//    public AWSCredentials amazonAWSCredentials() {
//        return new BasicAWSCredentials(
//                "AKIAQOSUQAAULKNHLAYH",
//                "H1aiynCM0vDzR6Rzrm5XO3Mzg4BGb6SD3/Dp4PM+"
//        );
//    }

        @Bean
    public AmazonDynamoDB amazonDynamoDB() {
//        AWSCredentialsProvider credentials = new ProfileCredentialsProvider("Citi AWS");

        return AmazonDynamoDBClientBuilder
                .standard()
//                .withCredentials(credentials)
                .build();
    }
//    @Bean
//    public AmazonDynamoDB amazonDynamoDB() {
//        return new AmazonDynamoDBClient(amazonAWSCredentials());
//    }

}
