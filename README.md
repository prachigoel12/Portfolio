# portfolio
 A personal portfolio website built with Spring Boot, Thymeleaf, HTML/CSS, and Java, showcasing my skills, projects, and experience.
 It includes a working contact form to collect visitor messages securely, saving submissions into a database via JPA.

# Features-
1. Home, About, Skills, Projects, and Contact pages
2. Contact form with form validation and database storage
3. Responsive design using clean HTML and CSS
4. Backened powered by Spring Boot and Thymeleaf
5. Organized code structure following MVC architecture

# Tech Stack
-> Java, Spring Boot
-> Thymeleaf
-> HTML5, CSS3
-> MySQL/ H2 Database(during development)
-> Maven(Build Tool)

# Project Structure
com.example.portfolio
│
├── controller
├── model
├── repository
├── service
└── resources
    ├── templates
    └── static

# Installation and Run Locally
1. Clone the repository:
   git clone https://github.com/prachigoel12/Portfolio.git
   cd Portfolio
2. Open the project:
   Use an IDE like IntelliJ IDEA or Eclipse that supports Maven and Spring Boot.
3. Set up the database
   -> Create a database(e.g, in MySQL) namd- portfoliodb
   -> Update src/main/resources/application.properties with your database credentials:
         spring.datasource.url=jdbc:mysql://localhost:3306/portfoliodb
         spring.datasource.username=root
         spring.datasource.password=
         spring.jpa.hibernate.ddl-auto=update
 4. Build and run the Application:
    -> If using command line:
          ./mvnw spring-boot:run
    ->   Or simply click the Run button in your IDE on the MainApplication class.
5. Access the website:
    http://localhost:8897
 

 
