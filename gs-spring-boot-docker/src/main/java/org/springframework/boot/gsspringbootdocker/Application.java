package org.springframework.boot.gsspringbootdocker;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
	
//	@RequestMapping("/error")
//	public String defaultError() {
//		return "Error from our side";
//	}
	
}
