# MyApplication

Technologies, frameworks, templates etc. used
- Java 8
- Spring Boot
- Gradle 5.3.1
- Ajax
- Thymeleaf
- RestTempllate

Installation and Deployment
- Download the repository
- Run the "my-application-0.1.0.jar" in the cmd by typing
    java -jar '@jarFileLocation'/my-application-0.1.0.jar
- Or just click the "my-application-0.1.0.jar"
- Then go to your browser and type
    "localhost:8080/home" to start

Summary
- Created java objects that will serve as placeholder for the data coming from a remote server (http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json)
- Consumed the JSON API coming from the link above by having the link as an input parameter in resttemplate's getObject method and puts the data in the Profile java object.
- Data recieved are then outputted in the home and profile view page.
- When a row is clicked in home page, it redirects to the profile view page together with the id of the profile clicked and the model passed.
- Front ends are updated (live seaching using ajax, and other designs and functionalities)