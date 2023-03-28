package org.funnymovie.movies.repository;

import org.funnymovie.movies.entity.Movie;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

public class MovieRepository {
    @Inject
    public EntityManager entityManager;

    public List<Movie> findAllMovies() {
        return entityManager.createNamedQuery("Movies.findAllMovies", Movie.class)
                .getResultList();
    }
}
