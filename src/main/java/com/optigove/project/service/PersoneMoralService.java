package com.optigove.project.service;

import com.optigove.project.model.PersoneMoral;

import java.util.List;

public interface PersoneMoralService {

    PersoneMoral create(PersoneMoral personeMoral);

    List<PersoneMoral> lire();

    PersoneMoral moudifier(Long id, PersoneMoral personeMoral);

    String suppremer(Long id);


}
