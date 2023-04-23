package com.learnreactiveprogramming.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxAndMonoGeneratorService {

    public Flux<String> namesFlux() {
        // DBなどからの返却を想定
        return Flux.fromIterable(List.of("alex","ben","chloe")).log();
    }

    public Mono<String> nameMono(){
        return Mono.just("Alex").log();
    }

    public static void main(String[] args) {

        FluxAndMonoGeneratorService fluxAndMonoGeneratorService = new FluxAndMonoGeneratorService();

        fluxAndMonoGeneratorService.namesFlux().subscribe(name -> {
            System.out.println("Name is : " + name);
        });


        fluxAndMonoGeneratorService.nameMono().subscribe(name -> {
            System.out.println("Name is : " + name);
        });

    }
}
