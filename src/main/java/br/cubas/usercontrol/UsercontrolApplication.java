package br.cubas.usercontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication//(exclude= {SecurityAutoConfiguration.class })
public class UsercontrolApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsercontrolApplication.class, args);
	}

}
