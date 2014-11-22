examples-maven
==============

Simple example of an  [Apache Maven](http://maven.apache.org/ "Apache Maven") project.

Make:
--------------

    mvn package

Jars are created in the target folder.

* Executable jar 
        target/examples-maven-0.0.1-SNAPSHOT.jar
* Sources 
        target/examples-maven-0.0.1-SNAPSHOT-sources.jar
* Test sources 
        target/examples-maven-0.0.1-SNAPSHOT-test-sources.jar
* Test classes 
        target/examples-maven-0.0.1-SNAPSHOT-tests.jar
    

Run 
--------------

    java -jar target/examples-maven-0.0.1-SNAPSHOT.jar -f file_name

Create web site:
--------------

    mvn site:site 

Generated HTML files are in the target/site folder
