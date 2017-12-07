// [Bean = Entity Class] includes only attributes, Getters, and Setters (not other methods) <-> POJO (plain-old-java-object: includes attributes, getters, setters and OTHER methods)

package com.stockscore.stockscore_new.data.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by heesukjang on 11/27/17.
 */
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Favorite> favorites;

    // default constructor will be generated

    // getters and setters: Code -> Generate... -> getters and setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
            this.password = password;
        }
    public Set<Favorite> getFavorites() { return favorites; }
    public void setFavorites(Set<Favorite> favorites) { this.favorites = favorites; }
}

/* create table User (
	    id INT NOT NULL auto_increment,
	    first_name VARCHAR(20) default NULL,
	    last_name  VARCHAR(20) default NULL,
	    email  VARCHAR(20) default NULL,
	    password  VARCHAR(20) default NULL,
	    PRIMARY KEY (id)
); */

