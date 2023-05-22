package com.optigove.project.service;

import com.optigove.project.model.Referance;

import java.util.List;

public interface ReferanceService {

    Referance create(Referance referance);

    List<Referance> lire();

    Referance modifier(Long id,Referance referance);

    String supprimer(Long id);
}
