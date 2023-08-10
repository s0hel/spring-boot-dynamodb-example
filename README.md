# Spring Boot DynamoDB Example

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

### Build Configuration:
- Runtime: `Coretta 11`
- Port: `8080`
- Build command: `mvn clean package -DskipTests`
- Start command: `java -jar target/spring-boot-dynamodb-example-0.0.1-SNAPSHOT.jar`

### Service Configuration:
- Health Check Protocol: `HTTP`
- Health Check Path: `/actuator/health`