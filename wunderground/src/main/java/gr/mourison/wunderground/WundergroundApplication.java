package gr.mourison.wunderground;

import gr.mourison.wunderground.services.ApiServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class WundergroundApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(WundergroundApplication.class, args);
		ctx.getBean(ApiServiceImpl.class).getResponse("20171029");

	}
}
