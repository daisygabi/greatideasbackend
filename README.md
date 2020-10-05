# GreatIdeas Backend
Backend part for the 'greatIdeas' project

In order to use the project with the client side as well, please import this project in your IDE, start the project on :8080 port.

## Technologies used
Java 11, SpringBoot, Flyway for database migrations, Postgresql for database, Maven, Mockito

## Database
I have chosen to use postgresql because it's free (nr one reason) and it performs very well in larger applications as well

## Special considerations and security
This project is a demo project, it does not have any security implemented. This would be implemented using JWT and filtering what endpoints are available for public access.
All secret keys, and other important keys should be kept in .env files and never exposed. That means either use IDE features, or other options like environmental variables if you are on Windows. All the values from (example) application-dev.properties are important values so they shouldn't be exposed.
