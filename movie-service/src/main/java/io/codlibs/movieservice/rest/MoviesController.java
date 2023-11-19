package io.codlibs.movieservice.rest;

import io.codlibs.movieservice.dto.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;

@RestController
public class MoviesController {
    Map<String, Movie> movies = Map.of(
            "1", new Movie("Inception", "Sci-Fi", "2010"),
            "2", new Movie("The Shawshank Redemption", "Drama", "1994"),
            "3", new Movie("The Dark Knight", "Action", "2008")
    );

    @GetMapping("/movies")
    public Mono<List<Movie>> movies() {
        return Mono.just(movies.values().stream().toList());
    }
}
