package io.codlibs.gatewayservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallBackResources {

    @GetMapping("/movies-fallback")
    public Mono<Void> fallback() {
        return Mono.empty();
    }
}
