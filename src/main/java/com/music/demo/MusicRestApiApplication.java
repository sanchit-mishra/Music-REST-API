package com.music.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages ="com.music.demo.repository")
@SpringBootApplication
public class MusicRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MusicRestApiApplication.class, args);
	}

}
