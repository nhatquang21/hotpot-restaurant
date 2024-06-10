package demo.springboot.hotpot;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class NexpandoApplication {

	public static void main(String[] args) {
		SpringApplication.run(NexpandoApplication.class, args);
	}

}
