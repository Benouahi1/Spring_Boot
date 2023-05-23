package com.optigove.project.service;

import com.optigove.project.model.TaxeBoisson;

import java.util.List;

public interface TaxeBoissonService {

    TaxeBoisson create(TaxeBoisson taxeBoisson);

    List<TaxeBoisson> lire();

    String Supprimer(Long id);
}
