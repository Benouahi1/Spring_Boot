package com.optigove.project.model;

import javax.persistence.*;


@Entity
public class TaxeBoisson {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Vent", nullable = false, unique = true, length = 250, updatable = false)
    private String Vent;
    @Column(name = "Toux", nullable = false, unique = true, length = 250, updatable = false)
    private String Toux;
    @Column(name = "Chiffre", nullable = false, unique = true, length = 250, updatable = false)
    private Long Chiffre;

    @Column(name = "Montant", nullable = false, unique = true, length = 250, updatable = false)
    private Float Montant;
}
