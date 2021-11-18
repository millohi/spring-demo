
import org.springframework.beans.factory.annotation.Value;
...
@Value("${spring.application.name}")
String name;
...

Externalize SpringBoot properties
-Dspring.config.location = C:\application.properties


https://www.tutorialspoint.com/spring_boot/spring_boot_application_properties.htm

mvn clean verify spring-boot:run
