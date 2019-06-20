package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class PluralsightEurekaTollrateBillboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightEurekaTollrateBillboardApplication.class, args);
	}
}
