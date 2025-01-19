package com.forohub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {
		"com.forohub.dominio.topico",
		"com.forohub.dominio.usuario"})
public class AluraChallengeForoHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(AluraChallengeForoHubApplication.class, args);
	}

}
