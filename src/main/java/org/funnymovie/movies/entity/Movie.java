package org.funnymovie.movies.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue
    public Long id;
    public String title;

    public String description;

    public String email;
}
