package org.funnymovie.movies;

import org.funnymovie.movies.entity.Movie;
import org.funnymovie.movies.resource.MovieResource;
import org.funnymovie.movies.service.MovieService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MovieResourceTest {

    MovieResource movieResource;
    Movie movie;

    @BeforeAll
    void setup() {
        movie = new Movie();
        movieResource = new MovieResource();
        movieResource.movieService = Mockito.mock(MovieService.class);
    }
    @Test
    void findAllMovieTest() {
        movieResource.findAll();
        Mockito.verify(movieResource).findAll();
    }
}
