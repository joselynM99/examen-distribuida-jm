package com.distribuida.db;

//import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.Data;



@Entity
@Table(name = "authors")
@Data
@Access(AccessType.FIELD)
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;


}
