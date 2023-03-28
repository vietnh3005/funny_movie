package org.funnymovie.users.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name = "Users.findByEmail", query = "SELECT c FROM User c where c.email = :email"),
        @NamedQuery(name = "Users.findByEmailAndPassword", query = "SELECT c FROM User c where u.email = :email and  c.password = :password"),
        @NamedQuery(name = "Users.findById", query = "SELECT c FROM User c ORDER BY c.id = :id") })
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
