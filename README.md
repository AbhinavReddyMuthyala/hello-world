# Hello World DropWizard 
How to run in local : 
Goto HelloWorldService class and run the class, Once started hit below URL to check response for Hello World 
http://localhost:8080/greetings/hello 

#Docker:
#step1:
mvn clean install
#step 2 :
docker build -f Dockerfile -t hello-world
#step 3:
docker run -p 8080:8080 hello-world

Goto HelloWorldService class and run the class, Once started hit below URL to check response for Hello World 
http://localhost:8080/greetings/hello 
