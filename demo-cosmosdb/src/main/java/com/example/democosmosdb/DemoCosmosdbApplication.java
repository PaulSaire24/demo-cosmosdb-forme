package com.example.democosmosdb;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class DemoCosmosdbApplication implements CommandLineRunner {

	private final PolicyDocumentRepository policyDocumentRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoCosmosdbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		PolicyDocument policyDocument1 = new PolicyDocument("John", "Doe", "123 N 4567th St");
		policyDocument1.setAge(42);
		PolicyDocument policyDocument2 = new PolicyDocument("Charlie", "Bravo", "1313 Mockingbird Lane");

		policyDocumentRepository.deleteAll()
			.thenMany(Flux.just(policyDocument1, policyDocument2))
			.flatMap(policyDocumentRepository::save)
			.thenMany(policyDocumentRepository.findAll())
			.subscribe(user -> log.info(user.toString()));

	}

}
