# Maven Build Tool

# why do we need Maven

* To start a web App, one might need 50+ jar files, without maven , Developers had to manually search and download each JAR file from different websites.
* ex- spring-web.jar, mysql-connector.jar.

# Maven automates

* we simply tell dependencies in one file called ```pom.xml```
* POM = Project Object Model

    ## Every libray has a unique address (like a home address)
    * GroupId  - company/Organization (like a city)
    * ArtifactID - Project name (like a street)
    * version - specific version (like a house number)
  
* Maven central Repo

# Teamwork Advantage

* when shared the code with someone, they run ```mvn install ```


# Maven Project Structure

```text
maven-app/
|---pom.xml
|---src/
|    |---main/
|    |    |---java/                 --> all your java code goes here
|    |    |---resoruces/            --> config files, properties
|    |---test/
|        |---java/                  --> your test code
|        |---resources/             --> Test configuration
|--- target                        --> compiled code (Maven create this)
```

* .mvn --> all cache files


# common Maven commands

* Maven is not only Dependency Manger. It can also
  
  * compile code
  * Run Tests
  * Package jar/war
  * Deploy artifacts
  * clean old builds
  
    1. ```mvn clean``` - deletes target folder. (Removes old compiled code)
    2. ```mvn validate```  - checks if your project is correctly configured.
    3. ```mvn compile```  - compiles our java source code.
       1. This reads src/main/java and generates .class files into target/
    4. ```mvn test```  -  Runs all unit tests.
       1.  looks inside src/test/java . only after successful test can we say the app is stable.
    5. ```mvn package``` -  packages the project into jar(java archives) or war (wen archives).
    6. ```mvn verify``` -  Ensure build is ready for final installation or deployment. 
    7. ```mvn install``` -  It compiles and then install final .jar into local Maven repo.
    8. ```mvn deploy``` -  uploads your project JAR/WAR file to remote Maven repo.
    9. ```mvn site``` -  use to generate a project doc website for a Maven project automatically. 

* mvn clean install