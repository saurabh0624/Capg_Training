package pluralsight.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableTask
public class PluralsightEurekaTollrateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PluralsightEurekaTollrateServiceApplication.class, args);
	}
	
	public TollProcessingTask tollprocessingTask() {
		return new TollProcessingTask();
	}
	
	public class TollProcessingTask implements CommandLineRunner {
		
	}
	
}
