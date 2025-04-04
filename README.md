# springbootwebserver
Spring Boot with 3 Web Server

Spring Boot- 
Spring Boot is a powerful, open-source framework built on top of the Spring Framework.

Top 5 Features of Spring Boot-
1. Inbuilt Tomcat Server
2. No XML Configuration
3. Devtools Dependency (Live Reload)
4. Production-Ready in Minutes
5. Faster Development

Spring Boot Supports 3 Embedded Web Servers-
1. Tomcat (Default)
2. Jetty
3. Undertow

We need to exclude Tomcat dependency

<exclusions>
    <exclusion>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-tomcat</artifactId>
    </exclusion>
</exclusions>
  
and add Jetty dependency in pom.xml file

<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-jetty</artifactId>
</dependency>


-----------------------------------------------------------
<dependency>
  <groupId>org.springframework.boot</groupId>        <artifactId>spring-boot-starter-undertow</artifactId>
</dependency>

