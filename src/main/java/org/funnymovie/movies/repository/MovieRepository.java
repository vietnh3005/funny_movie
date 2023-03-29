package org.funnymovie.movies.repository;
import org.funnymovie.movies.entity.Movie;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@ApplicationScoped
public class MovieRepository {
    @PersistenceContext
    public EntityManager entityManager;

    public List<Movie> findAllMovies() {
        return entityManager.createNamedQuery("Movies.findAllMovies", Movie.class)
                .getResultList();
    }
}
