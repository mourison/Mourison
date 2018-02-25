package gr.mourison.wunderground;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
public class WundergroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(WundergroundApplication.class, args);
	}
}
