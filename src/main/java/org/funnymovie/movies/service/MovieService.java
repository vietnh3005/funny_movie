package org.funnymovie.movies.service;

import org.funnymovie.movies.entity.Movie;
import org.funnymovie.movies.repository.MovieRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class MovieService {
    @Inject
    public MovieRepository movieRepository;

    public List<Movie> findAllMovie() {
        return movieRepository.findAllMovies();
    }
}
