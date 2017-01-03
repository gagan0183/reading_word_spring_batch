package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spring.word.ReadWord;

@SpringBootApplication
public class ReadWordSpringApplication {

	@Autowired
	private ReadWord readWord;

	public static void main(String[] args) {
		SpringApplication.run(ReadWordSpringApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo() {
		return new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				readWord.readWordFile();
			}
		};
	}
}
