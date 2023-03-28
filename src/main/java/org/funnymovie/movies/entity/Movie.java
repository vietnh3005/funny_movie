package org.funnymovie.movies.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "Movies.findAllMovies", query = "SELECT m FROM Movie m ORDER BY m.id = :id") })
@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue
    public Long id;
    public String title;

    public String description;
    public String link;

}
