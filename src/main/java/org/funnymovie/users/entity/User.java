package org.funnymovie.users.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "Users.findByEmail", query = "SELECT u FROM User u where u.email = :email"),
        @NamedQuery(name = "Users.findByEmailAndPassword", query = "SELECT u FROM User u where u.email = :email and u.password = :password"),
        @NamedQuery(name = "Users.findById", query = "SELECT u FROM User u ORDER BY u.id") })
@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    public Long id;
    public String password;

    public String email;
}
