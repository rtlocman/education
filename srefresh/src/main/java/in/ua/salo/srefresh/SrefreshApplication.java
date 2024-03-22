package in.ua.salo.srefresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "in.ua.salo.controllers")
@SpringBootApplication
public class SrefreshApplication {

	public static void main(String[] args) {
		SpringApplication.run(SrefreshApplication.class, args);
	}

}
