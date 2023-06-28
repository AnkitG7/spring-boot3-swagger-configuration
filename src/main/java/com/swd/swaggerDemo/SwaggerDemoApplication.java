package com.swd.swaggerDemo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Indexed;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Hello Swagger Ui Project", version = "1.0.0", description = "This project is only for learning swagger", termsOfService = "swd", contact = @Contact(name = "Mr Ankit", email = "ankitgond001@gmail.com"), license = @License(name = "licence", url = "swagger-ui"))

)
public class SwaggerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerDemoApplication.class, args);
    }

}
