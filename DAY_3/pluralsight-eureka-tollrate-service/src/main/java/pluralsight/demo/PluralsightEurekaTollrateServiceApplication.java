package pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaClient
public class PluralsightEurekaTollrateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightEurekaTollrateServiceApplication.class, args);
	}
}
