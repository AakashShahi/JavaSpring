package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="informations")

public class Information {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "informations_setup_seq_gen")
    @SequenceGenerator(name = "parameter_setup_seq_gen", sequenceName = "informations_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private Integer age;

}
