package kr.brandnew.gguream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class GgureamApplication {

    public static void main(String[] args) {
        SpringApplication.run(GgureamApplication.class, args);
    }

}
