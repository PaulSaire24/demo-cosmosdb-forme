package com.example.democosmosdb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class RectorOperationFlux  implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(RectorOperationFlux.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<String> orden1 = List.of("pan", "camote");
        List<String> orden2 = List.of("zanahoria", "brocoli");

        Flux<List<String>> ordenFlux = Flux.just(orden1, orden2);

        // aplicacion de flatMapIterable que aplana las listas a un solo flux,
        // ojo este necesita que le devuelvas una lista (o algo que extienda de Iterable) que no sea un publisher
        Flux<String> finalOrder = ordenFlux.flatMapIterable(ord -> ord);
        //finalOrder.subscribe(System.out::println);

        // aplicacion de flatMapSequential es o mismo que hace el flatMap solo que devuelve los publisher en el orden que llegan
        //ojo es de igual de asincrono que el flatMap solo que mantiene el orden
        // el faltMap por el contrario devuelve lo primero que le llegue
        // ojo al igual que el flatMap necesita que le devuelvas un publisher
        finalOrder.flatMapSequential(s -> Flux.just(s.length()));
                //.subscribe(System.out::println);

        //fromIterable necesita como argumento una lista o algo que extienda de Iterable para transformalo a un flux
        // donde cada elemento del Flux en cada elemento de la lista que recibio.

        List<String> names = List.of("Paul", "Jorge", "Hubert");

        Flux<String> fluxName = Flux.fromIterable(names);

        fluxName
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("P"))
                .subscribe(System.out::println);

    }

}