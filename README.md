examples-maven
==============

Simple example of an Apache Maven project

Make:
--------------

    mvn package

Jars are created in the target folder.

    * Executable jar examples-maven-0.0.1-SNAPSHOT.jar
    * Sources examples-maven-0.0.1-SNAPSHOT-sources.jar
    * Test sources examples-maven-0.0.1-SNAPSHOT-test-sources.jar
    * Test classes examples-maven-0.0.1-SNAPSHOT-tests.jar
    

Run 
--------------

    java -jar examples-maven-0.0.1-SNAPSHOT.jar arg1 arg2 arg3

Create web site:
--------------

    mvn site:site 

Generated HTML files are in the target/site folder