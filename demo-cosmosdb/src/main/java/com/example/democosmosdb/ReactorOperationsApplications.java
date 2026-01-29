package com.example.democosmosdb;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.security.SecureRandom;

@Slf4j
@RequiredArgsConstructor
@SpringBootApplication
public class ReactorOperationsApplications implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ReactorOperationsApplications.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Mono<String> borrarTodo = Mono.just("hola");

        Flux<String> nuevosDatos = Flux.just("Dato1", "Dato2");

        borrarTodo
                .flatMapMany(s -> { //usas flatMapMany para convertir Mono a Flux
                    System.out.println(s);
                    return nuevosDatos;
                });
                //subscribe(dato -> System.out.println("Insertando: " + dato));

        // Ejemplo de uso de thenMany

        Flux<String> datosExistentes = Flux.just("Dato3", "Dato4");
        Mono<String> restaurarDatos = Mono.just("Restaurando datos...");
        restaurarDatos
                .thenMany(datosExistentes); // thenMany se usa para ignorar el resultado de restaurarDatos obviando lo que emite y continuar con datosExistentes
                //subscribe(System.out::println);

        // Ejemplo de uso de delayUntil

        Mono<String> tareaLarga = Mono.just("Tarea larga en ejecución...");
        Flux<String> datos = Flux.just("Dato5", "Dato6");

        datos
                .delayUntil(s -> tareaLarga)
                .flatMap(s -> Mono.just(s)); // este aplana los monos a un Flux que es el Flux original de datos
                //.subscribe(System.out::println);

        datos
                .delayUntil(s -> tareaLarga)
                .flatMap(s -> Flux.just(s)); // este aplana los flux a un solo  Flux que es el Flux original de datos
                //.subscribe(System.out::println);

        tareaLarga
                .delayUntil(s-> datos)
                .flatMapMany(s -> Flux.just(s)); //es un Mono<Flux<String>> que se aplana a un Flux<String>
                //.subscribe(System.out::println);

        //use del .filterWhen para validar datos
        Flux<String> datosConValidacion = Flux.just("Dato7", "Dato8", "Dato9", "");
        datosConValidacion
                .filter(s -> !s.isEmpty() && s != null);
                        //.subscribe(System.out::println); //imprime los mismo que abajo que son cada elemento de flux porque todos cumplen

        datosConValidacion
                .filterWhen(this::valdateData);
                //.subscribe(System.out::println); //imprime los mismo que arriba que son cada elemento de flux porque todos cumplen

        // uso del .all

        Flux<String> datosParaValidar = Flux.just("Dato10", "", "Dato12");

        datosParaValidar
                .all(s -> s != null && !s.isEmpty()); // verifica si todos los datos cumplen la condición, devuelve un Mono<Boolean>
                //.subscribe(System.out::println); //imprime true o false



    }

    public Mono<Boolean> valdateData(String data) {
        return Mono.just(data != null && !data.isEmpty());
    }
}
