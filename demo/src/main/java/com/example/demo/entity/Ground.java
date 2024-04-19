package com.example.demo.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="grounds")
@Getter
@Setter

public class Ground {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "grounds_setup_seq_gen")
    @SequenceGenerator(name = "grounds_setup_seq_gen", sequenceName = "grounds_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name = "groundName", nullable = false,length = 100)
    private String groundName;

}
