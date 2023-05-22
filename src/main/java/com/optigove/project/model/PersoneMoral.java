package com.optigove.project.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personemoral")

@Getter
@Setter
@NoArgsConstructor
public class PersoneMoral {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 150)
    private String Nom;
    @Column(length = 150)
    private String Adress;
    @Column(length = 150)
    private Long Telephone;
    @Column(length = 150)
    private String Email;
    @Column(length = 150)
    private Long Telgsm;
    @Column(length = 150)
    private String Identifiant;
    @Column(length = 150)
    private String Patente;
    @Column(length = 150)
    private String Cnss;
    @Column(length = 150)
    private String Activite;
    @Column(length = 150)
    private String Remarque;
    @Column(length = 150)
    private String Rc;
    @Column(length = 150)
    private String Ice;



}
