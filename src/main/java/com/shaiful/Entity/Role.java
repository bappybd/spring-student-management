package com.shaiful.Entity;

import javax.persistence.*;
import java.util.Collection;

@Entity(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users;

}
