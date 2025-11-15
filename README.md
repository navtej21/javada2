# Advanced Java DA-3

## Assignment Overview
This project is an Advanced Java application that demonstrates various Java EE technologies and best practices. It includes a web-based interface built with JavaServer Faces (JSF) and follows the Model-View-Controller (MVC) architecture pattern.

## Technologies Used
- Java 17
- JavaServer Faces (JSF) 2.3
- Maven for dependency management
- Apache Tomcat 10.1.48
- XHTML for view templates
- CSS/JavaScript for frontend

## Project Structure
```
src/
├── main/
│   ├── java/           # Java source files
│   │   ├── beans/      # Managed beans
│   │   ├── model/      # Data models
│   │   ├── service/    # Business logic
│   │   └── util/       # Utility classes
│   └── webapp/         # Web application resources
│       ├── resources/  # CSS, JS, images
│       └── WEB-INF/    # Configuration files
└── test/              # Test files
    └── java/          # Test source files
```

## Building the Project
1. Clone the repository
2. Navigate to the project root directory
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Deploy the generated WAR file to your Tomcat server

## Running the Application
1. Start your Tomcat server
2. Deploy the application
3. Access the application at: `http://localhost:8080/StudentAdmissionPortal/welcome.xhtml`

## Configuration
- Application configuration can be found in `src/main/webapp/WEB-INF/web.xml`
- Facelets configuration is in `src/main/webapp/WEB-INF/faces-config.xml`

## Author
Shyam Venkatraman, 22MIS1031

## Last Updated
November 9, 2025
