package io.github.jotacarvalh0.mscustomers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MscustomersApplication {

	public static void main(String[] args) {
		SpringApplication.run(MscustomersApplication.class, args);
	}

}
