# Spring Boot DynamoDB Example

Set up your AWS credentials in `~/.aws/credentials`

Set your ACCESS KEY, Secret Key, and Region

```
[default]
aws_access_key_id = xxxxx
aws_secret_access_key = xxxxx
region = us-east-1
```

Create a table in DynamoDB called `MusicVideo` with a primary key of `videoId`

Run the application with `mvn spring-boot:run`

When setting AWS App Runner, Specify

Build Configuration:
- Runtime: `Coretta 11`
- Port: `8080`
- Build command: `mvn clean package -DskipTests`
- Start command: `java -jar target/spring-boot-dynamodb-example-0.0.1-SNAPSHOT.jar`

Service Configuration:
- Health Check Protocol: `HTTP`
- Health Check Path: `/actuator/health`

