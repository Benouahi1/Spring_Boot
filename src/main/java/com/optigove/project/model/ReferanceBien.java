package com.optigove.project.model;


import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "referancebien")


@NoArgsConstructor
public class ReferanceBien {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "Impossable", nullable = false, unique = true, length = 250, updatable = false)
    private String Impossable;
    @Column(name = "Secteur", nullable = false, unique = true, length = 250, updatable = false)
    private String Secteur;
    @Column(name = "Article", nullable = false, unique = true, length = 250, updatable = false)
    private String Article;
    @Column(name = "Percepteur", nullable = false, unique = true, length = 250, updatable = false)
    private String Percepteur;
    @Column(name = "NumeroInterne", nullable = false, unique = true, length = 250, updatable = false)
    private String NumeroInterne;
    @Column(name = "Lieux", nullable = false, unique = true, length = 250, updatable = false)
    private String Lieux;

}
