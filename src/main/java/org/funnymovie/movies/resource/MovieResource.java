package org.funnymovie.movies.resource;


import org.funnymovie.movies.entity.Movie;
import org.funnymovie.movies.service.MovieService;
import org.funnymovie.users.entity.User;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.List;

@ApplicationScoped
@Path("/movies")
public class MovieResource {
    @Inject
    private MovieService movieService;

    @POST
    public List<Movie> findAll() {
        return movieService.findAllMovie();
    }
}
