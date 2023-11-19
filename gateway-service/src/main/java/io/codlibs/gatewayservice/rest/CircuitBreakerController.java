package io.codlibs.gatewayservice.rest;

import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CircuitBreakerController {

    private final CircuitBreakerRegistry circuitBreakerRegistry;

    public CircuitBreakerController(CircuitBreakerRegistry circuitBreakerRegistry) {
        this.circuitBreakerRegistry = circuitBreakerRegistry;
    }

    @GetMapping("/circuitbreaker/status")
    public String getCircuitBreakerStatus() {
        return circuitBreakerRegistry.circuitBreaker("movieService").getState().toString();
    }
}