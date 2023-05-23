package com.optigove.project.service;

import com.optigove.project.model.ReferanceBien;

import java.util.List;

public interface ReferanceBienService {

    ReferanceBien create(ReferanceBien referanceBien);
    List<ReferanceBien> lire();

    String Suppremer(Long id);


}
