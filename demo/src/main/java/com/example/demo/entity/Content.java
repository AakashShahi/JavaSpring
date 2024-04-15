package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name="contents")

public class Content {
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contents_setup_seq_gen")
    @SequenceGenerator(name = "contents_setup_seq_gen", sequenceName = "contents_setup_seq", allocationSize = 1)
    @Id
    private Integer id;

    @Column(name="contentName", nullable = false,length = 125)
    private String contentName;

//    @ManyToOne(fetch = FetchType.LAZY) //or EAGER fetches all data of foreign key representing a table
//    @JoinColumn(name = "information_id", referencedColumnName = "id",
//            foreignKey = @ForeignKey(name = "pk_id_fk_information_id"))
//    private Information information;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "contents_informations",
            foreignKey = @ForeignKey(name = "FK_contents_infromations_id"),
            joinColumns = @JoinColumn(name = "content_id", referencedColumnName = "id"),
            inverseForeignKey = @ForeignKey(name = "FK_contents_informations_id"),
            inverseJoinColumns = @JoinColumn(name = "informations_id", referencedColumnName = "id"),
            uniqueConstraints = @UniqueConstraint(name = "UNIQUE_contents_informations_content_id_information",
                    columnNames = {"content_id", "information_id"})
    )
    private Collection<Information> informations;

}
