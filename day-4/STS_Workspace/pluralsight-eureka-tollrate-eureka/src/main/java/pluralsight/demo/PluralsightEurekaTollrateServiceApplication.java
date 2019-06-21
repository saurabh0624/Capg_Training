package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaServer
public class PluralsightEurekaTollrateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightEurekaTollrateServiceApplication.class, args);
	}
}
