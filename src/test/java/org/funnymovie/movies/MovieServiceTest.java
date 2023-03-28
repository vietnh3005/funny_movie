package org.funnymovie.movies;

import org.funnymovie.movies.entity.Movie;
import org.funnymovie.movies.repository.MovieRepository;
import org.funnymovie.movies.service.MovieService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MovieServiceTest {
    MovieService movieService;
    Movie movie;

    @BeforeAll
    void setup() {
        movie = new Movie();
        movieService = new MovieService();
        movieService.movieRepository = Mockito.mock(MovieRepository.class);
    }

    @Test
    void findAllMovieTest() {
        movieService.findAllMovie();
        Mockito.verify(movieService).findAllMovie();
    }
}
