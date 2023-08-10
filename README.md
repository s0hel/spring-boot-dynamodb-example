# Spring Boot DynamoDB Example

Example Spring Boot REST API that uses `spring-data-dynamodb` library.  

Spring Data DynamoDB is a library that provides easy access to Amazon DynamoDB from Spring applications. It provides a familiar and consistent programming model for data access, while still retaining the special traits of the underlying data store.
Some of the benefits of using Spring Data DynamoDB include:
- Easy integration with Spring applications
- Support for CRUD operations
- Support for projections
- Support for custom repository code
- REST support via spring-data-rest

## JDK Version
Use JDK 11 / Coretto 11<BR/>
17+ is not supported by AWS App Runner

## AWS Credentials setup
Set up your AWS credentials in `~/.aws/credentials`

Set your `aws_access_key_id`, `aws_secret_access_key`, and `region`

```
[default]
aws_access_key_id = xxxxx
aws_secret_access_key = xxxxx
region = us-east-1
```
If you don't know it, create a new access key from the Console: 
`IAM > Users > temp-aws-lab-user-xxxx > Security Credentials > Create Access Key`  

## DynanoDB setup
Create a table in DynamoDB called `MusicVideo` with a primary key of `videoId`

## Running
Run the application with `mvn spring-boot:run`

## Testing

Navigate to Swagger URL: http://localhost:8080/swagger-ui.html

## AWS App Runner setup
When setting AWS App Runner, Specify

### Create IAM Instance Role
- Follow these <a href="https://catalog.us-east-1.prod.workshops.aws/event/dashboard/en-US/workshop/module1/create-iam-instance-role">instructions</a> 
- Be sure to add the following permission: `AmazonDynamoDBFullAccess`
- Name it `AppRunner_InstanceRole`

### Build Configuration:
- Runtime: `Coretta 11`
- Port: `8080`
- Build command: `mvn clean package -DskipTests`
- Start command: `java -jar target/spring-boot-dynamodb-example-0.0.1-SNAPSHOT.jar`

### Security Configuration
- Instance Role: `AppRunner_InstanceRole`

### Service Configuration:
- Health Check Protocol: `HTTP`
- Health Check Path: `/actuator/health`
