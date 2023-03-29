package org.funnymovie.movies.resource;

import org.funnymovie.movies.service.MovieService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@ApplicationScoped
@Path("/movies")
@Produces("application/json")
@Consumes("application/json")
public class MovieResource {
    @Inject
    public MovieService movieService;

    @GET
    public Response findAll() {
        return Response.status(200).entity(movieService.findAllMovie()).build();
    }
}
