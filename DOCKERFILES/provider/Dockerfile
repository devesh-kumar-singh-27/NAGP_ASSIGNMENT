FROM maven 
RUN git clone https://github.com/devesh-kumar-singh-27/NAGP_ASSIGNMENT.git
WORKDIR ./NAGP_ASSIGNMENT/service-provider
RUN mvn clean package
WORKDIR ./target
CMD ["java", "-jar" , "service-provider-0.0.1-SNAPSHOT.jar"]