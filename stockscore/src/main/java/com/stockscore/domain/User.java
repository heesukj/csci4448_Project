/*Entity class: = Bean = data container = represents data in a row
* three: Controller, Service and Dao know about Domain
* Controller talks to Service and Service talks to Dao */

package com.stockscore.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// each row = an instance of User
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String email;

	//do not return the password with the user
//	@JsonIgnore
	private String password;
	
	// default constructor will be generated
	
	// Source -> Generate Getters and Setters
	
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
	
}

/*create table User ( 
	    id INT NOT NULL auto_increment,
	    first_name VARCHAR(20) default NULL,
	    last_name  VARCHAR(20) default NULL,
	    email  VARCHAR(20) default NULL,
	    password  VARCHAR(20) default NULL,
	    PRIMARY KEY (id)
	    );*/