package com.learnreactiveprogramming.service;

import org.junit.jupiter.api.Test;
import reactor.test.StepVerifier;


public class FluxAndMonoGeneratorServiceTest {

    FluxAndMonoGeneratorService fluxAndMonoGeneratorService =
            new FluxAndMonoGeneratorService();

    @Test
    void namesFlux() {

        var namesFlux = fluxAndMonoGeneratorService.namesFlux();

        //create()はpublisherへのリクエストも行っている。
        StepVerifier.create(namesFlux)
                //.expectNext("alex","ben","chloe")
                .expectNextCount(3)
        .verifyComplete();

    }

}