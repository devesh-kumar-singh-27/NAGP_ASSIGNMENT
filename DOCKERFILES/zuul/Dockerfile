FROM maven 
RUN git clone https://github.com/devesh-kumar-singh-27/NAGP_ASSIGNMENT.git
WORKDIR ./NAGP_ASSIGNMENT/zuul-service
RUN mvn clean package
WORKDIR ./target
CMD ["java", "-jar" , "zuul-service-0.0.1-SNAPSHOT.jar"]