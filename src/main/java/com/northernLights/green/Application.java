package com.northernLights.green;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableSwagger2
@CrossOrigin
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
