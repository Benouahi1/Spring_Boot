package com.optigove.project.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "referencecreance")

@Getter
@Setter
@NoArgsConstructor
public class Referance {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "Deligataire", nullable = false, unique = true, length = 250, updatable = false)
    private String Deligataire;
    @Column(name = "Support", nullable = false, unique = true, length = 250, updatable = false)
    private String Support;
    @Column(name = "Numero", nullable = false, unique = true, length = 250, updatable = false)
    private String Numero;
    @Column(name = "Object", nullable = false, unique = true, length = 250, updatable = false)
    private String Object;
    @Column(name = "Adress", nullable = false, unique = true, length = 250, updatable = false)
    private String Adress;
    @Column(name = "libelle", nullable = false, unique = true, length = 250, updatable = false)
    private String Libelle;
    @Column(name = "cin", nullable = false, unique = true, length = 250, updatable = false)
    private String Cin;
    @Column(name = "Montant", nullable = false, unique = true, length = 250, updatable = false)
    private Float Montant;




}
