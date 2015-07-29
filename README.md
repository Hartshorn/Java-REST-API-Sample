Java-Spring-Sample

Author: Michael Palmer

This is a REST API that utilizes Spring Data JPA with Spring Boot, built with Gradle, and backed by an in-memory
H2 database.  It provides a service for accessing "People" and "Families" in JSON (HAL) format from any REST client.  
The simplest way to see the functionality is with curl.

This example follows very closely with the Spring Guide

  http://spring.io/guides/gs/accessing-data-rest/

Using these tools together is a powerful way to remove many of the burdens that programmers face, and while there
are always alternative ways to do things, Spring has developed such a clean, useable framework, it would be a shame
not to use it to it's full extent.

To start the embedded tomcat server, run:

    gradle bootRun
    
the current build.gradle is set for Java 1.7, adjust the source- and targetCompatibility to 1.8 as needed.

There is an added task in the build.gradle as well to adjust the default (8080) port, which can likewise be adjusted.
To start the server on 8081, run:

    gradle 8081 bootRun
    
or adjust the port number and run accordingly.

Once the server is running, assuming it is on port 8080, the service can be reached with curl by:

    curl http://localhost:8080
    
from there, one can descend into /people or /family

The service supports POST PUT PATCH and DELETE REST calls - which can be demonstrated by:
      
      curl -i -X POST -H "Content-Type:application/json" -d '{  "firstName" : "Really-Cool",  "lastName" : "Person" }' http://localhost:8080/people
      
or to PATCH an existing record (assuming the generated id was 1):

      curl -i -X PATCH -H "Content-Type:application/json" -d '{ "lastName" : "Cool-Dude" }' http://localhost:8080/people/1
