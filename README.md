# SpringBoot2Angular5
Spring Boot 2.0 (Data-JPA,Hibernate,H2,REST,Lombok) Angular 5 CRUD example


# Prerequisites
Ensure you have this installed before proceeding further

Java 8
Maven 3.3.9+ 
Node 6.0 or above,
npm 5 or above,
Angular-cli 1.6.6 or above

Build Frontend 
Code for frontend is allready compiled and saved under the webapp/dist when building the backend app (using maven) it will pickup the code from webapp/dist. However if you modified the frontend code and want your changes to get reflected then you must build the frontend

# Navigate to PROJECT_FOLDER/webapp (should contain package.json )
npm install
# build the project (this will put the files under dist folder)
ng build --prod --aot=true
Build Backend (SpringBoot Java)
# Maven Build : Navigate to the root folder where pom.xml is present 
mvn clean install
