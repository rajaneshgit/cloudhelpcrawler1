# CloudhelpCrawler1

A simple Spring Boot microservice for web crawling operations.

## Features

- RESTful API endpoints
- Health check endpoints
- Configurable via YAML
- Built with Spring Boot 3.2.0
- Java 17 compatible

## API Endpoints

### Health Check
```
GET /cloudhelp-crawler1/api/v1/crawler/health
```

### Service Information
```
GET /cloudhelp-crawler1/api/v1/crawler/info
```

### Crawl URL
```
POST /cloudhelp-crawler1/api/v1/crawler/crawl
Content-Type: application/json

{
  "url": "https://example.com"
}
```

## Running the Application

### Prerequisites
- Java 17 or higher
- Maven 3.6 or higher

### Build and Run
```bash
# Build the application
mvn clean package

# Run the application
mvn spring-boot:run

# Or run the JAR file
java -jar target/cloudhelp-crawler1-1.0.0.jar
```

### Configuration
The application can be configured via `application.yml`. Key configurations:
- Server port (default: 8080)
- Context path: `/cloudhelp-crawler1`
- Logging levels
- Crawler-specific settings

## Development

### Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/cloudhelp/crawler/
│   │       ├── CloudhelpCrawler1Application.java
│   │       ├── controller/
│   │       │   └── CrawlerController.java
│   │       └── service/
│   │           └── CrawlerService.java
│   └── resources/
│       └── application.yml
└── test/
    └── java/
        └── com/cloudhelp/crawler/
            └── CloudhelpCrawler1ApplicationTests.java
```

### Testing
```bash
mvn test
```

## Actuator Endpoints
- Health: `/cloudhelp-crawler1/actuator/health`
- Info: `/cloudhelp-crawler1/actuator/info`
- Metrics: `/cloudhelp-crawler1/actuator/metrics` 