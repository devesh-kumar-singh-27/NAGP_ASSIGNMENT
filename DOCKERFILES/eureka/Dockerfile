FROM maven 
RUN git clone https://github.com/devesh-kumar-singh-27/NAGP_ASSIGNMENT.git
WORKDIR ./NAGP_ASSIGNMENT/eureka-service
RUN mvn clean package
WORKDIR ./target
CMD ["java", "-jar" , "eureka-service-0.0.1-SNAPSHOT.jar"]